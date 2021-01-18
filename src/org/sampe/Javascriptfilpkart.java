package org.sampe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptfilpkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement element3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','code')", element);
		js.executeScript("arguments[0].setAttribute('value','core')", element2);
        Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(executeScript);
		Object executeScriptq = js.executeScript("return arguments[0].getAttribute('value')", element2);
		System.out.println(executeScriptq);
		js.executeScript("arguments[0].click()",element3);
	}

}
