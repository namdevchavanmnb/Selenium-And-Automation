package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepagedisplayedORNot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/");

//        driver.findElement(By.id("login")).sendKeys("namdevchavanmnb");
//
//        driver.findElement(By.name("passwd")).sendKeys("Rediff@123");
//
//        driver.findElement(By.name("login")).click();


        String expectedTitle = "Tutorials List - Javatpoint";

        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
//        If actual title contains "Enter Time" text then home page is displayed.
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }
    }
}

