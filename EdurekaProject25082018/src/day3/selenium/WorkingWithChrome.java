package day3.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
   
ChromeDriver driver;

void invokeBrowser() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Nilesh/selenium/chromedriver.exe");
	driver= new ChromeDriver();
	Dimension dim= new Dimension(600, 600);
	driver.manage().window().setSize (dim);
	
	
	
	//driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.facebook.com/");
	
}

String getPageTitle() {
	return driver.getTitle();
	
}

void navigateCommands() {
	driver.navigate (). to ("http://www.qatechhub.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

void closeBrowser(){
	driver.quit();
	

}
				
	}
	


