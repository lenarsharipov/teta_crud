package teta.crud.service.impl;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import teta.crud.dto.CompanyDTO;
import teta.crud.model.Company;
import teta.crud.repository.CompanyRepository;
import teta.crud.service.CompanyService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
@ThreadSafe
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public Company save(CompanyDTO companyDTO) {
        var company = new Company(
                null,
                companyDTO.getName(),
                companyDTO.getPhone(),
                companyDTO.getAddress());
        return companyRepository.save(company);
    }

    @Override
    public Company update(CompanyDTO companyDTO, int companyId) {
        var company = validateCompanyExists(companyId);
        company.setName(companyDTO.getName());
        company.setPhone(companyDTO.getPhone());
        company.setAddress(companyDTO.getAddress());
        return companyRepository.save(company);
    }

    @Override
    public void delete(int companyId) {
        validateCompanyExists(companyId);
        companyRepository.deleteById(companyId);
    }

    @Override
    public Optional<Company> findById(int companyId) {
        return companyRepository.findById(companyId);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    private Company validateCompanyExists(int companyId) {
        var companyOptional = findById(companyId);
        if (companyOptional.isEmpty()) {
            throw new NoSuchElementException(
                    String.format("Company with id = %d is not found", companyId));
        }
        return companyOptional.get();
    }
}
