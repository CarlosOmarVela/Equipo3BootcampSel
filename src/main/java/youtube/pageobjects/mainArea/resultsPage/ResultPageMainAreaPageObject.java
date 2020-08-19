package youtube.pageobjects.mainArea.resultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class ResultPageMainAreaPageObject extends BasePageObject {

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

    public ResultPageMainAreaPageObject(WebDriver driver, String baseURL) {
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

}
