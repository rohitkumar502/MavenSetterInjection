package org.NextInn.gfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demoapp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("gfg-config.xml");

        Employee myemployee = (Employee)context.getBean("employeeBean");

        System.out.println(myemployee);

    }
}