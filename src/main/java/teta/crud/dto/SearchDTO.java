package teta.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * SearchDto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO {

    public static final int TOTAL_SEARCH_MODES = 3;

    /**
     * Mandatory field.
     *
     * Search modes:
     * 1 - Search by name and surname. Returns List of Subscribers.
     * 2 - Search by customer's number. Returns Optional of Subscriber.
     * 3 - Search by vehicle plate. Returns List of Subscribers.
     */
    @Min(value = 1, message = "searchMode cannot be less than 1")
    @Max(value = TOTAL_SEARCH_MODES,
            message = "searchMode shall be in between 1 and " + TOTAL_SEARCH_MODES)
    @NotNull(message = "searchMode cannot be null")
    private Integer searchMode;

    /**
     * Mandatory, if searchMode == 1
     */
    private String name;

    /**
     * Mandatory, if searchMode == 1
    */
    private String surname;

    /**
     * Mandatory, if searchMode == 2
     */
    private Integer customerNumber;

    /**
     * Mandatory, if searchMode == 3
     */
    private String vehiclePlate;

    /**
     * Mandatory field.
     */
    @Positive(message = "company id cannot be less than 1")
    @NotNull(message = "searchMode cannot be null")
    private Integer companyId;
}
