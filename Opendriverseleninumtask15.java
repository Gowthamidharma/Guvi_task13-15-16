package javamavenpackage;

import java.time.Duration;

import org.apache.commons.math3.optim.nonlinear.scalar.LineSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opendriverseleninumtask15 {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver =new ChromeDriver();
		
		// load url
		
		  driver.get("https://www.google.com/");
		  
			
			  //max window 
		  		driver.manage().window().maximize();
			  
				
				  //set implicit time
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				  
				  
				  // find the search element enter input and keyboard action
				  
				  
				  driver.findElement(By.id("APjFqb")).sendKeys("Seleninum",Keys.ENTER);
				  
				  
				  //open the search element and look for the text displayed
				  
					
					  WebElement searchElement = driver.findElement(By.name("q"));
					  //validate
					  if(searchElement.isDisplayed()) {
					  
					  searchElement.sendKeys("Selenium",Keys.ENTER); 
					  } 
					 else
					  {
					  System.out.println("search element not found");
					  
					  }
					  
					  driver.close();
					 
			 
		 
				
	}
}
		