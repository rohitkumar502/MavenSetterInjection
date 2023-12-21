//package org.NextInn.lifecycle;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test2 {
//    public static void main(String[] args) {
//
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcconf.xml");
//        context.registerShutdownHook();
//
//        Pepsico p1 = (Pepsico) context.getBean("p1");
//        System.out.println(p1);
//
//
//
//    }
//}
