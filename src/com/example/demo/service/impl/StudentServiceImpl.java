package com.example.demo.service.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.impl.StudentDaoImpl;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> getList() {
        return studentDao.getList();
    }
}
