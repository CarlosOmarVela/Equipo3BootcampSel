package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.components.mainAreas.YoutubeResultPageMainAreaComponent;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

public class YoutubeResultPage extends YoutubeBasePage{

    private YoutubeResultPageMainAreaComponent resultPageMainAreaComponent;

    public YoutubeResultPage(WebDriver driver) {
        super(driver);
        this.resultPageMainAreaComponent = new YoutubeResultPageMainAreaComponent(driver);
    }

    public YoutubeResultPageMainAreaComponent getResultPageMainAreaComponent() {
        return resultPageMainAreaComponent;
    }
}
