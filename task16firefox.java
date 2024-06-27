
package javamavenpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class task16firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//passing the url
		driver.get("https://www.google.com/");
		
		////max the screen
		driver.manage().window().maximize();
		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// get url
		String pageURL = driver.getCurrentUrl();
		System.out.println("The page URL is: " + pageURL);
		//navigate to page
		driver.navigate().to("https://www.google.com/");
		//refresh the page
		driver.navigate().refresh();
		//close the browser
		driver.close();
		
			}
	

}
