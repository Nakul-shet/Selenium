package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int adultloop = 4;
		
		while(adultloop > 1) {
			driver.findElement(By.id("hrefIncAdt")).click();
			adultloop--;
		}
		

		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
