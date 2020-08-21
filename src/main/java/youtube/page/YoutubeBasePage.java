package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeHeaderComponent;
import youtube.components.YoutubeLeftAreaComponent;

public class YoutubeBasePage {
    private YoutubeHeaderComponent youtubeHeaderComponent;
    private YoutubeLeftAreaComponent youtubeLeftAreaComponent;

    public YoutubeBasePage(WebDriver driver){
        this.youtubeHeaderComponent = new YoutubeHeaderComponent(driver);
        this.youtubeLeftAreaComponent = new YoutubeLeftAreaComponent(driver);
    }

    public YoutubeHeaderComponent getYoutubeHeaderComponent() {
        return youtubeHeaderComponent;
    }

    public YoutubeLeftAreaComponent getYoutubeLeftAreaComponent(){return youtubeLeftAreaComponent;}

}
