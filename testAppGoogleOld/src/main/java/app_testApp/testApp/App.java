package app_testApp.testApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import junit.framework.*;

/**
 * Hello world!
 *
 */
public class App 
{
	 static WebDriver driver;
	
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }


	public static  void google(){
		System.setProperty("webdriver.chrome.driver", "c:/temp/chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://www.google.com";
		driver.get(url);
		driver.quit();
	}
	
	public static String getHelloWorld() {

		return "Hello World";

	}

	public static String getHelloWorld2() {

		return "Hello World 2";

	}
}
