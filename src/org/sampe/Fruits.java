package org.sampe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kk\\\\selenium\\\\selenium8am\\\\drive\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://output.jsbin.com/osebed/2");
    driver.manage().window().maximize();
    WebElement element = driver.findElement(By.id("fruits"));
    Select s = new Select(element);
    s.selectByIndex(1);
    s.selectByValue("banana");
    s.selectByVisibleText("Grape");
   
    
    List<WebElement> options = s.getOptions();
    for (int i = 0; i < options.size(); i++) {
     WebElement opt = options.get(i);
     System.out.println(opt.getText());
     }
    List<WebElement> allSelected = s.getAllSelectedOptions();
    for (int i = 0; i < allSelected.size(); i++) {
    	WebElement element2 = allSelected.get(i);
    	System.out.println(element2.getText());
		
	}
    WebElement firstSelectedOption = s.getFirstSelectedOption();
    System.out.println(firstSelectedOption.getText());
    
    s.deselectByVisibleText("Banana");
    
	}

}
