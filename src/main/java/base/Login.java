package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Login {
	public WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\Nalini-Backup\\D\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
	}
	/*@AfterTest
	public void close(){
		driver.quit();*/
		
	}
	


