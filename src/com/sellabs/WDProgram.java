package com.sellabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WDProgram 

{
	WebDriver driver;
	
	By downloadlink = By.linkText("downloads");
	
	public void wd()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath + "/geckodriver-v0.29.1-win64 (2)/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.org");
		driver.findElement(downloadlink).click();
		String title = driver .getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
	}
	
	 public static void main(String[] args) 
	 {
		 WDProgram wdp = new WDProgram();
		 wdp.wd();
		
	}

}
