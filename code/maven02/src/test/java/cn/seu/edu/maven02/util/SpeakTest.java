package cn.seu.edu.maven02.util;

import org.junit.*;
import org.junit.Assert.*;

public class SpeakTest{
	@Test
	public void testSaiHi() {
		Assert.assertEquals("Hello world!", new Speak().saiHai());
	}
}