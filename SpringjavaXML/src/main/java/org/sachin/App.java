package org.sachin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        //obj.setAge(22);
        System.out.println(obj.getAge());
        obj.code();

//
//        Alien obj1 = (Alien) context.getBean("alien1");
//       // obj1.age = 22;
//        System.out.println(obj1.age);
//        //System.out.println( "Hello World!" );
    }
}
