package teta.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    @NotBlank(message = "name cannot be blank, null")
    private String name;

    @NotBlank(message = "surname cannot be blank")
    private String surname;

    @NotBlank(message = "vehicle plate cannot be blank")
    private String vehiclePlate;

    @NotNull(message = "company id cannot be null")
    @Positive(message = "id should be positive number")
    private Integer companyId;
}
