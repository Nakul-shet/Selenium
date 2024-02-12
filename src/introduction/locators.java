package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("nakulnshet1@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("randomacademy");
		driver.findElement(By.className("signInBtn")).click();

		System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("random");
			
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.print(driver.findElement(By.cssSelector("form p")).getText()); 
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		Thread.sleep(1000);
		
		//Regular expression
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class , 'submit')]")).click();
		
		
	}
	
}
