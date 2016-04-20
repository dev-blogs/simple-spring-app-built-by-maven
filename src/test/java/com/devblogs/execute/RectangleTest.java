package com.devblogs.execute;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.devblogs.component.figure.Rectangle;

public class RectangleTest extends AbstractTest {
	private Rectangle rectangle;

	@Before
	public void setUp() throws Exception {
		rectangle = context.getBean(Rectangle.class);
		rectangle.setWidth(10);
		rectangle.setLength(10);
	}

	@Test
	public void test() {
		Assert.assertEquals(100, (int) rectangle.getSquare());
	}
}