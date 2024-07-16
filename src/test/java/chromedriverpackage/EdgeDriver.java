package chromedriverpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class EdgeDriver {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://retail.tekschool-students.com");


    }
}