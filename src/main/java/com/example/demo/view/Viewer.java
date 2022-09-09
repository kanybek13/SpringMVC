package com.example.demo.view;


import com.example.demo.controller.Controller;
import org.springframework.stereotype.Component;

@Component    //Создает контейнер com.example.demo.view.Viewer@514eedd8
public class Viewer {
    private final Controller controller; // Внедрения через конструктор
    public Viewer(Controller controller) {
        this.controller = controller;
        System.out.println(this);
        System.out.println("1 "+this.controller);
    }
}
