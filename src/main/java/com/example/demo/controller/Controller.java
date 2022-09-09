package com.example.demo.controller;



import com.example.demo.model.Model;
import org.springframework.stereotype.Component;

@Component
public class Controller {
private final Model model; //Внедрения модели
    public Controller(Model model) {
        this.model=model;
        System.out.println(this);
        System.out.println("2 "+this.model);
    }
}
