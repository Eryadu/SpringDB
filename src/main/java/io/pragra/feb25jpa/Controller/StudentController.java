package io.pragra.feb25jpa.Controller;

import io.pragra.feb25jpa.entities.StudentJPA;
import io.pragra.feb25jpa.services.StudentServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController () // //@Controller, @ ResponseBody
@RequestMapping("/student") // class level RequestMapping

// TomCat is webserver which sit on door(port 8080) and listen http(internet) request(http://localhost:8080), then
// search for class level @RequestMapping in root directory of java code and then search for method level @RequestMapping
// ("/getAll") to map with http method (GET,POST,PUT,DELETE)
public class StudentController {

    @Autowired
    StudentServiceTest studentServiceTest;

    //@RequestMapping(method = RequestMethod.GET, path = "/getAll")
    // @GetMapping is alternative/more precise for @requestMapping with requestMethod.GET
    @GetMapping(path = "/getAll")
    public List<StudentJPA> getAllStudents(){
        return studentServiceTest.getAllStudents();
    }

    @PostMapping( "/createAll")
    public String createStudent()
    {
        studentServiceTest.createStudent();
        return "Student created";
    }

    @PutMapping("/updateAll")
    public void updateStudent()
    {
        studentServiceTest.updateStudent();
    }

}
