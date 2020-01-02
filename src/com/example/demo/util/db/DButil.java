package com.example.demo.util.db;

import com.example.demo.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DButil {
    private static final String URL="jdbc:mysql://localhost:3306/homework?serverTimezone=GMT%2B8";
    private static final String USER="root";
    private static final String PASSWORD="123456";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("数据库连接异常");
        }
        return connection;
    }

    public static List<Student> excuteDML(String sql, Object...objects){
        PreparedStatement preparedStatement = null;
        Connection connection = getConnection();
        int num = 0;
        Student student = null;
        List<Student> students = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (Object object:objects){
                preparedStatement.setObject(++num,object);
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                students.add(student);
            }

        } catch (SQLException e) {
            System.out.println("数据库操作异常");
        }
        return students;
    }

}
