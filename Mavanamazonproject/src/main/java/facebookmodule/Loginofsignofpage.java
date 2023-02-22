package facebookmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginofsignofpage {     
	
	        @FindBy (xpath="//input[@id='email']")
	         private WebElement username;
	        
	        @FindBy (xpath="//input[@id='pass']")
	         private WebElement password;
	        
	        @FindBy (xpath="//button[@type='submit']")
	         private WebElement loginButton;
             
	        @FindBy (xpath="//a[text()='Forgotten password?']")
	         private WebElement forgotpasswordLink;
	        
	        @FindBy (xpath="//a[@id='u_0_0_og']")
	         private WebElement CreateAcc;
	        
	        @FindBy (xpath="//a[text()='Create a Page']")
	         private WebElement Createpage;
	        
	        
	        
	        
	        
	        public Loginofsignofpage(WebDriver driver)
	        {
	        	
	        	PageFactory.initElements(driver, this);
	        	
	        	
	        }
	        
	        public void sendUserName(String name) {
	        	username.sendKeys(name); 
	        	
	        	
	        }
	        
	        public void passwordName(String namep) {
	        	password.sendKeys(namep); 
	        }
	        
	        
	        public void clickonLoginbutton()
	        {
	        	loginButton.click();
	        }
	        
	        public void createaccount()
	        {
	            	CreateAcc.click();
	        	
	        }
	        
	        
	        
	        
	        
	        
	        public void clickonforgotpasswordlink()
	        {
	        	forgotpasswordLink.click();
	        }
	        
	        
	        
	        
	        
	        	
	        
	        
	        
	        
	        
	        
	        
	        

}