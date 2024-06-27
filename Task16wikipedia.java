package javamavenpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




	public class Task16wikipedia {	


		public static void main(String[] args) {
		
		
				// Launch the browser
		WebDriver driver = new ChromeDriver();
				
				
				  //load url
				  
		 driver.navigate().to("https://www.wikipedia.org/");
				  
				  
				  //max window
					
		  driver.manage().window().maximize();
					  
					  
					  //set implicit time
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
					  
						
						  // search for input
		 driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence"
		 ,Keys.ENTER);
						 
				        // search the web element  History by xpath
		driver.findElement(By.xpath("(//span[text()='History'][1])")).click();
						  
							
							  // search for title , validate and print
		 String  expectedelement="Artificial intelligence"; 
		 String actualelement = driver.getTitle();
							  
		 if(expectedelement.equalsIgnoreCase(actualelement)) {
		 System.out.println(expectedelement);
		 }else {
		 System.out.println(actualelement);
		 }
							 				 
        driver.close();
	}
		

}
