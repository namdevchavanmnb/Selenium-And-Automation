package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Page {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/");

//        driver.findElement(By.id("email")).sendKeys("cnamdev79@gmail.com");
//
//        driver.findElement(By.name("pass")).sendKeys("Namdev@123");
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

