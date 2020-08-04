package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class WebDriverFactory {

    public static WebDriver getDriver(String browser) {

        if(browser.toLowerCase().equals("chrome")) {
            //Chrome Options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            //Download & Setup WebDriver binary for Chrome
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver(options);

        } else if (browser.toLowerCase().equals("firefox")) {

            //Firefox Options
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            //Download & Setup WebDriver binary for Firefox
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver(options);

        } else {
            return null;
        }
    }
}
