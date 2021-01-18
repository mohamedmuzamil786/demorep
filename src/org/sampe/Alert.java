package org.sampe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("frame"));
		int i = list.size();
		System.out.println(i);
		driver.switchTo().frame("login_page");
		WebElement findElement = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		findElement.sendKeys("mohamed");
		
//		WebElement element = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
//		element.click();
//		WebElement element2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		element2.click();
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
//		alert.getText();

	}

}
