package ui;

import org.testng.annotations.*;

public class GroupTest {

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

    @Test(priority = 1 , groups = "regression")
    public void test01(){
        System.out.println("Printing Test 1");
    }

    @Test(priority = 2 , groups = "regression")
    public void test02(){
        System.out.println("Printing Test 2");
    }

    @Test(groups = {"regression" , "bvt"})
    public void test03(){
        System.out.println("Printing Test 3");
    }

    @Test(groups = "bvt")
    public void test04(){
        System.out.println("Printing Test 4");
    }
}
