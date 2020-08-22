package youtube.components.mainAreas;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeBaseMainAreaComponent;
import youtube.page.YoutubeChannelPage;
import youtube.pageobjects.mainArea.channelPage.ChannelPageMainAreaPageObject;
import youtube.pageobjects.mainArea.homePage.HomePageMainAreaPageObject;

public class YoutubeChannelPageMainAreaComponent extends YoutubeBaseMainAreaComponent {

    private ChannelPageMainAreaPageObject channelPageMainAreaPageObject;

    public YoutubeChannelPageMainAreaComponent(WebDriver driver){
        this.channelPageMainAreaPageObject = new ChannelPageMainAreaPageObject(driver, driver.getCurrentUrl());
    }

    public ChannelPageMainAreaPageObject getChannelPageMainAreaPageObject() {
        return channelPageMainAreaPageObject;
    }
}
