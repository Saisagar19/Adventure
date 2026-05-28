package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

		/*
		 * Vodafone voda = new Vodafone(); voda.calling(); voda.data();
		 * 
		 * Jio jio = new Jio(); jio.calling(); jio.data();
		 */

//		Sim sim = new Jio(); // polymorphic call // ImP
//		sim.calling();
//		sim.data();

		// Using Vodafone Bean
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Vodafone v = context.getBean(Vodafone.class, "voda");
//		v.calling();
//		v.data();
		// Using Jio Bean
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Jio j = context.getBean(Jio.class, "jio");
//		j.calling();
//		j.data();

//		Using Sim Bean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean(Sim.class, "sim");
		sim.calling();
		sim.data();
	}

}
