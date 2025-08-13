package org.sachin;


import org.sachin.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       // System.out.println("Hii Spring");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // Desktop dt = context.getBean("com1",Desktop.class);  // This is for Bean Name

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();


        Alien obj = (Alien) context.getBean(Alien.class);
        //obj.setAge(22);
        System.out.println(obj.getAge());
        obj.code();

    }
}
