package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		
		driver.navigate().to("www.rahulshettyacademy.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}

}
