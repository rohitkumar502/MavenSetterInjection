package org.NextInn.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcconf.xml");
        context.registerShutdownHook();

        Coke coke = (Coke) context.getBean("coke");
        System.out.println(coke);



    }
}
