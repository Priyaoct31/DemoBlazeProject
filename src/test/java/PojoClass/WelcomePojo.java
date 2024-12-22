package PojoClass;

import org.java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePojo extends BaseClass {
	
public WelcomePojo() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="nameofuser")
	private WebElement welcomeNameValidation;
	
	@FindBy(id="nava")
	private WebElement productStoreLogo;
	
	@FindBy(xpath="//a[text()='Home ']")
	private WebElement homeValidation;
	
	@FindBy(xpath="//a[text()='Contact']")
	private WebElement contactValidation;
	
	@FindBy(xpath="//a[text()='About us']")
	private WebElement abtUsValidation;
	
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cartValidation;
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logOutValidation;
	
	@FindBy(xpath = "//a[text()='CATEGORIES']")
	private WebElement categoriesValidation;
	
	@FindBy(xpath = "//a[text()='Phones']")
	private WebElement phonesValidation;
	
	public WebElement getWelcomeNameValidation() {
		return welcomeNameValidation;
	}

	public void setWelcomeNameValidation(WebElement welcomeNameValidation) {
		this.welcomeNameValidation = welcomeNameValidation;
	}

	public WebElement getProductStoreLogo() {
		return productStoreLogo;
	}

	public void setProductStoreLogo(WebElement productStoreLogo) {
		this.productStoreLogo = productStoreLogo;
	}

	public WebElement getHomeValidation() {
		return homeValidation;
	}

	public void setHomeValidation(WebElement homeValidation) {
		this.homeValidation = homeValidation;
	}

	public WebElement getContactValidation() {
		return contactValidation;
	}

	public void setContactValidation(WebElement contactValidation) {
		this.contactValidation = contactValidation;
	}

	public WebElement getAbtUsValidation() {
		return abtUsValidation;
	}

	public void setAbtUsValidation(WebElement abtUsValidation) {
		this.abtUsValidation = abtUsValidation;
	}

	public WebElement getCartValidation() {
		return cartValidation;
	}

	public void setCartValidation(WebElement cartValidation) {
		this.cartValidation = cartValidation;
	}

	public WebElement getLogOutValidation() {
		return logOutValidation;
	}

	public void setLogOutValidation(WebElement logOutValidation) {
		this.logOutValidation = logOutValidation;
	}

	public WebElement getCategoriesValidation() {
		return categoriesValidation;
	}

	public void setCategoriesValidation(WebElement categoriesValidation) {
		this.categoriesValidation = categoriesValidation;
	}

	public WebElement getPhonesValidation() {
		return phonesValidation;
	}

	public void setPhonesValidation(WebElement phonesValidation) {
		this.phonesValidation = phonesValidation;
	}

	public WebElement getLaptopsValidation() {
		return laptopsValidation;
	}

	public void setLaptopsValidation(WebElement laptopsValidation) {
		this.laptopsValidation = laptopsValidation;
	}

	public WebElement getMonitorsValidation() {
		return monitorsValidation;
	}

	public void setMonitorsValidation(WebElement monitorsValidation) {
		this.monitorsValidation = monitorsValidation;
	}

	@FindBy(xpath = "//a[text()='Laptops']")
	private WebElement laptopsValidation;
	
	@FindBy(xpath = "//a[text()='Monitors']")
	private WebElement monitorsValidation;
	

}
