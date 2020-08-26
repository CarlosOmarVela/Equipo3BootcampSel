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
    public void validateComentsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
    }

    //------

    @Test
    public void validatePlayButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.playButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateNextVideoButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.nextVideoButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validatEvideoDurationLabelIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.videoDurationLabelIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateEnableSubtitlesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.enableSubtitlesIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateSettingsButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.settingsButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateMiniPlayerButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.miniPlayerButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateSizeButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.sizeButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void validateFullScreenButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.fullScreenButtonIsPresent(),"The comments area isn't present");
    }

    @Test
    public void playAndPauseVideo() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.playButtonIsPresent(),"The comments area isn't present");
        youtubeVideoPageUserSteps.clickOnPlayButton();
        Thread.sleep(2000);
        youtubeVideoPageUserSteps.clickOnPlayButton();
        Thread.sleep(2000);
        youtubeVideoPageUserSteps.clickOnPlayButton();
    }



    /*@Test
    public void validateRelatedContent(){}

    @Test
    public void validateVideoPlayer(){}

    @Test
    public void validateVideoInformation(){}

    @Test
    public void validateComments(){}*/
}
