package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Sibling Traversal
		System.out.print(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		// Child to parent traversal
		System.out.print(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
