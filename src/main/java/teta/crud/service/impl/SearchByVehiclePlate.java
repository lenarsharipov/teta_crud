package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import teta.crud.dto.SearchDTO;
import teta.crud.model.Customer;
import teta.crud.repository.CustomerRepository;
import teta.crud.service.Searcher;

import java.util.List;

@AllArgsConstructor
public class SearchByVehiclePlate implements Searcher<List<Customer>> {
    private static final Integer BY_PLATE_MODE = 3;

    private final CustomerRepository customerRepository;

    @Override
    public boolean isValid(SearchDTO searchDto) {
        return searchDto.getSearchMode().equals(BY_PLATE_MODE)
                && searchDto.getVehiclePlate() != null;
    }

    @Override
    public List<Customer> findBy(SearchDTO searchDto) {
        return customerRepository.findByCompanyIdAndVehiclePlateUsingLevenshtein(
                searchDto.getCompanyId(),
                searchDto.getVehiclePlate());
    }

}
