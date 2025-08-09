package org.sachin.Config;

import org.sachin.Alien;
import org.sachin.Computer;
import org.sachin.Desktop;
import org.sachin.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
        //return new Alien();
    }


    //Qualifire
//    public Alien alien(@Qualifier("desktop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//        //return new Alien();
//    }


    // Autowire
//    public Alien alien(@Autowired Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//        //return new Alien();
//    }

    //@Bean(name = "com1")                               // Assign Single Name to the Bean
    //@Bean(name = {"com1","Beast","Sachin"})             //Assign Multiple Names to Bean using Array.
    //@Scope("prototype")                       //Create new Instance for Single bean Defination and it is by default "Singletone"
    @Bean
    public Desktop desktop(){
        return  new Desktop();
    }

    @Bean
    @Primary                            // Give a First Prefrenece to the Laptop.
    public Laptop laptop(){
        return new Laptop();
    }
}
