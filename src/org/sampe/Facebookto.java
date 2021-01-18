package org.sampe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement crtacc = driver.findElement(By.id("u_0_2"));
		crtacc.click();
		Thread.sleep(3000);
		WebElement mnth = driver.findElement(By.id("month"));
		Select s = new Select(mnth);
		s.deselectByVisibleText("Jul");
		String d = mnth.getAttribute("value");
		System.out.println(d);
	}

}
