package io.pragra.feb25jpa.hibernateManual;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "alien_Table") // is permanent as its for hibernate
@Table(name = "alien_Table") // is optional, would be same with entity or different as shown in database query
public class Alien {

    @Id
    //@Column(name="a_ID")
    private int aid;
    //@Transient // don't save name in Db, it save data temporary
    //@Column(name="a_Name")
    //private AlienName aname;
    private String aname;
    private int amark;
    //@Column(name="a_Tech")
    private String atech;
}
