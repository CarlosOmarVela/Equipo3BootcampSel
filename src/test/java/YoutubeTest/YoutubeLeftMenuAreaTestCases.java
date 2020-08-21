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
}
