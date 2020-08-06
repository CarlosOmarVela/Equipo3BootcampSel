package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pageObjects.YoutubeHomePage;
import utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestLeftMenu {
    private WebDriver driver;
    private String webBrowser = "chrome";
    private String baseURL = "https://www.youtube.com/";
    private YoutubeHomePage objects;

    @BeforeTest // methods under this annotation will be executed prior to the first test case in the TestNG file.
    public void beforeTest(){
        // Init chrome driver
        driver = WebDriverFactory.getDriver(webBrowser);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the default page load time
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        // open web page
        driver.get(baseURL);

        // Initialize youtube home page objects before the other tests
        this.objects = new YoutubeHomePage(driver);
    }

    @BeforeMethod // methods under this annotation will be executed prior to each method in each test case.
    public void verifyHomePageTitle(){
        String expectedTitle = "YouTube";
        String actualTitle = objects.getYoutubeHomePageTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterMethod // methods under this annotation will be executed after each method in each test case.
    public void goBackToHomePage(){
        objects.goToHomePage();
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

    @AfterTest // methods under this annotation will be executed after all test cases in the TestNG file are executed.
    public void afterTest(){
        if(webBrowser.toLowerCase().equals("chrome")){
            driver.close();
            driver.quit();
        } else if (webBrowser.toLowerCase().equals("firefox")){
            driver.close();
        }
    }
}
