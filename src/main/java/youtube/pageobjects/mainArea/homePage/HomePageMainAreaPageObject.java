package youtube.pageobjects.mainArea.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

import java.util.List;

public class HomePageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "video-title")
    private WebElement videoTitle;

    @FindBy(how = How.XPATH, using = "//a[@class='yt-simple-endpoint style-scope yt-formatted-string']")
    private WebElement author;

    @FindBy(how = How.XPATH, using = "//span[@class='style-scope ytd-video-meta-block'][1]")
    private WebElement views;

    @FindBy(how = How.XPATH, using = "//span[@class='style-scope ytd-video-meta-block'][2]")
    private WebElement dateRelease;

    @FindBy(how = How.XPATH, using = "//a[@id='thumbnail']//img[@class='style-scope yt-img-shadow']")
    private WebElement thumbnail;

    @FindBy(how = How.XPATH, using = "(//div[@id='contents'])[1]/ytd-rich-item-renderer")
    private List<WebElement> videosInRecommendedSection;

    public HomePageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnVideoTitle(){
        this.videoTitle.click();
    }
    public void clickOnAuthor(){
        this.author.click();
    }
    public void clickOnViews(){
        this.views.click();
    }
    public void clickOnDateRelease(){
        this.dateRelease.click();
    }
    public void clickOnThumbnail(){
        this.thumbnail.click();
    }
    public int countVideosInRecommendedSection(){
        return videosInRecommendedSection.size();
    }
}
