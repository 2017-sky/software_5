package com.example.demo.controller;

import com.example.demo.util.mvc.Model;
import com.example.demo.util.mvc.ModelAndView;
import com.example.demo.util.mvc.View;


public interface StudentController {

    ModelAndView getModel();
    ModelAndView getView();
    ModelAndView getModelAndView();
}
