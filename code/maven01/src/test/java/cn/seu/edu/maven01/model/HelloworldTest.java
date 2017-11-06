package cn.seu.edu.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloworldTest{
	@Test
	public void testHelloWorld() {
		Assert.assertEquals("Hello world!", new Helloworld().sayHello());
	}
}