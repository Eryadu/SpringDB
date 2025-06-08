package io.pragra.feb25jpa.hibernateManual;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Laptop {
    @Id
    private int lid;
    private String lname;

    //@OneToMany
    //private StudentLap studentLap;

    @ManyToOne
    private StudentLap studentLap;

    /*@ManyToMany
    private List<StudentLap> studentLap = new ArrayList<>();*/
}
