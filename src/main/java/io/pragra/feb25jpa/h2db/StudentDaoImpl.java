package io.pragra.feb25jpa.h2db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // RowMapper to map result set to Student object
    private final RowMapper<Student> rowMapper = ( rs,rowNum) -> {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setName(rs.getString("age"));
        return student;
    };
    @Override
    public List<Student> getAllStudents() {
        return jdbcTemplate.query("SELECT * FROM STUDENT", rowMapper);
    }

    @Override
    public void createStudent(Student student) {
        jdbcTemplate.update("INSERT INTO STUDENT (id,name,age) values (?, ?, ?)",
                                    student.getId(),student.getName(),student.getAge());
    }

    @Override
    public void updateStudent(Student student) {
        jdbcTemplate.update("UPDATE STUDENT SET name=?, age=? where id=?",
                            student.getName(),student.getAge(),student.getId());
    }

    @Override
    public void deleteStudent(Integer id) {
        jdbcTemplate.update("DELETE FROM STUDENT WHERE id=?",id);
    }

    @Override
    public Student getStudentById(Integer id) {
        Student student= jdbcTemplate.queryForObject("SELECT * FROM STUDENT Where id=?", rowMapper,id);
        return student;
    }
}
