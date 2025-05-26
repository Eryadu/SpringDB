package io.pragra.feb25jpa.h2db;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.sql.In;

@Data
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String age;

    public Student(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
