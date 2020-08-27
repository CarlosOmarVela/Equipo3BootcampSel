package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.page.YoutubeVideoPage;
import youtube.pageobjects.mainArea.videoPage.VideoPageMainAreaPageObject;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;

    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }


    //private VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();

    public boolean mainVideoIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMainVideo().isDisplayed();
    }

    public boolean mainTitleIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMainTitle().isDisplayed();
    }

    public boolean mainViewsIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMainViews().isDisplayed();

    }

    public boolean mainLikesIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMainLikes().isDisplayed();

    }

    public boolean mainDislikesIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMainDislikes().isDisplayed();
    }

    public boolean descriptionIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getDescription().isDisplayed();
    }

    public boolean commentsIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getComments().isDisplayed();
    }

    //---

    public boolean playButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getPlayButton().isDisplayed();
    }

    public boolean nextVideoButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getNextVideoButton().isDisplayed();
    }

    public boolean videoDurationLabelIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getVideoDurationLabel().isDisplayed();
    }

    public boolean enableSubtitlesIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getEnableSubtitles().isDisplayed();
    }

    public boolean settingsButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getSettingsButton().isDisplayed();
    }

    public boolean miniPlayerButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getMiniPlayerButton().isDisplayed();
    }

    public boolean sizeButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getSizeButton().isDisplayed();
    }

    public boolean fullScreenButtonIsPresent() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getFullScreenButton().isDisplayed();
    }

    public void clickOnPlayButton() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getPlayButton().click();
    }

    public void clickOnNextVideoButton(int time, int repeat) throws InterruptedException{
        for(int i = 0; i < repeat; i++) {
            VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
            videoPageMainAreaPageObject.getNextVideoButton().click();
            Thread.sleep(time);
        }
    }

    public String getVideoDuration() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        return videoPageMainAreaPageObject.getVideoDurationLabel().getText();
    }

    public void enablieSubTitles() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getEnableSubtitles().click();
    }

    public void clickOptionsButton() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getSettingsButton().click();
    }

    public void clickOnMiniPlayerButton() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getMiniPlayerButton().click();
    }

    public void maximizePlayBackVideo() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getFullScreenButton().click();
    }

    public void clickOnSizeButton() {
        VideoPageMainAreaPageObject videoPageMainAreaPageObject = this.youtubeVideoPage.getYoutubeVideoPageMainAreaComponent().getVideoPageMainAreaPageObject();
        videoPageMainAreaPageObject.getSizeButton().click();
    }
}
