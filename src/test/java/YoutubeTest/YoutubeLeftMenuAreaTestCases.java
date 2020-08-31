package YoutubeTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;

@Listeners({ TestListener.class})
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
    @Severity(SeverityLevel.NORMAL)
    public void validateLeftMenuHomeButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHomeButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),PropertyReader.getProperty("test.properties","URL"));
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateLeftMenuTrendingButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuTrendingButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/trending");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateLeftMenuSubscriptionsButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuSubscriptionsButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/subscriptions");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateLeftMenuLibraryButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuLibraryButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/library");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateLeftMenuHistoryButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHistoryButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/history");
    }
}
