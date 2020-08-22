package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.page.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;

    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }

}
