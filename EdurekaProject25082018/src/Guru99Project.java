import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	
ChromeDriver driver;

void invokeBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Nilesh/selenium/chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.guru99.com/v4");
}

public void printTitleOfThePage() {
	System.out.println(driver.getTitle());
}

public void login(String userEmailID, String password ) {

	WebElement userID = driver.findElement(By.name("uid"));
	
	userID .sendKeys(userEmailID);
	
	driver.findElement(By.name("password")).sendKeys(password);
	
	driver.findElement(By.name("btnLogin")).click();
	
}





}
