//package org.NextInn.lifecycle;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test
//{
//	public static void main(String[] args)
//    {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcconf.xml");
//
//		Apple apple1 = (Apple)context.getBean("apple1");
//		System.out.println(apple1);
//
//		Apple apple2 = (Apple)context.getBean("apple2");
//		System.out.println(apple2);
//		context.registerShutdownHook();
//
//
//
//
//	}
//}