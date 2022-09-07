package com.tolgaocal80;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring congiguration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		if (theCoach.equals(alphaCoach)) {
			System.out.println("theCoach equals alphaCoach");
		}else {
			System.out.println("theCoach doesn't equal alphaCoach");
		}
		System.out.println("Scope: "+context.getBeanFactory().getBeanDefinition("myCoach").getScope());
		
		
		context.close();
		
	}

}



















