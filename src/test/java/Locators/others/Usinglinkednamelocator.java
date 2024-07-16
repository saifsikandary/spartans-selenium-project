package Locators.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinglinkednamelocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();

        By signinLocator = By.linkText("Sign in");
        WebElement signinelement = driver.findElement(signinLocator);
        signinelement.clear();

        By emaillocator = By.name("email");
        WebElement emailElement = driver.findElement(emaillocator);
        emailElement.sendKeys("Wrongemail@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("afghan@123");

        By loginLocator = By.id("LoginBtn");
        WebElement loginBtnelement = driver.findElement(loginLocator);
        loginBtnelement.click();

        Thread.sleep(1000);

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);

        //getText() will return the text of an element.
        String errorText = errorElement.getText();

        System.out.println(errorText);
        driver.quit();
    }
}
