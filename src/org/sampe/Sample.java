package org.sampe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebElement findElement = driver.findElement(By.id("u_0_2"));
		findElement.click(); 
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select s = new Select(findElement2);
		boolean mul= s.isMultiple();
		System.out.println(mul);
		s.selectByIndex(2);
		s.selectByVisibleText("May");
		s.selectByValue("10");
		
	}

}
