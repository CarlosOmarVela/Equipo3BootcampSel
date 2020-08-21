package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.mainAreas.YoutubeHomePageMainAreaComponent;

public class YoutubeHomePage extends YoutubeBasePage{

    private YoutubeHomePageMainAreaComponent youtubeHomePageMainAreaComponent;

    public YoutubeHomePage(WebDriver driver) {
        super(driver);
        this.youtubeHomePageMainAreaComponent = new YoutubeHomePageMainAreaComponent(driver);
    }

    public YoutubeHomePageMainAreaComponent getYoutubeHomePageMainAreaComponent() {
        return youtubeHomePageMainAreaComponent;
    }
}
