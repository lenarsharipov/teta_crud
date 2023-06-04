package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import teta.crud.dto.SearchDTO;
import teta.crud.model.Customer;
import teta.crud.repository.CustomerRepository;
import teta.crud.service.Searcher;

import java.util.List;

@AllArgsConstructor
public class SearcherByName implements Searcher<List<Customer>> {
    private static final Integer BY_NAME_MODE = 1;

    private final CustomerRepository customerRepository;

    @Override
    public boolean isValid(SearchDTO searchDto) {
        return searchDto.getSearchMode().equals(BY_NAME_MODE)
                && searchDto.getName() != null
                && searchDto.getSurname() != null;
    }

    @Override
    public List<Customer> findBy(SearchDTO searchDto) {
        return customerRepository.findByNameAndSurnameAndCompanyId(
                searchDto.getName(),
                searchDto.getSurname(),
                searchDto.getCompanyId());
    }

}
