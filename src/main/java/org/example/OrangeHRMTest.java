package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest {

    WebDriver driver;
    @Test(priority=1)
    void openApp(){
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
    }
    @Test(priority=2)
    void testlog(){
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("logo displayed --"+status);
    }
    @Test(priority=3)
    void  testLogin() throws InterruptedException {
        Thread. sleep(1000);
        driver.findElement(By.name("Username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority = 3)
    void appClose(){
        driver.close();
    }

}
