package com.example.TestVersion.repository;

import com.example.TestVersion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
    @Modifying
    @Transactional
    @Query("Delete from Student where where id=:id")
    public Integer deleteByFName(Integer id);


    @Modifying
    @Transactional
    @Query("update Student set fName = :fName,lName =:lName  where id=:id")
    public Integer updateByFName(String fName,String lName,Integer id);
}
