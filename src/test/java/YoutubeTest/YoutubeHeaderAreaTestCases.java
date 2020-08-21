package YoutubeTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;

@Listeners({ TestListener.class})
public class YoutubeHeaderAreaTestCases extends BaseTestCase{
    private YoutubeHomePageUserSteps youtubeHomePageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
    }

    @BeforeMethod
    public void beforeMethod(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
    }

    @Test
    public void validateLeftMenuHomeButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHomeButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }
    @Test
    public void validateLogoHomePage(){
        youtubeHomePageUserSteps.clickOnYoutubeLogo();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }

    @Test
    public void validateCreateIcon(){
        youtubeHomePageUserSteps.clickOnCreate();
        //Assert.assertEquals(myDriver.findElement(By.xpath("(//button[@id='button']/yt-icon)[4](//button[@id='button']/yt-icon)[4]")),"(//button[@id='button']/yt-icon)[4](//button[@id='button']/yt-icon)[4]");
    }

    @Test
    public void validateAppsYoutubeIcon(){
        youtubeHomePageUserSteps.clickOnApps();
        //Assert.assertEquals(myDriver.findElement(By.xpath("(//*[@id='button']//yt-icon-button[@id='button'])[2]")),"(//*[@id='button']//yt-icon-button[@id='button'])[2]");
    }

    @Test
    public void validateSettingsIcon(){
        youtubeHomePageUserSteps.clickOnSettings();
        //Assert.assertEquals(myDriver.findElement(By.xpath("(//button[@id='button']/yt-icon)[6]")),"(//button[@id='button']/yt-icon)[6]");
    }

    @Test
    public void validateLoginButton(){
        youtubeHomePageUserSteps.clickOnAuthenticationButton();
        //Assert.assertEquals(myDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]")),"(//paper-button[@id='button']/yt-formatted-string)[2]");
    }
}
