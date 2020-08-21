package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.mainAreas.YoutubeVideoPageMainAreaComponent;

public class YoutubeVideoPage extends YoutubeBasePage{

    private YoutubeVideoPageMainAreaComponent youtubeVideoPageMainAreaComponent;

    public YoutubeVideoPage(WebDriver driver) {
        super(driver);
        this.youtubeVideoPageMainAreaComponent = new YoutubeVideoPageMainAreaComponent(driver);
    }

    public YoutubeVideoPageMainAreaComponent getYoutubeVideoPageMainAreaComponent() {
        return youtubeVideoPageMainAreaComponent;
    }
}
