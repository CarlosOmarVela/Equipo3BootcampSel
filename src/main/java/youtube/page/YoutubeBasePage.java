package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeHeaderComponent;
import youtube.components.YoutubeLeftAreaComponent;
import youtube.components.YoutubeMainAreaComponent;
import youtube.components.YoutubeVideoComponent;

public class YoutubeBasePage {
    private YoutubeHeaderComponent youtubeHeaderComponent;
    private YoutubeMainAreaComponent youtubeMainAreaComponent;
    private YoutubeVideoComponent youtubeVideoComponent;
    private YoutubeLeftAreaComponent youtubeLeftAreaComponent;

    public YoutubeBasePage(WebDriver driver){
        this.youtubeHeaderComponent = new YoutubeHeaderComponent(driver);
        this.youtubeMainAreaComponent = new YoutubeMainAreaComponent(driver);
        this.youtubeVideoComponent = new YoutubeVideoComponent(driver);
        this.youtubeLeftAreaComponent = new YoutubeLeftAreaComponent(driver);
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

    public YoutubeLeftAreaComponent getYoutubeLeftAreaComponent(){return youtubeLeftAreaComponent;}
}
