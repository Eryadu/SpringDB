package io.pragra.feb25jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.sql.In;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="INST")
public class Instructor {
    @Id
    private Integer id;
    @Column (unique = true, nullable = false , name = "NAME", length = 50)
    private String firstName;
    private String lastName;
    @Column (unique = true , nullable = false)
    private String phoneNumber;
    private String email;

}
