package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SamarthBrowsers {
	           
	
	
	         public static WebDriver openfirefoxbrowser()
	         {
	        		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\win10\\Downloads\\geckodriver-v0.30.0-win64(1)\\geckodriver.exe");
			      	 WebDriver driver = new FirefoxDriver(); 
                     return driver;
}
	         
	         
	         public static WebDriver openchromebrowser()
	         {
	        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 			//create chrome instance
	 			WebDriver driver = new ChromeDriver();
	 			return driver;
}     
	         

	         
	         
	         
	         
}
