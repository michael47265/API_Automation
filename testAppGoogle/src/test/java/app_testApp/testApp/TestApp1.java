package app_testApp.testApp;


import junit.framework.TestCase;
import junit.framework.TestSuite;
//import org.junit.Test;
import junit.framework.Assert;

public class TestApp1 {

	
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}
	
	
	public void testGoogle(){
		App.google();
	}

}