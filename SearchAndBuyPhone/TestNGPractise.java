package SearchAndBuyPhone;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractise {
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Webdriver Instace Created");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("Webdriver Instance Closed");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		//System.out.println("Browser Launch");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("Browser Close");
	}
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("DataBase Connection Established");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Close the Database Instance");
	}
	
	@Test(priority = 1)
	public void Login() {
		System.out.println("Login to Banking Application");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority = 4)
	public void ViewAccountDetails() {
		System.out.println("Customer can view Account details");
	}
	
	@Test(priority = 2)
	public void FundTransfer() {
		System.out.println("Customer can transfer funds");
	}
	
	@Test(priority = 3)
	public void BillPayments() {
		System.out.println("Customer can do the bill payment");
	}
	
	@Test(priority =5)
	public void ChangeAccountSettings() {
		System.out.println("Customer can change the account settings");
	}
	
	@Test(priority = 6)
	public void Logout() {
		System.out.println("User can logout from Banking Application");
	}
}
