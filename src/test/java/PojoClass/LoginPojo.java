package PojoClass;

import org.java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	private WebElement signUpButton;

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public void setSignUpButton(WebElement signUpButton) {
		this.signUpButton = signUpButton;
	}
	
	@FindBy(id="sign-username")
	private WebElement usrName;
	
	@FindBy(id = "sign-password")
	private WebElement usrPassw;
	
	@FindBy(id="login2")
	private WebElement loginButton;
	
	@FindBy(id="loginusername")
	private WebElement loginUsrName;
	
	@FindBy (id="loginpassword")
	private WebElement loginUsrPassw;
	
	@FindBy(xpath ="//button[text()='Close'][1]")
	private WebElement signUpClose;
	
	@FindBy(xpath = "//button[@onclick='register()']")
	private WebElement signUpSuccessButton;
	
	@FindBy(xpath = "//button[@onclick='logIn()']")
	private WebElement loginInSuccessButton;

	public WebElement getLoginInSuccessButton() {
		return loginInSuccessButton;
	}

	public void setLoginInSuccessButton(WebElement loginInSuccessButton) {
		this.loginInSuccessButton = loginInSuccessButton;
	}

	public WebElement getSignUpSuccessButton() {
		return signUpSuccessButton;
	}

	public void setSignUpSuccessButton(WebElement signUpSuccessButton) {
		this.signUpSuccessButton = signUpSuccessButton;
	}
	


	public WebElement getSignUpClose() {
		return signUpClose;
	}

	public void setSignUpClose(WebElement signUpClose) {
		this.signUpClose = signUpClose;
	}

	public WebElement getUsrName() {
		return usrName;
	}

	public void setUsrName(WebElement usrName) {
		this.usrName = usrName;
	}

	public WebElement getUsrPassw() {
		return usrPassw;
	}

	public void setUsrPassw(WebElement usrPassw) {
		this.usrPassw = usrPassw;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginUsrName() {
		return loginUsrName;
	}

	public void setLoginUsrName(WebElement loginUsrName) {
		this.loginUsrName = loginUsrName;
	}

	public WebElement getLoginUsrPassw() {
		return loginUsrPassw;
	}

	public void setLoginUsrPassw(WebElement loginUsrPassw) {
		this.loginUsrPassw = loginUsrPassw;
	}
}
