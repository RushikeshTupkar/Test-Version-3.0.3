package com.example.TestVersion.service;

import com.example.TestVersion.repository.IStudentRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    public void updateStudent(JSONObject jsonObject) {
//        iStudentRepository.updateStudent(jsonObject.getString("fName"),jsonObject.getInt("id"));
//        iStudentRepository.deleteByFName("Rushikesh");
        String fName =jsonObject.getString("fName");
        String lName = jsonObject.getString("lName");
        Integer id = jsonObject.getInt("id");
        iStudentRepository.updateByFName(fName,lName,id);
    }

    public void deleteStudent(Integer id) {
        iStudentRepository.deleteByFName(id);
    }
}
