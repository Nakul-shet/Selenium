package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//For checkbox 
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
		
		// To count the number of codes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 

	}

}
