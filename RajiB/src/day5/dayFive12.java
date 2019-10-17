package day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dayFive12 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sprint.com/");
	Actions a=new Actions(driver);
	Thread.sleep(5000);
WebElement mac1 = driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[4]"));
a.moveToElement(mac1).perform();
WebElement mac2 = driver.findElement(By.xpath("(//a[@href='/en/my-sprint/payment-center.html?INTNAV=TopNav:MyS:Paybill#/make-a-payment'])[2]"));
a.moveToElement(mac2).perform();
mac2.click();
}
}
