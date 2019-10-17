package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dayFive3 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> emp=new ArrayList();
	emp.addAll(windowHandles);
	driver.switchTo().window(emp.get(0));
	WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions a=new Actions(driver);
	a.moveToElement(course).perform();
	WebElement m2 = driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/software-testing.html'])"));
	a.moveToElement(m2).perform();
	WebElement m3 = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
	a.moveToElement(m3).perform();
	m3.click();
	WebElement m4 = driver.findElement(By.xpath("//strong[text()='Selenium with Appium course syllabus']"));
	System.out.println(m4.getText());
	
}
}
