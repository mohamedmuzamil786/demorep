package org.sampe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement tble = driver.findElement(By.tagName("table"));
		List<WebElement> table = driver.findElements(By.tagName("tr"));
		List<WebElement> teble = driver.findElements(By.tagName("td"));
		for (int i = 1; i < table.size(); i++) {

			WebElement text = table.get(i);
			String textq = text.getText();
			System.out.println(textq);
	}
	

	}}
