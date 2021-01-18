package org.sampe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("mohamed");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("muzamil");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("mohamed@gamil.com");
		WebElement btnclick = driver.findElement(By.xpath("//label[text()='Male']"));
		btnclick.click();
		WebElement mob = driver.findElement(By.id("userNumber"));
		mob.sendKeys("9500588568");

		JavascriptExecutor JS = (JavascriptExecutor) driver;

		WebElement sct = driver.findElement(By.xpath("//div[text()='Select State']"));
		JS.executeScript("arguments[0].scrollIntoView(true)", sct);
		sct.click();
		
		
		List<WebElement> statesName = sct.findElements(By.xpath("//div[@id='state']//div//div//div"));
		System.out.println(statesName.size());
		
		for (WebElement state : statesName) {
			String text = state.getText();
			System.out.println(text);
		}
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement stateSelected = driver.findElement(By.xpath("//div[@id='state']//div[@class=' css-1uccc91-singleValue']"));
		System.out.println(stateSelected.getText());
	}

}
