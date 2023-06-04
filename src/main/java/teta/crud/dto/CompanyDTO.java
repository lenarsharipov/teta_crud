package teta.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * CompanyDto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    @NotBlank(message = "name cannot be blank")
    private String name;

    @NotBlank(message = "phone cannot be blank")
    private String phone;

    @NotBlank(message = "address cannot be blank")
    private String address;
}
