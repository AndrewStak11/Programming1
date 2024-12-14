package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class RunTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://skillfactory.ru/");
            driver.manage().window().maximize();

            // Добавление ожидания
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.t-input-group.t-input-group_nm > div > input")).sendKeys("Андрей");
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.t-input-group.t-input-group_em > div > input")).sendKeys("Something@gmail.com");
            driver.findElement(By.cssSelector("#input_1676828667932")).sendKeys("(851) 393-99-99");
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {


        }
    }
}