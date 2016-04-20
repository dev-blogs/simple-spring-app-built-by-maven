package com.devblogs.execute;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import com.devblogs.component.figure.Circle;

@ContextConfiguration("classpath:context.xml")
public class CircleTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private Circle circle;

	@Before
	public void init() {
		circle.setRadius(10);
	}

	@Test
	public void test() {
		Assert.assertEquals(314, (int) circle.getSquare());
	}
}