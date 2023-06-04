package teta.crud.repository;

import net.jcip.annotations.ThreadSafe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import teta.crud.model.Customer;

import java.util.Optional;
import java.util.List;

@Repository
@ThreadSafe
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Optional<Customer> findByCustomerNumber(Integer customerNumber);

    Optional<Customer> findByVehiclePlate(String vehiclePlate);

    List<Customer> findByNameAndSurnameAndCompanyId(String name, String surname, Integer companyId);

    Optional<Customer> findByCustomerNumberAndCompanyId(Integer customerNumber, Integer companyId);

    @Query(nativeQuery = true,
            value = """
                    SELECT *
                    FROM customers
                    WHERE company_id = ?1
                    AND levenshtein(vehicle_plate, ?2) <= 2
                    """)
    List<Customer> findByCompanyIdAndVehiclePlateUsingLevenshtein(
            Integer companyId, String vehiclePlate);
}
