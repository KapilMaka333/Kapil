package amazonpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookmodule.createnewaccount;

public class createaccclick {    
	                        
	                public static void main(String[] args) throws InterruptedException {
						
	                	
	                	 
		                 System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\3D Objects\\chromedriver_win32\\chromedriver.exe");
		               		  
		   	 		     WebDriver driver = new ChromeDriver();
		   	 		//     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		   	 		                  		  
		   	 		     driver.get("https://www.facebook.com/");
		   	 		     
		   	 		     driver.manage().window().maximize();
		   	 		     
		   	 		   
		   	 		 Thread.sleep(6000);
		   	 		 createnewaccount  ccreatenewaccount = new createnewaccount(driver);
		   	 		 
		   	 	      ccreatenewaccount.clickoncreatenewaccount();
		   	 	      
		   	 	      Thread.sleep(6000);
		   	 	      
		   	 	      ccreatenewaccount.sendfirstname();
		   	 	      ccreatenewaccount.sendsname();
		   	 	      ccreatenewaccount.sendmobilenumberoremailaddress();
		   	 	      ccreatenewaccount.sendnewpassword();
		   	 	      ccreatenewaccount.clickonmalebutton();
		   	 	      ccreatenewaccount.clickonsignup();
		   	 	      
		   	 		 
		   	 		 
		   	 		 
		   	 		 
		   	 		     
		   	 		     
		   	 		     
	                	
	                	
	                	
	                	
					}

}
