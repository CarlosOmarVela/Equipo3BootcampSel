package youtube.page;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

public class YoutubeResultPage extends YoutubeBasePage{

    private ResultPageMainAreaPageObject resultPageMainAreaPageObject;

    public YoutubeResultPage(WebDriver driver) {
        super(driver);
        this.resultPageMainAreaPageObject = new ResultPageMainAreaPageObject(driver, driver.getCurrentUrl());
    }

    public ResultPageMainAreaPageObject getYoutubeResultPageMainAreaComponent() {
        return resultPageMainAreaPageObject;
    }
}
