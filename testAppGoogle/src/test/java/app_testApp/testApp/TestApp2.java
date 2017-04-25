package app_testApp.testApp;

import junit.framework.Assert;

public class TestApp2 {

	
	public void testPrintHelloWorld2() {
		System.out.println("----------------- in testPrintHelloWorld2");
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}