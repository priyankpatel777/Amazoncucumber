package stepDefinations;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser_Initialization.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.LoginPageObjects;

public class StepDefination extends Base {

		
		public WebDriver driver;
		public LoginPageObjects lpo;
	
	 	@Given("^User invoking the browser$")
	    public void user_invoking_the_browser() throws IOException{
	 		
	 		driver=browser_Invoking();
	 		
	    }
	 	
	 	@And("^Navigate to the Amazon Home Page$")
		public void navigate_to_the_amazon_home_page(){
	 		
	 		driver.get(prop.getProperty("url"));
	 		
		}

	    @When("^User accept cookies and click on Signin Option$")
	    public void user_accept_cookies_and_click_on_signin_option(){
	    	
	    	lpo=new LoginPageObjects(driver);
	    	lpo.accept_Cookies().click();
	    	lpo.login_Option().click();
	    	
	    	
	    }
	    
	    
	    @Then("^Amazon Login Page is displayed$")
	    public void amazon_login_page_is_displayed(){
	    	
	    	WebElement signinLogo=driver.findElement(By.cssSelector("h1.a-spacing-small"));
	    	
	    	Assert.assertTrue(signinLogo.isDisplayed());
	    	
	    }
	    
	    @When("^User enter (.+) and (.+) into the fields$")
	    public void user_enter_and_into_the_fields(String username, String password){
	    	
	    	lpo.enter_emailAddress().sendKeys(username);
	    	lpo.continue_Button().click();
	    	lpo.enter_password().sendKeys(password);
	    	
	    }

	    @And("^Click on Sign in button$")
	    public void click_on_sign_in_button(){
	    	
	    	lpo.Signin_Button().click();
	    	
	    }


	    @Then("^Amazon Account home page is displayed for valid user$")
	    public void amazon_account_home_page_is_displayed_for_valid_user(){
	    	
	    	
	    	
	    	
	    }

	    @When("^User click on All option$")
	    public void user_click_on_all_option(){
	    	
	    	lpo.all_Option().click();
	    }

	    
	    @And("^Click signOut option$")
	    public void click_signout_option(){
	    	
	    	lpo.SignOut_Option().click();
	    	
	    }
	    
	    @Then("^User Sucessfully Signout$")
	    public void user_sucessfully_signout(){
	    	
	    	driver.close();
	    	
	    }

	   
	   
	
	
	
	
}
