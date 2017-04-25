package API_Automation.gittest1;



import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Test;
import junit.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
  WebDriver driver;
  String url = "http://www.google.com";
  
  @Before
  public void test1(){
	  System.setProperty("webdriver.chrome.driver", "C:/temp/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get(url);
  }
  
}
