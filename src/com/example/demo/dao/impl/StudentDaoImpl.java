package com.example.demo.dao.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.util.db.DButil;

import java.util.List;
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> getList() {
        String sql = "select * from student";
        Object[] object = {};
        return DButil.excuteDML(sql,object);
    }
}
