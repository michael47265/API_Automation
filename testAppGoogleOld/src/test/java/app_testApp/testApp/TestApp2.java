package app_testApp.testApp;

import org.junit.Test;

import junit.framework.Assert;

public class TestApp2 {

	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}