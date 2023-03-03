package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello User");
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("cnamdev79@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Namdev@1234");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
    }
}
