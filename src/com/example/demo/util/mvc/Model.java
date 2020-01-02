package com.example.demo.util.mvc;

public class Model {
    private Object object;

    public Model(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Model{" +
                "object=" + object +
                '}';
    }
}
