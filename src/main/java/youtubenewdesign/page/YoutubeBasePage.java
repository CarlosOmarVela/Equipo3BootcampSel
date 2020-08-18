package youtubenewdesign.page;

import org.openqa.selenium.WebDriver;
import youtubenewdesign.components.YoutubeHeaderComponent;
import youtubenewdesign.components.YoutubeMainAreaComponent;
import youtubenewdesign.components.YoutubeVideoComponent;

public class YoutubeBasePage {
    private YoutubeHeaderComponent youtubeHeaderComponent;
    private YoutubeMainAreaComponent youtubeMainAreaComponent;
    private YoutubeVideoComponent youtubeVideoComponent;

    public YoutubeBasePage(WebDriver driver){
        this.youtubeHeaderComponent = new YoutubeHeaderComponent(driver);
        this.youtubeMainAreaComponent = new YoutubeMainAreaComponent(driver);
        this.youtubeVideoComponent = new YoutubeVideoComponent(driver);
    }

    public YoutubeHeaderComponent getYoutubeHeaderComponent() {
        return youtubeHeaderComponent;
    }

    public YoutubeMainAreaComponent getYoutubeMainAreaComponent() {
        return youtubeMainAreaComponent;
    }

    public YoutubeVideoComponent getYoutubeVideoComponent() {
        return youtubeVideoComponent;
    }
}
