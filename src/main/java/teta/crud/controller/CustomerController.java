package teta.crud.controller;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teta.crud.dto.CustomerDTO;
import teta.crud.dto.SearchDTO;
import teta.crud.model.Customer;
import teta.crud.service.CustomerService;
import teta.crud.service.SearchService;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
@ThreadSafe
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    private final SearchService searchService;

    @PostMapping("/")
    public ResponseEntity<Customer> createCustomer(
            @Valid @RequestBody CustomerDTO customerDTO) {

        return new ResponseEntity<>(
                customerService.save(customerDTO),
                HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable int customerId,
            @Valid @RequestBody CustomerDTO customerDTO) {

        return new ResponseEntity<>(
                customerService.update(customerDTO, customerId),
                HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<?> getCustomerBy(@Valid @RequestBody SearchDTO searchDTO) {
        var searcher = searchService.getSearcher(searchDTO);
        return new ResponseEntity<>(
                searcher.findBy(searchDTO),
                HttpStatus.OK);
    }
}
