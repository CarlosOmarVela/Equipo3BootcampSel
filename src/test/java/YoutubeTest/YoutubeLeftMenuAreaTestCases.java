package YoutubeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.PropertyReader;
import youtube.page.YoutubeHomePage;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutubeLeftMenuAreaTestCases extends BaseTestCase {
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
        Assert.assertEquals(this.myDriver.getCurrentUrl(),PropertyReader.getProperty("test.properties","URL"));
    }
    @Test
    public void validateLeftMenuTrendingButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuTrendingButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/trending");
    }
    @Test
    public void validateLeftMenuSubscriptionsButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuSubscriptionsButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/subscriptions");
    }
    @Test
    public void validateLeftMenuLibraryButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuLibraryButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/library");
    }
    @Test
    public void validateLeftMenuHistoryButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHistoryButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/history");
    }
}
