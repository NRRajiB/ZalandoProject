package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyProject {
	@Test(priority=1)
public void test1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\TestNGCode\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.laudamotion.com/la/en/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='cookie-popup__close']")).click();
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	from.click();
	Actions ac=new Actions(driver);	
	WebElement departapt = driver.findElement(By.xpath("(//div[@class='core-list-item core-list-item-rounded'])[2]"));
	ac.moveToElement(departapt).perform();
	departapt.click();
	WebElement depart = driver.findElement(By.xpath("(//div[@class='core-list-item core-list-item-rounded'])[46]"));
ac.moveToElement(depart).perform();
depart.click();
WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
to.click();
to.sendKeys("Ukraine");
WebElement arrival = driver.findElement(By.xpath("//div[@class='core-list-item core-list-item-rounded initial']"));
ac.moveToElement(arrival).perform();
arrival.click();
WebElement contbtn = driver.findElement(By.xpath("//button[@class='core-btn-primary core-btn-block core-btn-big']"));
contbtn.click();

WebElement flydate = driver.findElement(By.name("dateInput0"));
flydate.click();

WebElement fdt = driver.findElement(By.xpath("(//span[text()='28 '])[1]"));
Thread.sleep(2000);
ac.moveToElement(fdt).perform();
fdt.click();

WebElement flyret = driver.findElement(By.xpath("//input[@aria-label='Fly back: - DD']"));
	flyret.click();
	WebElement fret = driver.findElement(By.xpath("(//span[text()='5 '])[2]"));
	ac.moveToElement(fret).perform();
	fret.click();
	
	driver.findElement(By.name("passengers")).click();
	driver.findElement(By.xpath("//button[@class='core-btn inc core-btn-wrap']")).click();
	driver.findElement(By.xpath("//button[@class='core-btn-primary core-btn-block core-btn-big']")).click();
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//div[@class='core-btn-primary lm'])[2]")).click();

	Thread.sleep(20000);
	driver.findElement(By.xpath("(//span[@class='flights-table-fares__fare-radio'])[2]")).click();
	Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='core-btn-primary lm'])[2]")).click();
		Thread.sleep(10000);
	driver.findElement(By.xpath("(//div[@class='flights-table-price'])[4]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//div[@class='lm'])[1]"));
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='core-btn-primary seat-map-plus-dialog__button']")).click();
	driver.findElement(By.xpath("(//span[@class='seat-click'])[35]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class='seat-click'])[34]")).click();
	Thread.sleep(10000);
driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
Thread.sleep(20000);
driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
Thread.sleep(20000);
driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("(//span[@class='pb-checkbox__circle'])[1]")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("(//span[@class='pb-checkbox__circle'])[1]")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@class='core-btn-primary']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("(//span[@class='pb-checkbox__circle'])[4]")).click();
driver.findElement(By.xpath("//button[@class='core-btn-primary']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
driver.findElement(By.xpath("//button[@class='core-btn-secondary']")).click();
WebElement email = driver.findElement(By.id("email9131"));
email.sendKeys("lakshminrr27@gmail.com");
WebElement pwrd = driver.findElement(By.id("password9140"));
pwrd.sendKeys("Rajib27@123");
driver.findElement(By.xpath("//button[@type='submit']")).click();

WebElement Vcode = driver.findElement(By.xpath("(//input[@type='text'])[1]"));//for first time login
Vcode.sendKeys("xwplqldw");//for first time login

WebElement tle1 = driver.findElement(By.id("title8475"));
Select s=new Select(tle1);
s.selectByVisibleText("Mr");
WebElement fname = driver.findElement(By.id("firstName8431"));
fname.sendKeys("Bharani Kumar");
WebElement sname = driver.findElement(By.id("lastName8431"));
sname.sendKeys("Chandrasekar");
WebElement tle2 = driver.findElement(By.id("title8484"));
Select s1=new Select(tle2);
s1.selectByVisibleText("Mr");
WebElement fname2 = driver.findElement(By.id("firstName8434"));
fname2.sendKeys("Arun Kumar");
WebElement sname2 = driver.findElement(By.id("lastName8434"));
sname2.sendKeys("Chandrasekar");
driver.findElement(By.xpath("//button[text()='No insurance']")).click();
WebElement country = driver.findElement(By.name("phoneNumberCountry"));
Select s3=new Select(country);
s3.selectByVisibleText("India");
WebElement mobno = driver.findElement(By.name("phoneNumber"));
mobno.sendKeys("8760156060");
WebElement credcard = driver.findElement(By.id("cardNumber9175"));
credcard.sendKeys("1234 2563 4658");
WebElement expmnth = driver.findElement(By.id("expiryMonth9175"));
Select s4=new Select(expmnth);
s4.selectByVisibleText("7");
WebElement expyr = driver.findElement(By.name("expiryYear"));
Select s5=new Select(expyr);
s5.selectByVisibleText("expyr");
WebElement cvv = driver.findElement(By.name("securityCode"));
cvv.sendKeys("125");
WebElement cdhnam = driver.findElement(By.name("cardHolderName"));
cdhnam.sendKeys("Bharani Kumar");
WebElement adrs1 = driver.findElement(By.name("billingAddressAddressLine1"));
adrs1.sendKeys("Anna Nagar");
WebElement adrs2 = driver.findElement(By.name("billingAddressAddressLine2"));
adrs2.sendKeys("no. 1, nehru street");
WebElement city = driver.findElement(By.name("billingAddressCity"));
city.sendKeys("Cuddalore");
WebElement pincde = driver.findElement(By.name("billingAddressPostcode"));
pincde.sendKeys("607302");
WebElement adrsctry = driver.findElement(By.name("billingAddressCountry"));
Select s6=new Select(adrsctry);
s6.selectByVisibleText("India");
driver.findElement(By.xpath("//button[text()='Pay Now']")).click();//to click the pay now button



	}

}
