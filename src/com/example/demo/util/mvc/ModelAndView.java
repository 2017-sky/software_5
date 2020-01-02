package com.example.demo.util.mvc;

public class ModelAndView {
    private Model model;
    private View view;

    public ModelAndView() {
    }

    public ModelAndView(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = new Model(model);
    }

    public View getView() {
        return view;
    }

    public void setView(String view) {
        this.view = new View(view);
    }

    @Override
    public String toString() {
        String modelandview = "ModelAndView{" + "model=" + model + ", view=" + view + '}';
        String model = "ModelAndView{" + "model=" + this.model + '}';
        String view = "ModelAndView{" + "view=" + this.view + '}';
        if (this.model != null){
            if (this.view != null){
                return modelandview;
            }else {
                return model;
            }
        }else {
            if (this.view != null){
                return view;
            }else {
                return "未找到对应的ModelAndView";
            }
        }



    }
}
