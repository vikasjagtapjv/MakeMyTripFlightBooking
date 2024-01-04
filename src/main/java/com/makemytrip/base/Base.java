package com.makemytrip.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;
	FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	public void launchWebUrl()
	{
		try {
			fis=new FileInputStream(projectPath+"\\src\\main\\resources\\Property\\config.properties");
		Properties pro=new Properties();
		pro.load(fis);
		pro.getProperty("weburl");
		driver.get(pro.getProperty("weburl"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void waitHelper()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	

}
