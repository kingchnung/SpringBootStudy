package com.boot.example.mapper;

import com.boot.example.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> studentList();
    public int studentInsert(Student student);
}
