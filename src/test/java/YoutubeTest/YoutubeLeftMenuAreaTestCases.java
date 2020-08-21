package YoutubeTest;

import org.testng.annotations.Test;
import utils.PropertyReader;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutubeLeftMenuAreaTestCases extends BaseTestCase {
    @Test
    public void validateLeftMenuHomeButton(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
    }
}
