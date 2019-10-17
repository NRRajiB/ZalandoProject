package org.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClubFactory {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	Robot r=new Robot();
	driver.get("https://www.clubfactory.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Female']")).click();
	WebElement watch = driver.findElement(By.xpath("(//li[@class='category_item___1XaxBWn_'])[4]"));
	a.moveToElement(watch).perform();
	Thread.sleep(5000);
	WebElement analog = driver.findElement(By.xpath("(//li[@class='third_item___2YzHNJRr'])[3]"));
	a.doubleClick(analog).perform();
	Thread.sleep(5000);
	WebElement img = driver.findElement(By.xpath("(//div[@class='p_img___tCEgKAVd larg_p_img___2pscUdrF'])[10]"));
	a.contextClick(img).perform();
	Thread.sleep(2000);
	for (int i=0;i<=5;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
WebElement src = driver.findElement(By.xpath("(//div[@class=\"p_bottom___3ga-lrjK\"])[2]"));
WebElement desc = driver.findElement(By.xpath("//div[@class='menu_item___1zApZw2C'][1]"));
a.dragAndDrop(src, desc).perform();
}
}
