package youtube.pageobjects.mainArea.resultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

import java.util.List;

public class ResultPageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "//*[@id='video-title']")
    private List<WebElement> videoTitle;

    @FindBy(how = How.XPATH, using = "//*[@id='thumbnail']")
    private List<WebElement> videoThumbnail;

    @FindBy(how = How.XPATH, using = "//ytd-video-meta-block[@class='style-scope ytd-video-renderer']//a")
    private List<WebElement> authors;

    @FindBy(how = How.XPATH, using = "//*[@id='description-text']")
    private List<WebElement> videoDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[1]")
    private List<WebElement> views;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[2]")
    private List<WebElement> dateRelease;

    public ResultPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public List<WebElement> clickOnVideoTitle(){
        this.videoTitle.get(1).getText();
        return null;
    }
    public List<WebElement> clickOnVideoThumbnail(){
        this.videoThumbnail.get(1).getText();
        return null;
    }
    public List<WebElement> clickOnViews(){
        return null;
    }
    public List<WebElement> clickOnDateRelease(){
        return null;
    }
    public List<WebElement> clickOnThumbnail(){
        return null;
    }

}
