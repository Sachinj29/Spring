package org.sachin;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

//    public Laptop(){
//        System.out.println("Laptop is starting.");
//    }

    @Override
    public void compile(){
        System.out.println("Compiling Using Laptop....");
    }

}
