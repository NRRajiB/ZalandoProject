package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFive2 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	Actions a=new Actions (driver);
	WebElement M1 = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	a.moveToElement(M1).perform();
	WebElement M2 = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	a.moveToElement(M2).perform();
	M2.click();
	String windowHandle = driver.getWindowHandle();		
	Set<String> windowHandles = driver.getWindowHandles();
	for (String x : windowHandles) {
		if(!windowHandle.equals(x)) {
			driver.switchTo().window(x);
		}
	}
	WebElement M3 = driver.findElement(By.xpath("(//span[text()='ANKERITE NO.1 BODY GROW 500GM'])[1]"));
	M3.click();
	String windowHandle1 = driver.getWindowHandle();		
	Set<String> windowHandles1 = driver.getWindowHandles();
	for (String x1 : windowHandles1) {
		if(!windowHandle.equals(x1)) {
			driver.switchTo().window(x1);
		}
	}
	WebElement M4 = driver.findElement(By.xpath("//button[text()='Add To Cart']"));
	M4.click();
	WebElement M6 = driver.findElement(By.xpath("//a[@class='cart_ic']"));
	M6.click();
	WebElement M5 = driver.findElement(By.xpath("(//span[text()='Rs 619'])[3]"));
	System.out.println(M5.getText());
	}
}
