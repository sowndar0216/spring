package com.bridgeit.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Aop {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
	DemoAop ob=context.getBean(DemoAop.class);
	ob.show();
	
}
}
