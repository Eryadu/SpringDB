package io.pragra.feb25jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class StudentJPA {
    @Id
    private int id;
    //@Transient we can use this if we don't want to store name in Db, it stores data temp.
    private String name;
    private String email;

    public StudentJPA(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
