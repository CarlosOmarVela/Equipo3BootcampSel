package youtube.pageobjects.mainArea.resultsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

import java.util.Iterator;
import java.util.List;

public class ResultPageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "//h3[@class='title-and-badge style-scope ytd-video-renderer']/a[@id='video-title']/yt-formatted-string")
    private List<WebElement> videoTitle;

    @FindBy(how = How.XPATH, using = "//ytd-video-meta-block[@class='style-scope ytd-video-renderer']//a")
    private List<WebElement> authors;

    @FindBy(how = How.XPATH, using = "//*[@id='description-text']")
    private List<WebElement> videoDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[1]")
    private List<WebElement> views;

    @FindBy(how = How.XPATH, using = "//*[@id='metadata-line']/span[2]")
    private List<WebElement> dateRelease;

    @FindBy(how = How.XPATH, using = "//*[@id='contents']/ytd-video-renderer//h3/a/yt-formatted-string")
    private WebElement contents;

    Boolean display;

    public ResultPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public boolean getVideoTitles(){
        String videoTitle = contents.findElement(By.xpath("//a[@id='video-title']/yt-formatted-string")).getText();
        String author = contents.findElement(By.xpath("//ytd-video-meta-block[@class='style-scope ytd-video-renderer']//a")).getAttribute("title");
        String viewsCount = contents.findElement(By.xpath("//*[@id='metadata-line']/span[1]")).getText();
        String description = contents.findElement(By.xpath("//*[@id='description-text']")).getText();
        if (videoTitle.isEmpty() || author.isEmpty() || viewsCount.isEmpty() || description == null){
            return false;
        }
        return true;
    }

}