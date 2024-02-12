package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String password = getPassword(driver);
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		Thread.sleep(2000); 
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText()); 
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText() , "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText() , "Hello rahul,");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
//		System.out.print(getPassword(driver));
		
		driver.close();
		
	}
	
	public static String getPassword(ChromeDriver driver) throws InterruptedException
	{	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText =  driver.findElement(By.cssSelector("form p")).getText(); 
		
		String password = passwordText.split("'")[1].split("'")[0];
		
		System.out.print(password + "\n");
		
		return password;
	}
}
