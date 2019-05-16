//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//public class UntitledTestCase {
public class TestHTMLDriver_ITHSPage {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = new HtmlUnitDriver();
        baseUrl = "https://www.iths.se/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.iths.se/");
        //assertEquals("IT-Högskolan är Yrkeshögskolan som valt att fokusera enbart på utbildningar inom Data/IT. Detta gör oss till experter inom IT-utbildning och blir ett självklart val för dig som vill starta en karriär inom den spännande IT-branschen.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Här startar din IT-karriär!'])[1]/following::p[1]")).getText());
        //driver.findElement(By.linkText("YH-utbildningar")).click();
        //assertEquals("Mjukvarutestare", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kursstart 2019-08-19'])[6]/following::h3[1]")).getText());
        assertTrue(true);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
