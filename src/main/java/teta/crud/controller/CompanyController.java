package teta.crud.controller;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teta.crud.dto.CompanyDTO;
import teta.crud.model.Company;
import teta.crud.service.CompanyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/companies")
@ThreadSafe
@AllArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping("/")
    public ResponseEntity<Company> createCompany(
            @Valid @RequestBody CompanyDTO companyDTO) {

        return new ResponseEntity<>(
                companyService.save(companyDTO),
                HttpStatus.CREATED);
    }

    @PutMapping("/{companyId}")
    public ResponseEntity<Company> updateCompany(@PathVariable int companyId,
                                                 @Valid @RequestBody CompanyDTO companyDTO) {
        return new ResponseEntity<>(
                companyService.update(companyDTO, companyId),
                HttpStatus.OK);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<String> deleteCompany(@PathVariable int companyId) {
        companyService.delete(companyId);
        return ResponseEntity.ok(
                String.format("Company with id = %d deleted successfully", companyId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAllCompanies() {
        return new ResponseEntity<>(
                companyService.findAll(),
                HttpStatus.OK);
    }

}
