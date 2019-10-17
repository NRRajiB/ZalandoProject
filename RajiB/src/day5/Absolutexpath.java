package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//*[@class='nav-fill']//div[1]/label//following::input[1]")).sendKeys("OnePlus mobile");
	driver.findElement(By.xpath("//div[@class='nav-right']//div[1]//following::input[1]")).click();
List<WebElement> li = driver.findElements(By.xpath("//div[@class='sg-col-inner']/div[1]/h2[1]/a[1]/span"));
for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i).getText());
}
}
}
