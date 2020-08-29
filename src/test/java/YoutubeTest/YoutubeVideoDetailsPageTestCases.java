package YoutubeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeVideoPageUserSteps;
import io.qameta.allure.*;

@Listeners({ TestListener.class})
@Epic("YouTube Tes")
@Feature("Video Details Page")
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
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if the main video area is present")
    public void validateMainVideoIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainVideoIsPresent(),"The main video playback isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainVideoIsPresent(),"The main video playback isn't displayed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if main title is presen")
    public void validateMainTitleIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainTitleIsPresent(),"The main Title Area isn't displayed ");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainTitleIsPresent(),"The main Title Area isn't displayed ");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if the main video are is present")
    public void validateMainViewsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainViewsIsPresent(),"The main mainviews layer isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainViewsIsPresent(),"The main mainviews layer isn't displayed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if the likes button is present")
    public void validateMainLikesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainLikesIsPresent(),"The likes button isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainLikesIsPresent(),"The likes button isn't displayed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if the dislikes button is preseent")
    public void validateMainDisLikesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.mainDislikesIsPresent(),"The disLikes button isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.mainDislikesIsPresent(),"The disLikes button isn't displayed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if description area is present")
    public void validateDescriptionsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.descriptionIsPresent(),"The descliption area isn't displayed");
        Assert.assertTrue(youtubeVideoPageUserSteps.descriptionIsPresent(),"The descliption area isn't displayed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if there is a comments area")
    public void validateComentsIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
    }

    //------

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if play button is present")
    public void validatePlayButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.playButtonIsPresent(),"The play button isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if next video button is pressent")
    public void validateNextVideoButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.nextVideoButtonIsPresent(),"The next video button isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if duration label is present")
    public void validatEvideoDurationLabelIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.videoDurationLabelIsPresent(),"The label time duration isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if enable sub titels button is present")
    public void validateEnableSubtitlesIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.enableSubtitlesIsPresent(),"The valid enable sub titles isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if setting button is pressent")
    @Step("Check if setting button is pressent")
    public void validateSettingsButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.settingsButtonIsPresent(),"The setting button isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if mini player button is pressent")
    @Step("Check if mini player button is pressent")
    public void validateMiniPlayerButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.miniPlayerButtonIsPresent(),"The mini player button isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if size button is present")
    @Step("Check if size button is present")
    public void validateSizeButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.sizeButtonIsPresent(),"The size button isn't present");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check if full screen button is present")
    @Step("Check if full screen button is present")
    public void validateFullScreenButtonIsPresent(){
        //Assert.assertFalse(youtubeVideoPageUserSteps.commentsIsPresent(),"The comments area isn't present");
        Assert.assertTrue(youtubeVideoPageUserSteps.fullScreenButtonIsPresent(),"The full screen isn't present");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Play and pause video")
    @Step("Play and pause video")
    public void playAndPauseVideo() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.playButtonIsPresent(),"The play button isn't present");
        youtubeVideoPageUserSteps.clickOnPlayButton();
        Thread.sleep(2000);
        youtubeVideoPageUserSteps.clickOnPlayButton();
        Thread.sleep(2000);
        youtubeVideoPageUserSteps.clickOnPlayButton();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Click on next video button")
    @Step("Click on next video button")
    public void changeToTheNextVideo() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.nextVideoButtonIsPresent(), "The NEXT button isn't present");
        //this class press many times the button NEXT VIDEO, "time" parameter define the time between the button NEXT VIDEO is presed
        // and the "repeat" parameter define how many times the button will be pressed
        youtubeVideoPageUserSteps.clickOnNextVideoButton(2000, 6);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Get video duration video")
    @Step("Get video duration video")
    public void getAndPrintVideoDurationLabel(){
        Assert.assertTrue(youtubeVideoPageUserSteps.videoDurationLabelIsPresent(),"The label of video isn't pressent");
        System.out.println("The current video duration is: " + youtubeVideoPageUserSteps.getVideoDuration());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Enable Sub titles")
    @Step("Enable Sub titles")
    public void enableVideoSubTitles () throws InterruptedException{
        Assert.assertTrue(youtubeVideoPageUserSteps.enableSubtitlesIsPresent(), "The sub titles button isn't present");
        youtubeVideoPageUserSteps.enablieSubTitles();
        Thread.sleep(6000);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Click on options button")
    @Step("Click on options button")
    public void clicOnOptionsButton() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.settingsButtonIsPresent(),"");
        youtubeVideoPageUserSteps.clickOptionsButton();
        Thread.sleep(3000);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Mini playback video")
    @Step("Mini playback video")
    public void convertToMiniPayBacktheCurrentVideo() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.miniPlayerButtonIsPresent(),"The mini player button isn't pressent");
        Thread.sleep(1500);
        youtubeVideoPageUserSteps.clickOnMiniPlayerButton();
        Thread.sleep(5000);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Full Screen video")
    @Step("Full Screen video")
    public void fullScreenPlayBackVideo() throws InterruptedException{
        Assert.assertTrue(youtubeVideoPageUserSteps.fullScreenButtonIsPresent(),"The full screen button isn't pressent");
        Thread.sleep(1500);
        youtubeVideoPageUserSteps.maximizePlayBackVideo();
        Thread.sleep(5000);
        youtubeVideoPageUserSteps.maximizePlayBackVideo();
        Thread.sleep(1500);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Cheange video to cinema mode")
    @Step("Cheange video to cinema mode")
    public void CinemaModePlayback() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.sizeButtonIsPresent(),"The cinema mode button isn't present");
        Thread.sleep(1500);
        youtubeVideoPageUserSteps.clickOnSizeButton();
        Thread.sleep(4000);
        youtubeVideoPageUserSteps.clickOnSizeButton();
        Thread.sleep(1000);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("View playback fast")
    @Step("View playback fast")
    public void fastPlaybackVideo() throws InterruptedException {
        Assert.assertTrue(youtubeVideoPageUserSteps.settingsButtonIsPresent(),"The settings button isn't present");
        youtubeVideoPageUserSteps.maximizePlayBackVideo();
        Thread.sleep(500);
        youtubeVideoPageUserSteps.clickOptionsButton();
        Thread.sleep(500);
        youtubeVideoPageUserSteps.clickOnSpeedPlayBackOptions();
        Thread.sleep(500);
        youtubeVideoPageUserSteps.clickOnSpeedTwoOption();
        Thread.sleep(7000);
    }
}
