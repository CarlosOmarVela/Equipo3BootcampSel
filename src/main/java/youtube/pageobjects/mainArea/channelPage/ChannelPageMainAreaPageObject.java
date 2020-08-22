package youtube.pageobjects.mainArea.channelPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

import java.util.List;

public class ChannelPageMainAreaPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//yt-formatted-string[@id='text' and contains(text(),'News')]")
    private WebElement channelName;

    @FindBy(how = How.XPATH, using = "//ytd-grid-video-renderer[@class='style-scope yt-horizontal-list-renderer']")
    private List<WebElement> videosInChannel;

    public ChannelPageMainAreaPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public String getChannelName(){
        return channelName.getText();
    }

    public int countVideosInChannel(){
        return videosInChannel.size();
    }
}
