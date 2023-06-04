package teta.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Customer model
 */
@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer customerNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "vehicle_plate", nullable = false, unique = true)
    @EqualsAndHashCode.Include
    private String vehiclePlate;

    @ManyToOne
    @JoinColumn(
            name = "company_id",
            foreignKey = @ForeignKey(name = "COMPANY_ID_FK"),
            nullable = false
    )
    private Company company;
}
