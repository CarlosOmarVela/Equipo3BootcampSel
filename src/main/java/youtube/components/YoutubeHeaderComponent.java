package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerArea.*;

public class YoutubeHeaderComponent {
    private SearchPageObject youtubeSearchPageObject;
    private AuthenticationPageObject youtubeAuthenticationPageObject;
    private CreatePageObject youtubeCreatePageObject;
    private SettingsPageObject youtubeSettingsPageObject;
    private SideBarPageObject youtubeSideBarPageObject;
    private AppsPageObject youtubeAppsPageObject;
    private LogoPageObject youtubeLogoPageObject;

    public YoutubeHeaderComponent(WebDriver driver){
        this.youtubeSearchPageObject = new SearchPageObject(driver,driver.getCurrentUrl());
        this.youtubeAuthenticationPageObject = new AuthenticationPageObject(driver,driver.getCurrentUrl());
        this.youtubeCreatePageObject = new CreatePageObject(driver,driver.getCurrentUrl());
        this.youtubeSettingsPageObject = new SettingsPageObject(driver,driver.getCurrentUrl());
        this.youtubeSideBarPageObject = new SideBarPageObject(driver,driver.getCurrentUrl());
        this.youtubeAppsPageObject = new AppsPageObject(driver,driver.getCurrentUrl());
        this.youtubeLogoPageObject = new LogoPageObject(driver,driver.getCurrentUrl());
    }

    public SearchPageObject getYoutubeSearchPageObject() {
        return youtubeSearchPageObject;
    }

    public AuthenticationPageObject getYoutubeAuthenticationPageObject() {
        return youtubeAuthenticationPageObject;
    }

    public CreatePageObject getYoutubeCreatePageObject() {
        return youtubeCreatePageObject;
    }

    public SettingsPageObject getYoutubeSettingsPageObject() {
        return youtubeSettingsPageObject;
    }

    public SideBarPageObject getYoutubeSideBarPageObject() {
        return youtubeSideBarPageObject;
    }

    public AppsPageObject getYoutubeAppsPageObject() {
        return youtubeAppsPageObject;
    }

    public LogoPageObject getYoutubeLogoPageObject() {
        return youtubeLogoPageObject;
    }
}
