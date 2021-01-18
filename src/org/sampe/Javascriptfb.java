package org.sampe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.id("email"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value','java')", element);
Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
System.out.println(executeScript);
	}

}
