package com.example.demo.util.mvc;

import com.example.demo.controller.StudentController;
import com.example.demo.controller.impl.StudentControllerImpl;

public class DispatcherServlet {
    private static final StudentController CONTROLLER = new StudentControllerImpl();

    public static void doDipatcher(String request){
        switch (request){
            case "/list" : System.out.println(CONTROLLER.getModel());break;
            case "/view" : System.out.println(CONTROLLER.getView());break;
            case "/listview" : System.out.println(CONTROLLER.getModelAndView());break;
            default: System.out.println("请求异常");
        }
    }


}
