package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/Front%20End%20Development/JavaScript/Practise/CRUD001/index.html");
		Thread.sleep(1000);
		driver.findElement(By.id("data")).click();
		driver.findElement(By.id("data")).sendKeys("Abhishek Kumar");
		driver.findElement(By.id("adduser")).click();driver.findElement(By.id("data")).click();
		driver.findElement(By.id("data")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("data")).sendKeys("Akshita Trived");
		driver.findElement(By.id("adduser")).click();
		driver.findElement(By.id("data")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("data")).click();
		driver.findElement(By.id("data")).sendKeys("Shashi Sharma");
		driver.findElement(By.id("adduser")).click();
		driver.findElement(By.id("data")).clear();
		
		//driver.close();
		
	}

}
