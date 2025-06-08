package io.pragra.feb25jpa.hibernateManual;

import io.pragra.feb25jpa.h2db.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class StudentLap {
    private String sname;
    @Id
    private int srollno;
    private int smarks;
    /*@OneToOne
    @JoinColumn(name = "laptop_lid")
    private Laptop laptop;*/

    /*@ManyToMany (mappedBy = "studentLap")
   private List<Laptop> laptops = new ArrayList<>();*/

    @OneToMany (mappedBy = "studentLap")
    private List<Laptop> laps = new ArrayList<>();


}
