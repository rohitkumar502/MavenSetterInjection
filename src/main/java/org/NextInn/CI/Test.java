package org.NextInn.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
    {
		ApplicationContext  context = new ClassPathXmlApplicationContext("ciconfig.xml");
		Student st1 =(Student) context.getBean("student1");
		 System.out.println(st1);

		Student st2 =(Student) context.getBean("student2");
		System.out.println(st2);

	}
} 