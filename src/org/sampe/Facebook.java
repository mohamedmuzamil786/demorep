package org.sampe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("year"));
		Select s = new Select(element);
		List<WebElement> option = s.getOptions();
		for (int i = 0; i < option.size(); i++) {
			WebElement tet = option.get(i);
			String attribute = tet.getAttribute("value");
			System.out.println(attribute);
			
		}
		
	}
}

