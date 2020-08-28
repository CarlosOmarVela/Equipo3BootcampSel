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

    @FindBy(how = How.XPATH, using = "//ytd-search//div[@id='contents'][position()=1]//ytd-video-renderer")
    private List<WebElement> videosInResultPage;

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

    public boolean searchStringInLoadedVideos(String searchString){
        Iterator iter = videosInResultPage.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            if(temp.isDisplayed()){
                String videoTitle = temp.findElement(By.xpath("//a[@id='video-title']")).getAttribute("title");
                if(videoTitle.contains(searchString) != true){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean searchStringWithoutVideos(String searchString){
        Iterator iter = videosInResultPage.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            if(temp.isDisplayed()){
                String videoTitle = temp.findElement(By.xpath("//*[@id='contents']/ytd-background-promo-renderer/div[1]/div[1]")).getText();
                if(videoTitle.contains(searchString) != true){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validateAllVideosComponentInformation(){
        Iterator iter = videosInResultPage.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            if(temp.isDisplayed()){
                String videoTitle = temp.findElement(By.xpath("//a[@id='video-title-link']")).getAttribute("title");
                String author = temp.findElement(By.xpath("//a[@id='avatar-link']")).getAttribute("title");
                String viewsCount = temp.findElement(By.xpath("//div[@id='metadata-line']/span")).getText();
                WebElement videoThumbnail = temp.findElement(By.xpath("//a[@id='thumbnail']"));
                if (videoTitle.isEmpty() || author.isEmpty() || viewsCount.isEmpty() || videoThumbnail == null){
                    System.out.println(videoTitle);
                    System.out.println(author);
                    System.out.println(viewsCount);
                    System.out.println(videoThumbnail.getAttribute("href"));
                    return false;
                }
            }
        }
        return true;
    }
}