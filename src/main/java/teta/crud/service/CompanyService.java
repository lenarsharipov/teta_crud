package teta.crud.service;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Repository;
import teta.crud.dto.CompanyDTO;
import teta.crud.model.Company;

import java.util.List;
import java.util.Optional;

/**
 * Company service
 */
public interface CompanyService {

    Company save(CompanyDTO companyDTO);

    Company update(CompanyDTO companyDTO, int companyId);

    void delete(int companyId);

    Optional<Company> findById(int companyId);

    List<Company> findAll();

}
