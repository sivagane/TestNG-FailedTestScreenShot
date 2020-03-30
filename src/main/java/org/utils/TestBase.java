package org.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
	public static void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jegan\\eclipse-workspace\\FailedTestScreenShot\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}
	
	public static void failed(String testmethodname) {
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("C:\\Users\\jegan\\eclipse-workspace\\FailedTestScreenShot\\screenshots\\"+testmethodname+"_"+".jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
	
}
