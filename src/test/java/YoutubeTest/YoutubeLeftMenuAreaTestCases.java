package YoutubeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutubeLeftMenuAreaTestCases extends BaseTestCase {
    @Test
    public void validateLeftMenuHomeButton(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.clickOnLeftMenuHomeButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),PropertyReader.getProperty("test.properties","URL"));
    }
    @Test
    public void validateLeftMenuTrendingButton(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.clickOnLeftMenuTrendingButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/trending");
    }
    @Test
    public void validateLeftMenuSubscriptionsButton(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.clickOnLeftMenuSubscriptionsButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/subscriptions");
    }
    @Test
    public void validateLeftMenuLibraryButton(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.clickOnLeftMenuLibraryButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/feed/library");
    }
}
