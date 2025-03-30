package SearchAndBuyPhone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test30032025 {
	
	@Test
	public void FruitSelect() {
		String ProjectLocation = System.getProperty("user.dir");
		  System.out.println(ProjectLocation);
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\Workspace2_Selenium\\Dec24SeleniumPractise\\lib\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("http://127.0.0.1:5500/Test1.html");
		  WebElement dropdown = driver.findElement(By.id("fruits"));
		  Select item = new Select(dropdown);
		  item.selectByValue("mango");
		  driver.findElement(By.id("submitBtn")).click();
		  
		
	}

}
