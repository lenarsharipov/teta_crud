package teta.crud.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import teta.crud.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;

import teta.crud.service.impl.*;
import teta.crud.service.Searcher;

import java.util.List;

/**
 * Searchers config.
 */
@Configuration
public class SearcherConfig {
    @Autowired
    private CustomerRepository customerRepository;

    @Bean
    public List<Searcher<?>> searchers() {
        return List.of(
                new SearcherByName(customerRepository),
                new SearcherByNumber(customerRepository),
                new SearchByVehiclePlate(customerRepository)
        );
    }
}
