package com.devblogs.execute;

import org.junit.BeforeClass;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class AbstractTest {
	protected static ConfigurableApplicationContext context = null;

	@BeforeClass
	public static void beforeClass() {
		context = new ClassPathXmlApplicationContext("context.xml");
	}
}