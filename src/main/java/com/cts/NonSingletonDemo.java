package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NonSingletonDemo {
	private static Logger logger = LoggerFactory.getLogger(NonSingletonDemo.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(NonSingletonConfig.class);

		Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
		Singer singer2 = ctx.getBean("nonSingleton", Singer.class);

		logger.info("Identity Equal?: " + (singer1 == singer2));
		logger.info("Value Equal:? " + singer1.equals(singer2));
		logger.info("{}", singer1);
		logger.info("{}", singer2);
	}

}
