package io.pragra.feb25jpa.hibernateManual;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable // this is used to embedded value in other table
public class AlienName {
    private String fname;
    private String lname;
    private String mname;

}
