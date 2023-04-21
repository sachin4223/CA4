package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class AppTest
{
    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new  ChromeDriver();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize(); //for window to maximize
        Thread.sleep(15000);
    }
    @Test
    void dropDown() throws InterruptedException {
//        Select s1 = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")));
//        s1.selectByValue("sql");
//        Thread.sleep(3000);
//        Select s2 = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")));
//        s2.deselectByVisibleText("junit");
//        Thread.sleep(3000);
//        Select s3 = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")));
//        s3.deselectByVisibleText("jquery");
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")).sendKeys("SQL");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")).sendKeys("JUnit");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")).sendKeys("JQuery");
        Thread.sleep(1000);

        //checkbox
        WebElement e1 = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/label[1]"));
        e1.click();
        Thread.sleep(3000);
        WebElement e2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
        e2.click();

        Thread.sleep(3000);

        //radio button
        WebElement radio = driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/form[1]/input[5]"));
        radio.click();


    }
    @AfterClass
    void close(){
        driver.close();
    }

}
