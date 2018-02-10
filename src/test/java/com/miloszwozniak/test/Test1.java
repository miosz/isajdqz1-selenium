package com.miloszwozniak.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Test1 {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openPage(){
        driver.get("https://www.google.pl");
        WebElement buttonNameBtnk = driver.findElement(By.xpath("//input[@name='btnK']"));
        assertTrue("Button name=bnK hasn't been found", buttonNameBtnk.isDisplayed());

    }

    @After
    public void tearDown(){
        driver.close();
    }

}
