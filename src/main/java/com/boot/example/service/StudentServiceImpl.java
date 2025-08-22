package com.boot.example.service;

import com.boot.example.domain.Student;
import com.boot.example.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentMapper studentMapper;

    @Override
    public List<Student> studentList() {
        List<Student> studentList = studentMapper.studentList();
        return studentList;
    }

    @Override
    public int studentInsert(Student student) {
        return studentMapper.studentInsert(student);
    }
}
