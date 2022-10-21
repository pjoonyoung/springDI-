package com.joonyoung.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		MyInfo myInfo1 = ctx.getBean("myInfo1", MyInfo.class);
		
		myInfo1.getInfoOutput();
		
		MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
		
		myInfo2.getInfoOutput();
		
		ctx.close();
	}

}
