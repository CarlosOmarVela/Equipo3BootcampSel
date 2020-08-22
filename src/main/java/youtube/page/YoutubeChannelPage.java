package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.mainAreas.YoutubeChannelPageMainAreaComponent;

public class YoutubeChannelPage extends YoutubeBasePage{

    private YoutubeChannelPageMainAreaComponent youtubeChannelPageMainAreaComponent;

    public YoutubeChannelPage(WebDriver driver) {
        super(driver);
        this.youtubeChannelPageMainAreaComponent = new YoutubeChannelPageMainAreaComponent(driver);
    }

    public YoutubeChannelPageMainAreaComponent getYoutubeChannelPageMainAreaComponent() {
        return youtubeChannelPageMainAreaComponent;
    }
}
