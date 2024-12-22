package PojoClass;

import org.java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPojo extends BaseClass {
	
	public OrderPojo() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(id="name")
	private WebElement orderName;
	
	@FindBy(id="country")
	private WebElement orderCountry;
	
	@FindBy(id="city")
	private WebElement orderCity;
	
	@FindBy(id="card")
	private WebElement orderCreditCard;
	
	@FindBy(id="month")
	private WebElement orderMonth;
	
	@FindBy(id="year")
	private WebElement orderYear;
	
	@FindBy(xpath="//button[contains(@class, 'btn btn-primary') and contains(text(), 'Purchase')]")
	private WebElement purchaseButton;
	
	@FindBy(xpath="//p[@class='lead text-muted ']")
	private WebElement orderID;

	public WebElement getOrderID() {
		return orderID;
	}

	public void setOrderID(WebElement orderID) {
		this.orderID = orderID;
	}

	public WebElement getPurchaseButton() {
		return purchaseButton;
	}

	public void setPurchaseButton(WebElement purchaseButton) {
		this.purchaseButton = purchaseButton;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public void setPlaceOrderButton(WebElement placeOrderButton) {
		this.placeOrderButton = placeOrderButton;
	}

	public WebElement getOrderName() {
		return orderName;
	}

	public void setOrderName(WebElement orderName) {
		this.orderName = orderName;
	}

	public WebElement getOrderCountry() {
		return orderCountry;
	}

	public void setOrderCountry(WebElement orderCountry) {
		this.orderCountry = orderCountry;
	}

	public WebElement getOrderCity() {
		return orderCity;
	}

	public void setOrderCity(WebElement orderCity) {
		this.orderCity = orderCity;
	}

	public WebElement getOrderCreditCard() {
		return orderCreditCard;
	}

	public void setOrderCreditCard(WebElement orderCreditCard) {
		this.orderCreditCard = orderCreditCard;
	}

	public WebElement getOrderMonth() {
		return orderMonth;
	}

	public void setOrderMonth(WebElement orderMonth) {
		this.orderMonth = orderMonth;
	}

	public WebElement getOrderYear() {
		return orderYear;
	}

	public void setOrderYear(WebElement orderYear) {
		this.orderYear = orderYear;
	}
	
	

}
