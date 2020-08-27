package youtube.pageobjects.mainArea.resultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

import java.util.List;

public class ResultPageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "//ytd-video-renderer[@class='style-scope ytd-item-section-renderer']//*[@id='video-title']/yt-formatted-string")
    private List<WebElement> videoTitle;

    @FindBy(how = How.XPATH, using = "//ytd-video-meta-block[@class='style-scope ytd-video-renderer']//a")
    private List<WebElement> authors;

    @FindBy(how = How.XPATH, using = "//*[@id='description-text']")
    private List<WebElement> videoDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[1]")
    private List<WebElement> views;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[2]")
    private List<WebElement> dateRelease;

    @FindBy(how = How.XPATH, using = "//ytd-video-renderer[@class='style-scope ytd-item-section-renderer']")
    private WebElement firstVideoInHomePage;

    Boolean display;

    public ResultPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public List<WebElement> getVideoTitles(){
        return videoTitle;
    }
    public List<WebElement> getAuthors(){
        return authors;
    }
    public List<WebElement> getDescriptions(){
        return videoDescription;
    }
    public List<WebElement> getViews(){
        return views;
    }
    public List<WebElement> getDateRelease(){
        return dateRelease;
    }

    public void clickOnFirstVideo(){
        this.firstVideoInHomePage.click();
    }
}