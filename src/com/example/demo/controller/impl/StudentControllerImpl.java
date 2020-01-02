package com.example.demo.controller.impl;

import com.example.demo.controller.StudentController;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.util.mvc.Model;
import com.example.demo.util.mvc.ModelAndView;
import com.example.demo.util.mvc.View;


public class StudentControllerImpl implements StudentController {
    private StudentService studentService = new StudentServiceImpl();

    @Override
    public ModelAndView getModel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setModel(studentService.getList());
        return modelAndView;
    }

    @Override
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView("学生页面");
        return modelAndView;
    }

    @Override
    public ModelAndView getModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView("学生页面");
        modelAndView.setModel(studentService.getList());
        return modelAndView;
    }
}
