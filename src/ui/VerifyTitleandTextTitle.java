package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleandTextTitle {

    @Test
    public void titleTest(){

        SoftAssert softAsssert = new SoftAssert();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        System.out.println("Verifying Title");
        softAsssert.assertEquals(driver.getTitle() , expectedTitle);
        String actualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
        System.out.println("Verifying Search");
        softAsssert.assertEquals(actualText , expectedText , "The parameters does not match");
        driver.close();
        softAsssert.assertAll();
    }
}
