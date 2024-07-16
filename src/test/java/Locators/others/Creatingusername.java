package Locators.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Creatingusername {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();

            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.name("email")).sendKeys("anotherEmail@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Wrongpassword");
            driver.findElement(By.id("loginBtn")).click();
            Thread.sleep(10000);
            String errorText = driver.findElement(By.className("error")).getText();
            System.out.println(errorText);

            driver.quit();

        }

    }

