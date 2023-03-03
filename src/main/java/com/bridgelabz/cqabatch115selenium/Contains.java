package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]"));

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='cnamdev79@gmail.com']")).sendKeys("Namdev@123");

        driver.close();
    }
}

