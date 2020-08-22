package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeChannelPage;
import youtube.pageobjects.mainArea.channelPage.ChannelPageMainAreaPageObject;
import youtube.pageobjects.mainArea.homePage.HomePageMainAreaPageObject;

public class YoutubeChannelPageUserSteps {
    private YoutubeChannelPage youtubeChannelPage;

    public YoutubeChannelPageUserSteps(WebDriver driver){
        this.youtubeChannelPage = new YoutubeChannelPage(driver);
    }

    public String nameOfChannel(){
        ChannelPageMainAreaPageObject channelPageMainAreaPageObject = this.youtubeChannelPage.getYoutubeChannelPageMainAreaComponent().getChannelPageMainAreaPageObject();
        return channelPageMainAreaPageObject.getChannelName();
    }

    public boolean enoughVideosInNewsChannel(){
        ChannelPageMainAreaPageObject channelPageMainAreaPageObject = this.youtubeChannelPage.getYoutubeChannelPageMainAreaComponent().getChannelPageMainAreaPageObject();
        if (channelPageMainAreaPageObject.countVideosInChannel() >= 5){
            return true;
        }
        return false;
    }
}
