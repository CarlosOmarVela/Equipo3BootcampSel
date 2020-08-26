package youtube.pageobjects.mainArea.videoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class VideoPageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[1]/video")
    private WebElement mainVideo;

    @FindBy(how = How.XPATH, using = "//*[@id='container']/h1/yt-formatted-string")
    private WebElement mainTitle;

    @FindBy(how = How.XPATH, using = "//*[@id='count']/yt-view-count-renderer/span[1]")
    private WebElement mainViews;

    @FindBy(how = How.XPATH, using = "//*[@id='top-level-buttons']/ytd-toggle-button-renderer[1]/a")
    private WebElement mainLikes;

    @FindBy(how = How.XPATH, using = "//*[@id='top-level-buttons']/ytd-toggle-button-renderer[2]/a")
    private WebElement mainDislikes;

    @FindBy(how = How.XPATH, using = "//*[@id='content']//div[@id='description']")
    private WebElement description;

    @FindBy(how = How.XPATH, using = "//*[@id='count']/yt-formatted-string")
    private WebElement comments;

    //---------------
    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-left-controls']/button")
    private WebElement playButton;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-left-controls']/a[@class='ytp-next-button ytp-button']")
    private WebElement nextVideoButton;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-left-controls']/div[@class='ytp-time-display notranslate']")
    private WebElement videoDurationLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-right-controls']/button[@class='ytp-subtitles-button ytp-button']")
    private WebElement enableSubtitles;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-right-controls']/button[@class='ytp-button ytp-settings-button']")
    private WebElement settingsButton;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-right-controls']/button[@class='ytp-miniplayer-button ytp-button']")
    private WebElement miniPlayerButton;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-right-controls']/button[@class='ytp-size-button ytp-button']")
    private WebElement sizeButton;

    @FindBy(how = How.XPATH, using = "//*[@id='movie_player']/div[@class='ytp-chrome-bottom']/div[@class='ytp-chrome-controls']/div[@class='ytp-right-controls']/button[@class='ytp-fullscreen-button ytp-button']")
    private WebElement fullScreenButton;

    //--------------------------
    public VideoPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnMainVideo(){
        this.mainVideo.click();
    }

    public WebElement getMainVideo() { return this.mainVideo; }

    public WebElement getMainTitle() { return this.mainTitle; }

    public WebElement getMainViews() { return this.mainViews; }

    public WebElement getMainLikes() { return this.mainLikes; }

    public WebElement getMainDislikes() { return this.mainDislikes; }

    public WebElement getDescription() { return this.description; }

    public WebElement getComments() { return this.comments; }

    //------

    public WebElement getPlayButton() { return this.playButton; }

    public WebElement getNextVideoButton() { return this.nextVideoButton; }

    public WebElement getVideoDurationLabel() { return this.videoDurationLabel; }

    public WebElement getEnableSubtitles() { return this.enableSubtitles; }

    public WebElement getSettingsButton() { return this.settingsButton; }

    public WebElement getMiniPlayerButton() { return this.miniPlayerButton; }

    public WebElement getSizeButton() { return this.sizeButton; }

    public WebElement getFullScreenButton() { return this.fullScreenButton; }

}
