package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\RajiB\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement amount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement amount2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement debit1 = driver.findElement(By.id("bank"));
WebElement debitamt = driver.findElement(By.id("amt7"));
WebElement credit1 = driver.findElement(By.id("loan"));
WebElement creditamt = driver.findElement(By.id("amt8"));
Actions a=new Actions(driver);
a.dragAndDrop(bank, debit1).perform();
a.dragAndDrop(amount1, debitamt).perform();
a.dragAndDrop(sales, credit1).perform();
a.dragAndDrop(amount2, creditamt).perform();
	}

}
