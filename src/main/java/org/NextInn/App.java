package org.NextInn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");

        Student st1 = (Student) context.getBean("student1");
        System.out.println(st1);

        Student st2 = (Student) context.getBean("student2");
        System.out.println(st2);

        Student st3 = (Student) context.getBean("student3");
        System.out.println(st3);

        Student st4 = (Student) context.getBean("student4");
        System.out.println(st4);

        Student st5 = (Student) context.getBean("student5");
        System.out.println(st5);

        Student st6 = (Student) context.getBean("student6");
        System.out.println(st6);

        Student st7 = (Student) context.getBean("student7");
        System.out.println(st7);


    }
}
