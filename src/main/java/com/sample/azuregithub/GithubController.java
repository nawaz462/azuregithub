package com.sample.azuregithub;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class GithubController {

    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1L,"syed"));
        studentList.add(new Student(2L,"nawaz"));
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentList;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentList.add(student);
        return "Student added";
    }

}
