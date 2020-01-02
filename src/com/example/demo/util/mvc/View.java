package com.example.demo.util.mvc;

public class View {
    private String view;

    public View(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "View{" +
                "view='" + view + '\'' +
                '}';
    }
}
