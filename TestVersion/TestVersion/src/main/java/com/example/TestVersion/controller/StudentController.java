package com.example.TestVersion.controller;

import com.example.TestVersion.service.StudentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController{
    @Autowired
    private StudentService service;
    @PutMapping("/update")
    public void update(@RequestBody String student){
        JSONObject jsonObject = new JSONObject(student);
        service.updateStudent(jsonObject);
    }

    @DeleteMapping("/delete/{id}")
    public void update(@PathVariable Integer id){
        service.deleteStudent(id);
    }

}
