package com.tr.ggo.practice.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {


	/**
	 * creating a Message object in  Bean.xml, assuming that the resources folder is in the class path
	 * @param args
	 */
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("xml/HelloBean.xml");
      Message obj = (Message) context.getBean("msg");
      obj.getMessage();
   }
   
}