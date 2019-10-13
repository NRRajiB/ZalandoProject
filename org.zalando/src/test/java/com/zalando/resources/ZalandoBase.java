package com.zalando.resources;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.zalando.Stepdefinition.Hook;

public class ZalandoBase {
	
public void Url(String url) {
Hook.driver.get(url);	
}
public static void type(WebElement ele, String name) {
ele.sendKeys(name);
}
public static void btn(WebElement ele) {
	ele.click();
}
public static void keyfun() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static List<HashMap<String,String>> excelvalue() throws Exception {
	List<HashMap<String, String>> lp=new ArrayList<HashMap<String,String>>();
	HashMap<String,String> mp=new HashMap<String,String>();
	File f=new File("C:\\Users\\Ammu\\eclipse-workspace\\org.zalando\\Excel\\Excel_Read.xlsx"); 
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
		Sheet s=w.getSheet("Product_Detail");
		Row hd=s.getRow(0);
		for (int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r= s.getRow(i);
			for(int j=0;j<hd.getPhysicalNumberOfCells();j++) {
				Cell c = r.getCell(j);
				int ct = c.getCellType();
				if(ct==1) {
					mp.put(hd.getCell(j).getStringCellValue(),c.getStringCellValue());
				}
				else if(ct==0) {
					mp.put(hd.getCell(j).getStringCellValue(), String.valueOf(c.getNumericCellValue()));
				}}
			lp.add(mp);
		}
		return lp;
		}
public static void actionpfm(WebElement ele) {
	
	Actions a=new Actions(Hook.driver);
	a.doubleClick().perform();;
}
}
