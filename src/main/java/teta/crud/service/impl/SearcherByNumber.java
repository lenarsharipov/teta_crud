package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import teta.crud.dto.SearchDTO;
import teta.crud.model.Customer;
import teta.crud.repository.CustomerRepository;
import teta.crud.service.Searcher;

import java.util.Optional;

@AllArgsConstructor
public class SearcherByNumber implements Searcher<Optional<Customer>> {
    private static final Integer BY_NUMBER = 2;

    private final CustomerRepository customerRepository;

    @Override
    public boolean isValid(SearchDTO searchDto) {
        return searchDto.getSearchMode().equals(BY_NUMBER)
                && searchDto.getCustomerNumber() != null;
    }

    @Override
    public Optional<Customer> findBy(SearchDTO searchDto) {
        return customerRepository.findByCustomerNumberAndCompanyId(
                searchDto.getCustomerNumber(),
                searchDto.getCompanyId());
    }
}
