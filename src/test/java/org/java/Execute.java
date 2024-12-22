package org.java;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PojoClass.LoginPojo;
import PojoClass.OrderPojo;
import PojoClass.ProductPojo;
import PojoClass.WelcomePojo;

public class Execute extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
		maxWindow();
		
		LoginPojo p1 = new LoginPojo();
		//btnClick(p1.getSignUpButton());
		//btnClick(p1.getSignUpClose());--check this code
		//fillTextBox(p1.getUsrName(), readFromExcel(1, 0));
		//fillTextBox(p1.getUsrPassw(), readFromExcel(1, 1));
		//btnClick(p1.getSignUpSuccessButton());
		//signUpValidation();-- check this code
		
	
	
		
		btnClick(p1.getLoginButton());
		fillTextBox(p1.getLoginUsrName(), readFromExcel(1, 0));
		fillTextBox(p1.getLoginUsrPassw(), readFromExcel(1, 1));
		btnClick(p1.getLoginInSuccessButton());
		
		pictures("Login");
		
		WelcomePojo p2 = new WelcomePojo();
		textPresentOrNotValidation(p2.getHomeValidation());
		
		pauseProgram();
		
		ProductPojo p3 = new ProductPojo();
		btnClick(p3.getProduct1());
		pauseProgram();
		btnClick(p3.getAddToCartButton());
		alertHandle();
		
		btnClick(p2.getHomeValidation());
		pauseProgram();
		btnClick(p3.getProduct2());
		pauseProgram();
		btnClick(p3.getAddToCartButton());
		alertHandle();
		
		pictures("ProductsAdded");
		
		btnClick(p3.getCartValidation());
		
		cartProductValidation();
		
		OrderPojo p4 = new OrderPojo();
		btnClick(p4.getPlaceOrderButton());
		
			
		pauseProgram();		
		
		pictures("PlaceOrder");
		fillTextBox(p4.getOrderName(), readFromExcel(1,2));
		fillTextBox(p4.getOrderCountry(), readFromExcel(1,3));
		fillTextBox(p4.getOrderCity(), readFromExcel(1,4));
		pauseProgram();
		p4.getOrderCreditCard().sendKeys("1234567891234567");
		p4.getOrderMonth().sendKeys("11");
		p4.getOrderYear().sendKeys("2026");
		
		pictures("PersonDetails");
		
		purchaseButtonVisible();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
        WebElement targetElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class, 'btn btn-primary') and contains(text(), 'Purchase')]"))); 

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
        //pauseProgram();
        
		//btnClick(p4.getPlaceOrderButton());
        driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary') and contains(text(), 'Purchase')]")).click();
        
        pictures("OrderDetails");
        
        //orderNumber(p4.getOrderID());
	}

}
