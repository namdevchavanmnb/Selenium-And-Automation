package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement user = driver.findElement(By.cssSelector("#email.inputtext._55r1"));

        boolean username = user.isDisplayed();
        System.out.println(username);

        WebElement pass = driver.findElement(By.name("pass"));

        boolean password = pass.isDisplayed();
        System.out.println(password);

        if (username == password) {
            System.out.println("Both username and password fields are displayed");
        } else {
            System.out.println("username and password fields are NOT Displayed");
        }
        Thread.sleep(3000);

        driver.close();
    }

}

