package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.mainAreas.YoutubeResultPageMainAreaComponent;

public class YoutubeResultPage extends YoutubeBasePage{

    private YoutubeResultPageMainAreaComponent youtubeResultPageMainAreaComponent;

    public YoutubeResultPage(WebDriver driver) {
        super(driver);
        this.youtubeResultPageMainAreaComponent = new YoutubeResultPageMainAreaComponent(driver);
    }

    public YoutubeResultPageMainAreaComponent getYoutubeResultPageMainAreaComponent() {
        return youtubeResultPageMainAreaComponent;
    }
}
