package com.bridgeit.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy

public class DemoAop {
public void show() {
	System.out.println("sowndar");
	/*
	 * 
	 */
}
}
