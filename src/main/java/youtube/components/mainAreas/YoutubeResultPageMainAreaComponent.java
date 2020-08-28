package youtube.components.mainAreas;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeBaseMainAreaComponent;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

public class YoutubeResultPageMainAreaComponent extends YoutubeBaseMainAreaComponent {

    private ResultPageMainAreaPageObject resultPageMainAreaPageObject;

    public YoutubeResultPageMainAreaComponent(WebDriver driver){
        this.resultPageMainAreaPageObject = new ResultPageMainAreaPageObject(driver, driver.getCurrentUrl());
    }

    public ResultPageMainAreaPageObject getResultPageMainAreaPageObject() { return resultPageMainAreaPageObject; }
}
