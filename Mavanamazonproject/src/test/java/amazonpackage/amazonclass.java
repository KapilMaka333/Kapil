package amazonpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookmodule.ForgotPasswordp;
import facebookmodule.Loginofsignofpage;
import facebookmodule.createnewaccount;

public class amazonclass {
	
	                 public static void main(String[] args) {
						
	                	 
	                 System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\3D Objects\\chromedriver_win32\\chromedriver.exe");
	               		  
	   	 		     WebDriver driver = new ChromeDriver();
	   	 		     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   	 		                  		  
	   	 		     driver.get("https://www.facebook.com/");
	   	 		     
	   	 		     		 
	   	 		      //Enter the username and password 
	   	 		     
	   	 		 Loginofsignofpage loginofsignofpage = new  Loginofsignofpage(driver);
	   	 		 
	   	 		loginofsignofpage.sendUserName();
	   	 	    loginofsignofpage.passwordName();
	   	 	    
	   	 	        // Click on login Button
	   	 	    
	   	        	loginofsignofpage.clickonLoginbutton();
	   	 	
	   	 	
	   	        	
	                	 
					}     

}
