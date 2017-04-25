package app_testApp.testApp;

//import junit.framework.Assert;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
		driver.findElement(By.id("lst-ib")).sendKeys("2 + 3\n");
		wait(4000);
		String result= driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]")).getText();
		System.out.println("result is --------: " + result);
		driver.quit();
		Assert.assertEquals("6",result);
	}
	
	public static String getHelloWorld() {

		return "Hello World";

	}

	public static String getHelloWorld2() {

		return "Hello World 2";

	}
	public static void wait(int delay){
		try{
		Thread.sleep(delay);}
		catch(Exception e){System.out.println(e);
	}
	}

}
