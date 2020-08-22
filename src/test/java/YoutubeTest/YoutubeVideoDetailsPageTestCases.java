package YoutubeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeVideoPageUserSteps;

@Listeners({ TestListener.class})
public class YoutubeVideoDetailsPageTestCases extends BaseTestCase {

    private YoutubeVideoPageUserSteps youtubeVideoPageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeVideoPageUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
    }

    @BeforeMethod
    public void beforeMethod(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
    }

    @Test
    public void validateHeader(){}

    @Test
    public void validateRelatedContent(){}

    @Test
    public void validateVideoPlayer(){}

    @Test
    public void validateVideoInformation(){}

    @Test
    public void validateComments(){}
}
