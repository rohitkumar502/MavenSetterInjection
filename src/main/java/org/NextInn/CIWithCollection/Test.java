package org.NextInn.CIWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("cicollectionconf.xml");
        Echo echo1= (Echo) context.getBean("echo1");
        System.out.println(echo1);

        Echo echo3= (Echo) context.getBean("echo3");
        System.out.println(echo3);


    }
}