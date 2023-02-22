package amazonpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.SamarthBrowsers;

public class CrossBrowsertesting extends SamarthBrowsers{
	private WebDriver driver;
	
	@BeforeTest
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
			
		}
			driver.manage().window().maximize();
			
	
	 }


	@BeforeClass
		public void test1() {
			System.out.println("Before Class");
		}
		@BeforeMethod
		public void test2() {
			System.out.println("Before Method");
			driver.get("https://www.facebook.com/");
		}
		@Test
		public void test() {
			System.out.println("test");
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
