package YoutubeTest;

import org.testng.Assert;
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
        this.myDriver.get(PropertyReader.getProperty("test.properties","URLseleniumVideo"));
    }

    @Test
    public void validateMainVideoIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainVideoIsPresent(),"The main video playback isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainVideoIsPresent(),"The main video playback isn't displayed");
    }

    @Test
    public void validateMainTitleIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainTitleIsPresent(),"The main Title Area isn't displayed ");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainTitleIsPresent(),"The main Title Area isn't displayed ");
    }

    @Test
    public void validateMainViewsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainViewsIsPresent(),"The main mainviews layer isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainViewsIsPresent(),"The main mainviews layer isn't displayed");
    }

    @Test
    public void validateMainLikesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainLikesIsPresent(),"The likes button isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainLikesIsPresent(),"The likes button isn't displayed");
    }

    @Test
    public void validateMainDisLikesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainDislikesIsPresent(),"The disLikes button isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainDislikesIsPresent(),"The disLikes button isn't displayed");
    }

    @Test
    public void validateDescriptionsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.descriptionIsPresent(),"The descliption area isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.descriptionIsPresent(),"The descliption area isn't displayed");
    }

    @Test
    public void validatComentsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
    }

    /*@Test
    public void validateHeader(){}

    @Test
    public void validateRelatedContent(){}

    @Test
    public void validateVideoPlayer(){}

    @Test
    public void validateVideoInformation(){}

    @Test
    public void validateComments(){}*/
}
