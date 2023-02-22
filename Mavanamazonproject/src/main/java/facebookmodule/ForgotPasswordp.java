package facebookmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordp {
	
	@FindBy (xpath="//input[@id='identify_email']")
    private WebElement Emailormobilenumber;
	
	@FindBy (xpath="//button[@id='did_submit']")
    private WebElement Search;
	
	
	
	  
    public  ForgotPasswordp(WebDriver driver)
    {
    	
    	PageFactory.initElements(driver, this);
    	
    	
    }
    
    public void sendEmailormobilenumber() {
    	
    	Emailormobilenumber.sendKeys("Samarth");
    	
    	
    	
    }
	
	
  public void Clickonsearchbutton() {
    	
	               Search.click();
    	
    	
    	
    }
	
    
    
    
	
   

}
