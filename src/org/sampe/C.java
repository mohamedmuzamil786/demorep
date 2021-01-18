package org.sampe;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium9am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.id("headerSearch"));
		search.sendKeys("celling fan",Keys.ENTER);
		WebElement click = driver.findElement(By.xpath("//a[@title='Ceiling Fans']"));
	    click.click();
	    String handle = driver.getWindowHandle();
	    Set<String> allwds = driver.getWindowHandles();
	    System.out.println(allwds);
	    for (String string : allwds) {
		 driver.switchTo().window(string);
		
	}
	    
	    
	}

}
