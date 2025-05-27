package io.pragra.feb25jpa.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Alien {

    @Id
    @Column(name="a_ID")
    private int aid;
    @Column(name="a_Name")
    private String aname;
    @Column(name="a_Tech")
    private String atech;
}
