package org.testng;

import java.io.IOException;

import org.java.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClassA extends BaseClass {
	
	@Test
	private void tc1(String user, String pass) throws IOException {
		//SoftAssert s = new SoftAssert();
	WebElement txtUsername = driver.findElement(By.id("sign-username"));
	fillTextBox(txtUsername, readFromExcel(1, 0));
	//s.assertTrue(false, "Username validation failed");
	//System.out.println("Priya");
	
	WebElement txtPassword = driver.findElement(By.id("sign-password"));
	fillTextBox(txtPassword, readFromExcel(1, 1));
	

	}
	

}
