package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dayFive2ques {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.amazon.iN");
Actions a=new Actions(driver);
WebElement a1 = driver.findElement(By.xpath("//span[text()='Category']"));
a.moveToElement(a1).perform();
WebElement a2 = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
a.moveToElement(a2).perform();
WebElement a3 = driver.findElement(By.xpath("//span[text()='Power Banks']"));
a.moveToElement(a3).perform();
a3.click();
}
}
