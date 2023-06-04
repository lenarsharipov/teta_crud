package teta.crud.service;

import teta.crud.dto.CustomerDTO;
import teta.crud.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer save(CustomerDTO customerDTO);

    Customer update(CustomerDTO customerDTO, int customerNumber);

    Optional<Customer> findByCustomerNumber(Integer customerNumber);

    Optional<Customer> findByVehiclePlate(String vehiclePlate);

}
