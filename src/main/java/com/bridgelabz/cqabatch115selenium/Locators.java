package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;


public class Locators {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.rediff.com/");
       //classname

        driver.findElement(By.className("signin")).click();
        Thread.sleep(1000);
        //id

        driver.findElement(By.id("login")).sendKeys("namdevchavanmnb");
        //name

        driver.findElement(By.name("passwd")).sendKeys("Rediff@123");
        //classname

      //  driver.findElement(By.className("signinbtn")).click();
     //   Thread.sleep(2000);
        //linkText

       driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
       //partiallinkText

        driver.findElement(By.partialLinkText("Rediff Hom")).click();

    }
}
