package common.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	//creating a public object
	public WebDriver driver;
	public void chromeBrowser(String URL) {
		//step 1: Open Browser(Google Chrome,mozilla,IE,Safari,Edge)
		
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				//navigate to url
				
				driver.navigate().to(URL);
				//maximize window
				driver.manage().window().maximize();
				
		
		
		
	}

}
