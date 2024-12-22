package PojoClass;

import org.java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPojo extends BaseClass {

	public ProductPojo() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[text()='Samsung galaxy s6']")
		private WebElement product1;
		
		@FindBy(xpath = "//a[text()='Nexus 6']")
		private WebElement product2;
		
		@FindBy (xpath = "//a[text()='Add to cart']")
		private WebElement addToCartButton;
		
		@FindBy(xpath="//a[text()='Cart']")
		private WebElement cartValidation;

		
		public WebElement getCartValidation() {
			return cartValidation;
		}

		public void setCartValidation(WebElement cartValidation) {
			this.cartValidation = cartValidation;
		}

		public WebElement getProduct1() {
			return product1;
		}

		public void setProduct1(WebElement product1) {
			this.product1 = product1;
		}

		public WebElement getProduct2() {
			return product2;
		}

		public void setProduct2(WebElement product2) {
			this.product2 = product2;
		}

		public WebElement getAddToCartButton() {
			return addToCartButton;
		}

		public void setAddToCartButton(WebElement addToCartButton) {
			this.addToCartButton = addToCartButton;
		}
		
		
		
}
