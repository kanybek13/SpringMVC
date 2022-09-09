package com.example.demo.model;

import com.example.demo.view.Viewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Model {

    @Lazy
    @Autowired
private Viewer viewer;
    public Model() {

        System.out.println(this);
        System.out.println("3 "+this.viewer);
    }

}
