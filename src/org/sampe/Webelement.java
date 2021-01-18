package org.sampe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		driver.manage().window().maximize();
//		List<WebElement> alltab = driver.findElements(By.tagName("table"));
//		System.out.println("nof tables: "+alltab.size());
//		WebElement tabrow = driver.findElement(By.xpath("//table[@id='customers']"));
//		System.out.println(tabrow.getText());
		System.out.println("Sallmankhan");
//		

	}

}
