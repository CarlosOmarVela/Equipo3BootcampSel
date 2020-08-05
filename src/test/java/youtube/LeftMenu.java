package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LeftMenu {
    private WebDriver driver;
    private String baseURL = "https://www.youtube.com/";

    @BeforeTest
    public void beforeTest(){
        // Init chrome driver
        driver = WebDriverFactory.getDriver("chrome");

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        // open web page
        driver.get(baseURL);
    }

    @Test
    public void pageTitle(){
        Assert.assertEquals(driver.getTitle(), "YouTube");
    }

    @Test
    public void leftMenuHome(){
        WebElement home = driver.findElement(By.xpath("//a[@title='Home']"));
        Assert.assertEquals(home.getAttribute("title"),"Home");
    }

    @Test
    public void leftMenuTrending(){
        WebElement trending = driver.findElement(By.xpath("//a[@title='Trending']"));
        Assert.assertEquals(trending.getAttribute("title"),"Trending");
    }

    @Test
    public void leftMenuSubscriptions(){
        WebElement subscriptions = driver.findElement(By.xpath("//a[@title='Subscriptions']"));
        Assert.assertEquals(subscriptions.getAttribute("title"),"Subscriptions");
    }

    @Test
    public void leftMenuLibrary(){
        WebElement library = driver.findElement(By.xpath("//a[@title='Library']"));
        Assert.assertEquals(library.getAttribute("title"),"Library");
    }

    @Test
    public void leftMenuHistory(){
        WebElement history = driver.findElement(By.xpath("//a[@title='History']"));
        Assert.assertEquals(history.getAttribute("title"),"History");
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}