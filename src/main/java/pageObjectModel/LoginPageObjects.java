package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	private By cookies=By.id("sp-cc-accept");
	private By loginoption=By.xpath("//a[@id='nav-link-accountList']");
	private By email=By.id("ap_email");
	private By continuebtn=By.id("continue");
	private By password=By.id("ap_password");
	private By signinbtn=By.id("signInSubmit");
	private By alloption=By.cssSelector("a[id='nav-hamburger-menu']");
	private By signout=By.xpath("//a[text()='Sign Out']");
	
	public WebElement accept_Cookies() {
		
		return driver.findElement(cookies);
	}
	public WebElement login_Option() {
		
		return driver.findElement(loginoption);
	}
	public WebElement enter_emailAddress() {
		
		return driver.findElement(email);
	}
	public WebElement continue_Button() {
		
		return driver.findElement(continuebtn);
	}
	public WebElement enter_password() {
		
		return driver.findElement(password);
	}
	public WebElement Signin_Button() {
		
		return driver.findElement(signinbtn);
	}
	public WebElement all_Option() {
		
		return driver.findElement(alloption);
	}
	public WebElement SignOut_Option() {
	
	return driver.findElement(signout);
	}
}
