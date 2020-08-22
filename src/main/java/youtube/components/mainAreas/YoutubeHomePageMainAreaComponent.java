package youtube.components.mainAreas;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeBaseMainAreaComponent;
import youtube.pageobjects.mainArea.homePage.HomePageMainAreaPageObject;

public class YoutubeHomePageMainAreaComponent extends YoutubeBaseMainAreaComponent {

    private HomePageMainAreaPageObject homePageMainAreaPageObject;

    public YoutubeHomePageMainAreaComponent(WebDriver driver){
        this.homePageMainAreaPageObject = new HomePageMainAreaPageObject(driver, driver.getCurrentUrl());
    }

    public HomePageMainAreaPageObject getHomePageMainAreaPageObject() {
        return homePageMainAreaPageObject;
    }
}
