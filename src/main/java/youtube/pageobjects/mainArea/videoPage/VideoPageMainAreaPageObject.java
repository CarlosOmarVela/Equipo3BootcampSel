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

    public VideoPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnMainVideo(){
        this.mainVideo.click();
    }
}
