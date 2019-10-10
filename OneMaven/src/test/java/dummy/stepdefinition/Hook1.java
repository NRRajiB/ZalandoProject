package dummy.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook1 {
	static WebDriver driver;
	@Before
	public static void launch_browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\OneMaven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
@After
public static void quit_browser() throws InterruptedException {	

System.out.println("done");
}
}
