package org.sampe;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\selenium\\selenium8am\\drive\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=uySgVuVlPkk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File soucrefile = screenshot.getScreenshotAs(OutputType.FILE);
     	File file =new File("E:\\Screenshot\\screnmuzz\\Muzamil.png");
		FileUtils.copyFile(soucrefile, file);
		System.out.println("file saved");

	}

}
