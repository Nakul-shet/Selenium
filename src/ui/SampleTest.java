package ui;

import org.testng.annotations.*;

public class SampleTest {

    @BeforeTest
    public void LoginToTheApplication(){
        System.out.println("Logged in to the application");
    }

    @AfterTest
    public void LogoutFromTheApplication(){
        System.out.println("Logged out from the application");
    }

    @BeforeMethod
    public void databaseConnectivity(){
        System.out.println("Connected to the database");
    }

    @AfterMethod
    public void databaseDisConnectivity(){
        System.out.println("Disconnected from the database");
    }

    @Test
    public void test01(){
        System.out.println("Printing Test 1");
    }

    @Test
    public void test02(){
        System.out.println("Printing Test 2");
    }


}
