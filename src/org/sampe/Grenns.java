package org.sampe;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class Grenns {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium9am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x",Keys.ENTER);
		WebElement rightclk = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclk).perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		Set<String> stwd = driver.getWindowHandles();
		
		System.out.println(stwd);
		
		for (String eachwin : stwd) {
			
			if(!pwid.equals(eachwin)) {
				
				driver.switchTo().window(eachwin);
				
			}
		}
		
		WebElement prdt = driver.findElement(By.id("productTitle"));
		
		String text = prdt.getText();
		
		System.out.println(text);
        
	}

	
	
	
	
}
