package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import teta.crud.dto.CustomerDTO;
import teta.crud.model.Company;
import teta.crud.model.Customer;
import teta.crud.repository.CompanyRepository;
import teta.crud.repository.CustomerRepository;
import teta.crud.service.CustomerService;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@ThreadSafe
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CompanyRepository companyRepository;

    @Override
    public Customer save(CustomerDTO customerDTO) {
        var foundByPlate = findByVehiclePlate(customerDTO.getVehiclePlate());
        if (foundByPlate.isPresent()) {
            throw new IllegalArgumentException(
                    String.format("%s is occupied by another user",
                            customerDTO.getVehiclePlate()));
        }

        int companyId = customerDTO.getCompanyId();
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isEmpty()) {
            throw new NoSuchElementException(
                    String.format("Company with id = %d is not found", companyId));
        }

        return customerRepository.save(
                new Customer(
                        null,
                        customerDTO.getName(),
                        customerDTO.getSurname(),
                        customerDTO.getVehiclePlate(),
                        company.get()));
    }

    @Override
    public Customer update(CustomerDTO customerDTO, int customerNumber) {
        var customerOptional = findByCustomerNumber(customerNumber);
        if (customerOptional.isEmpty()) {
            throw new NoSuchElementException(
                    String.format("Customer with id = %d is not found", customerNumber));
        }

        int companyId = customerDTO.getCompanyId();
        var company = companyRepository.findById(companyId);
        if (company.isEmpty()) {
            throw new NoSuchElementException(
                    String.format("Company with id = %d is not found", companyId));
        }

        var updatedCustomer = customerOptional.get();
        updatedCustomer.setName(customerDTO.getName());
        updatedCustomer.setSurname(customerDTO.getSurname());
        updatedCustomer.setVehiclePlate(updatedCustomer.getVehiclePlate());
        updatedCustomer.setCompany(company.get());
        return updatedCustomer;
    }

    @Override
    public Optional<Customer> findByCustomerNumber(Integer customerNumber) {
        return customerRepository.findByCustomerNumber(customerNumber);
    }

    @Override
    public Optional<Customer> findByVehiclePlate(String vehiclePlate) {
        return customerRepository.findByVehiclePlate(vehiclePlate);
    }
}
