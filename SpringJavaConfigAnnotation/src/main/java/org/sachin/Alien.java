package org.sachin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {

    private  int age;
    // private Laptop lap =  new Laptop();

    @Autowired
    @Qualifier("desktop")
    private Computer com;

    public Alien(){
        System.out.println("Alien Object Created.");
    }

//    public Alien(int age){
//        System.out.println("parameterized Constructor Called...");
//        this.age = age;
//    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding..");
        com.compile();
    }
}