package com.sample.azuregithub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
public class GithubController {

    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1L,"shahbaz"));
        studentList.add(new Student(2L,"nawaz"));
        studentList.add(new Student(3L,"syed"));
        studentList.add(new Student(4L,"test"));
    }

    @GetMapping
    public List<Student> getStudents() throws Exception {
        log.info("Get All Students..");
        studentList.forEach(student ->{
            System.out.println("ID: "+ student.getId());
            System.out.println("NAME: "+ student.getName());
        });
        throw new Exception("Exception test");
//        return studentList;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentList.add(student);
        return "Student added";
    }

}
