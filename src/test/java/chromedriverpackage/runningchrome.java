package chromedriverpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class runningchrome {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://facebook.com");

    }
}
