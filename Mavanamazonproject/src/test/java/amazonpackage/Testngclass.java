package amazonpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.SamarthBrowsers;
import facebookmodule.Loginofsignofpage;
import utilis.utility;



public class Testngclass extends SamarthBrowsers {     
	
	 private WebDriver driver;
	 private Loginofsignofpage loginofsignofpage;
	

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws InterruptedException 
	 * @throws Exception
	 */
/*	@BeforeTest
	@Parameters("browsers")
	public void setup(String browser) 
	 {

			if(browser.equals("chrome"))
			{
				driver=openchromebrowser();
			}

			if(browser.equals("firefox"))
	 		{
				driver=openfirefoxbrowser();
			
		}  */
		 	
	 @BeforeClass 
		public void beforeClass() throws InterruptedException {
			System.out.println("Before Class");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\3D Objects\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://facebook.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
	 
	 @BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method");
			 loginofsignofpage=new  Loginofsignofpage(driver);
			
		}
	 @Test
		public void test() throws InterruptedException, EncryptedDocumentException, IOException {
			System.out.println("Test");
			loginofsignofpage.sendUserName(utility.getDataFromExcel("Details", 1, 0));
		}

		@AfterClass
		public void test4() {
			System.out.println("After Class");
		}
		@AfterMethod
		public void test5() {
			System.out.println("After Method");
		}
	    
	
	

}
