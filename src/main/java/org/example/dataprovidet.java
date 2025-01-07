package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataprovidet {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test(dataProvider = "dp1o",dataProviderClass = extraneldata.class)
    void t(String id,String pass) {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(id);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        System.out.println("hello test");// h2[normalize-space()='My Account']

       boolean status= driver.findElement(By.xpath("// h2[normalize-space()='My Account']")).isDisplayed();
        if(status==true) {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            System.out.println( "this is the logout title   : "+driver.getTitle());

            Assert.assertTrue(true);
        }
            else{
               Assert.fail();
            }
        }


    @AfterClass
    void appclose() {
        driver.quit();
    }

    @DataProvider(name="dp1")
    Object[][] loginData()
    {
        Object[][] getdata={    {"jub@gmail.com","test12"},
                                {"hu@gmail.com","test23"},
                                {"jubayerhu3@gmail.com","12345ju@"} };
        return getdata;
    }
    @DataProvider(name="dp", indices = {0,2})
    Object[][] loginData1()
    {
        Object[][] getdata1={    {"jub@gmail.com","test12"},
                {"hu@gmail.com","test23"},
                {"jubayerhu3@gmail.com","12345ju@"} };

        return getdata1;
    }
}
