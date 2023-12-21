package org.NextInn.ambiguityCI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambigciconf.xml");
        Addition add= (Addition) context.getBean("add");

        add.doSum();

    }
}