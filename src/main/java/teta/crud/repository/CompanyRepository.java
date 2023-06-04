package teta.crud.repository;

import net.jcip.annotations.ThreadSafe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import teta.crud.model.Company;

import java.util.List;
import java.util.Optional;

@ThreadSafe
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
    List<Company> findAll();

    Optional<Company> findByName(String name);

}
