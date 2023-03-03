package com.bridgelabz.cqabatch115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupPage {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello User");

        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page/");


        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Namdev");
        Thread.sleep(2000);

        driver.findElement(By.name("lasttname")).sendKeys("Chavan");
        Thread.sleep(2000);
        driver.findElement(By.name("Reg.email")).sendKeys("cnamdev79@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("Reg.pass")).sendKeys("Namdev@123");
        Thread.sleep(2000);

        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByIndex(2);
        Thread.sleep(2000);

        Select months = new Select(driver.findElement(By.name("birthday_month")));
        months.selectByVisibleText("feb");
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue("1993");
        Thread.sleep(2000);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();

        driver.close();
    }
}

