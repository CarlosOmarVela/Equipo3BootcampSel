package youtubenewdesign.components;

import org.openqa.selenium.WebDriver;
import youtubenewdesign.pageobjects.header.*;

public class YoutubeHeaderComponent {
    private YoutubeSearchPageObject youtubeSearchPageObject;
    private YoutubeAuthenticationPageObject youtubeAuthenticationPageObject;
    private YoutubeCreatePageObject youtubeCreatePageObject;
    private YoutubeSettingsPageObject youtubeSettingsPageObject;
    private YoutubeSideBarPageObject youtubeSideBarPageObject;
    private YoutubeAppsPageObject youtubeAppsPageObject;
    private YoutubeLogoPageObject youtubeLogoPageObject;

    public YoutubeHeaderComponent(WebDriver driver){
        this.youtubeSearchPageObject = new YoutubeSearchPageObject(driver,driver.getCurrentUrl());
        this.youtubeAuthenticationPageObject = new YoutubeAuthenticationPageObject(driver,driver.getCurrentUrl());
        this.youtubeCreatePageObject = new YoutubeCreatePageObject(driver,driver.getCurrentUrl());
        this.youtubeSettingsPageObject = new YoutubeSettingsPageObject(driver,driver.getCurrentUrl());
        this.youtubeSideBarPageObject = new YoutubeSideBarPageObject(driver,driver.getCurrentUrl());
        this.youtubeAppsPageObject = new YoutubeAppsPageObject(driver,driver.getCurrentUrl());
        this.youtubeLogoPageObject = new YoutubeLogoPageObject(driver,driver.getCurrentUrl());
    }

    public YoutubeSearchPageObject getYoutubeSearchPageObject() {
        return youtubeSearchPageObject;
    }

    public YoutubeAuthenticationPageObject getYoutubeAuthenticationPageObject() {
        return youtubeAuthenticationPageObject;
    }

    public YoutubeCreatePageObject getYoutubeCreatePageObject() {
        return youtubeCreatePageObject;
    }

    public YoutubeSettingsPageObject getYoutubeSettingsPageObject() {
        return youtubeSettingsPageObject;
    }

    public YoutubeSideBarPageObject getYoutubeSideBarPageObject() {
        return youtubeSideBarPageObject;
    }

    public YoutubeAppsPageObject getYoutubeAppsPageObject() {
        return youtubeAppsPageObject;
    }

    public YoutubeLogoPageObject getYoutubeLogoPageObject() {
        return youtubeLogoPageObject;
    }
}
