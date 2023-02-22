package facebookmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createnewaccount {
                                  
	                    
	                      // WebElements 
	
	                  @FindBy (xpath="(//a[@role='button'])[2]")                    
	                  private WebElement CreateNewAccount;
	                  
	                  @FindBy (xpath="//input[@name='firstname']")                    
	                  private WebElement firstname;
	                  
	                  @FindBy (xpath="//input[@name='lastname']")                    
	                  private WebElement sname;
	                  
	                  @FindBy (xpath="//input[@name='reg_email__']")                    
	                  private WebElement mobilenumberoremailaddress;
	                  
	                  @FindBy (xpath="//input[@name='reg_passwd__']")                    
	                  private WebElement newpassword;
	                  
	                  @FindBy (xpath="(//input[@type='radio'])[2]")                    
	                  private WebElement male;
	                  
	                  @FindBy (xpath="(//button[text()='Sign Up'])[1]")                    
	                  private WebElement Signup; 
	                  
	                        // ConStructor
	                  public createnewaccount (WebDriver driver) {
	                	  
	                	  PageFactory.initElements(driver, this);
	                	  
	                  }
	                  
	                  
	                        // Methods 
	                  
	                  public void clickoncreatenewaccount () 
		                 {
		                	 
	                	        CreateNewAccount.click(); 
		                	 
		                 } 
	                  
	                  
	                  
	                  
	                 public void sendfirstname() 
	                 {
	                	 
	                	 firstname.sendKeys("Swami");
	                	 
	                 } 
	                 
	                 public void sendsname() 
	                 {
	                	 
	                	 sname.sendKeys("Samarth");
	                	 
	                 }  
	                 
	                 public void sendmobilenumberoremailaddress() 
	                 {
	                	 
	                	 mobilenumberoremailaddress.sendKeys("666666");
	                	 
	                 }   
	                 
	                 public void sendnewpassword()
	                 {
	                	 
	                	 newpassword.sendKeys("6666@k");
	                	 
	                	 
	                 }
	                 
	                 public void clickonmalebutton()
	                 {
	                	   male.click();  
	                 }
	                 
	                 public void clickonsignup() 
	                 {
	                	 Signup.click(); 
	                 }
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	 
}
