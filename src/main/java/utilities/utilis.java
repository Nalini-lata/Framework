package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class utilis {
	public static void input(WebDriver driver,String xpath,String value) throws InterruptedException{
		driver.findElement(By.id(xpath)).sendKeys(value);
		Thread.sleep(1000);
		
		}
		
	public static void inputText(WebDriver driver, String value){
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(value).perform();
		
		
	
	}
		
	
	public static void button(){
		
	}
	
	public static void screenShot(){
		
	}

}
