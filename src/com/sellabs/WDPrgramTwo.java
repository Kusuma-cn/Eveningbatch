package com.sellabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WDPrgramTwo 
{
WebDriver driver;
	
	By searchArea = By.id("srchword");
	String url = "https://www.rediff.com/";
	
	public void wd()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath + "/geckodriver-v0.29.1-win64 (2)/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(searchArea).click();
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
