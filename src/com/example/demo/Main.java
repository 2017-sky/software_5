package com.example.demo;

import com.example.demo.util.mvc.DispatcherServlet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("/list   表示前端获取到json数据");
        System.out.println("/listview  表示页面转换到接口对应的页面同时显示数据");
        System.out.println("/view    表示转到接口对应的前端页面");
        System.out.println("请模拟发送请求");
        Scanner scanner = new Scanner(System.in);
        String request = scanner.next();
        DispatcherServlet.doDipatcher(request);

    }


}
