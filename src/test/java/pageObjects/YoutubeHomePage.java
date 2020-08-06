package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class YoutubeHomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public YoutubeHomePage(WebDriver driver){
        this.driver = driver;

        // used to set the default waiting time throughout the program
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the default page load time
        this.driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        this.wait = new WebDriverWait(driver,10);
    }

    public String getCurrentPageTitle(){
        String title = driver.getTitle();
        return title;
    }

    public String getCurrentURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public void goToLeftMenuHomePage(){
        WebElement home = driver.findElement(By.xpath("//a[@title='Home']"));
        home.click();
        wait.until(ExpectedConditions.titleContains("YouTube"));
    }

    public void goToLeftMenuTrendingPage(){
        WebElement trending = driver.findElement(By.xpath("//a[@title='Trending']"));
        trending.click();
        wait.until(ExpectedConditions.titleContains("Trending - YouTube"));
    }

    public void goToLeftMenuSubscriptionPage(){
        WebElement subscription = driver.findElement(By.xpath("//a[@title='Subscriptions']"));
        subscription.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Sign in')]")));
    }







}
