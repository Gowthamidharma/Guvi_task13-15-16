package javamavenpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task16demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		//passing the url
		driver.get("https://www.demoblaze.com/");
		
		////max the screen
		driver.manage().window().maximize();
		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get title
		String expectedTitle="STORE";
		String actualTitle = driver.getTitle();
		//validate the title and print msg
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			
			System.out.println("Page landed on correct website");
		} else {
		
		System.out.println("Page  not landed on correct website");
		}
		
		//close the browser
		driver.close();
	}

}
