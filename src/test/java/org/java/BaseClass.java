package org.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.One.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {    
    	
    	public static WebDriver driver;
    	public static File f,d1;
    	public static JavascriptExecutor js;
    	
    	
    	public static void launchBrowser() {
           
        WebDriverManager.chromedriver().setup();     
        driver = new ChromeDriver();  	
        driver.get("https://www.demoblaze.com");

    }
    	
    	public static void maxWindow() {
    		driver.manage().window().maximize();
    	}
    	
    	public static void btnClick(WebElement buttonClick) {
    		buttonClick.click();
    		
    	}
    	
    	public static void fillTextBox(WebElement element, String value) {
    		element.sendKeys(value);
    	}
    	
    	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
    		
    		File f = new File("C:\\Users\\pc\\eclipse-workspace\\PriyaDec2024\\DemoBlaze\\Excel\\DemoBlaze.xlsx");
    		FileInputStream fin = new FileInputStream(f);
    		XSSFWorkbook book = new XSSFWorkbook(fin);		
    		XSSFSheet sh = book.getSheet("DemoBlaze");
    		XSSFRow r = sh.getRow(rowNo);
    		XSSFCell c = r.getCell(cellNo);
    		int type = c.getCellType();
    		String name = "";
    		if(type==1) {
    			name = c.getStringCellValue();
    			
    		}
    		return name;
}
    	
    	public static void signUpValidation() {
    		
    		Alert alert = driver.switchTo().alert();
    		String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
            System.out.println("Alert accepted successfully!");
    	}
    	
    	public static void textPresentOrNotValidation(WebElement element) {
    		
    		
    		List<String> textsToVerify = Arrays.asList("CATEGORIES", "Phones", "Laptops", "Monitors", "Home ", "Contact", "About us", "Cart", "Log in", "Log out");
    		String pageSource = driver.getPageSource();
    		for (String text : textsToVerify) {
                if (pageSource.contains(text)) {
                    System.out.println("The text \"" + text + "\" is present on the webpage.");
                } else {
                    System.out.println("The text \"" + text + "\" is NOT present on the webpage.");
                }
            }
    		
    		
    		/*String textToFind = "Welcome priya789";
    		boolean isTextPresent = driver.getPageSource().contains(textToFind);
    		if (isTextPresent) {
                System.out.println("The text \"" + textToFind + "\" is present on the webpage.");
            } else {
                System.out.println("The text \"" + textToFind + "\" is NOT present on the webpage.");
            }*/
    		
    	    		
    	}
    	
    	public static void pauseProgram() throws InterruptedException {
    		Thread.sleep(5000);
    	}
    	
    		public static void alertHandle() {
			
    			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    			System.out.println("Alert message: " + alert.getText());
    			alert.accept();
    			System.out.println("Alert accepted successfully.");
			

		}
    		
    		public static void cartProductValidation() {
    			
    			//WebElement table = driver.findElement(By.xpath("//div[@class='table-responsive']"));
    			
    			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='table-responsive']")));
    			List<WebElement> rows = table.findElements(By.tagName("tr"));
    			System.out.println("Table Data:");
    			for (WebElement row : rows) {
                    // Retrieve all cells (columns) in the current row
                    List<WebElement> cells = row.findElements(By.tagName("td"));

                    // Print cell data separated by tabs
                    for (WebElement cell : cells) {
                        System.out.print(cell.getText() + "\t");
                    }
                    System.out.println(); // Move to the next line after each row
                }
    		}
    			public static void purchaseButtonVisible() {
    				
    				WebElement button = driver.findElement(By.cssSelector(".btn.btn-success"));
    				System.out.println("Displayed: " + button.isDisplayed());
    				System.out.println("Enabled: " + button.isEnabled());
    			}
    		
    			
    			public static void pictures(String filename) throws IOException {
    				
    				TakesScreenshot ts = (TakesScreenshot)driver;
    				f = ts.getScreenshotAs(OutputType.FILE);
    				d1 = new File("C:\\Users\\pc\\eclipse-workspace\\PriyaDec2024\\DemoBlaze\\Pictures\\"+filename+".png");
    				FileHandler.copy(f, d1);
    			}
    			
    			public static void orderNumber(WebElement element4) {
    				js = (JavascriptExecutor)driver;
    				@SuppressWarnings("deprecation")
					String s4 = element4.getAttribute("value");
    				System.out.println("Order# is :"+s4);
    			}
}


