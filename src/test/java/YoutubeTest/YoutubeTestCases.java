package YoutubeTest;

import org.testng.annotations.Test;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutubeTestCases extends BaseTestCase{
    @Test(priority = 1)
    public void validateHomePage(){
        this.myDriver.get("https://www.youtube.com/");

        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        youtubeHomePageUserSteps.searchAProduct("Shakira");
    }
}
