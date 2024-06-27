package javamavenpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHM {

	public static void main(String[] args) {
		//launch the browser
		
	WebDriver driver = new ChromeDriver();
	
	//passing the url
	driver.get("https://www.demoblaze.com/");
	
	////max the screen
	driver.manage().window().maximize();
	//implicit time
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	// sign
	
	driver.findElement(By.id("signin2")).click();
	
	//username
	driver.findElement(By.id("sign-username")).sendKeys("gdsb");
	//password
	driver.findElement(By.id("sign-password")).sendKeys("Admin123");
	
	
	

	
	
	
	
		

	}


}
