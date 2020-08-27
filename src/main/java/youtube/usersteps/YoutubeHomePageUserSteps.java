package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.pageobjects.headerArea.*;
import youtube.pageobjects.leftMenuArea.*;
import youtube.pageobjects.mainArea.homePage.HomePageMainAreaPageObject;

public class YoutubeHomePageUserSteps {
    private YoutubeHomePage youtubeHomePage;
    private WebDriver driver;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.driver = driver;
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public YoutubeResultPageUserSteps searchAProduct(String video){
        SearchPageObject youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(video);
        youtubeSearchPageObject.clickOnSearchButton();
        return new YoutubeResultPageUserSteps(this.driver);
    }

    public void clickOnLeftMenuHomeButton(){
        LeftMenuHomeButtonPageObject leftMenuHomeButtonPageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuHomeButtonPageObject();
        leftMenuHomeButtonPageObject.clickOnHomeButton();
    }

    public void clickOnLeftMenuTrendingButton(){
        LeftMenuTrendingButtonPageObject leftMenuTrendingButtonPageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuTrendingButtonPageObject();
        leftMenuTrendingButtonPageObject.clickOnTrendingButton();
    }

    public void clickOnLeftMenuSubscriptionsButton(){
        LeftMenuSubscriptionButtonPageObject leftMenuSubscriptionButtonPageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuSubscriptionButtonPageObject();
        leftMenuSubscriptionButtonPageObject.clickOnSubscriptionsButton();
    }

    public void clickOnLeftMenuLibraryButton(){
        LeftMenuLibraryButtonPageObject leftMenuLibraryButtonPageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuLibraryButtonPageObject();
        leftMenuLibraryButtonPageObject.clickOnLibraryButton();
    }

    public void clickOnLeftMenuHistoryButton(){
        LeftMenuHistoryButtonPageObject leftMenuHistoryButtonPageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuHistoryButtonPageObject();
        leftMenuHistoryButtonPageObject.clickOnHistoryButton();
    }

    public void clickOnYoutubeLogo(){
        LogoPageObject logoPageObject  = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeLogoPageObject();
        logoPageObject.clickOnYtLogo();
    }

    public void create(){
        CreatePageObject createPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeCreatePageObject();
        createPageObject.clickOnCreateIcon();
    }

    public void clickOnCreate(){
        CreatePageObject createPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeCreatePageObject();
        createPageObject.clickOnUploadVideo();
    }

    public void clickOnLive(){
        CreatePageObject createPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeCreatePageObject();
        createPageObject.clickOnGoLive();
    }

    public void clickOnApps(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnYtApps();
    }

    public void clickOnYtTV(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnTV();
    }

    public void clickOnYtMusic(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnMusic();
    }

    public void clickOnYtKids(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnKids();
    }

    public void clickOnYtCreatorAcademy(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnAcademy();
    }

    public void clickOnYtForArtists(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnArtists();
    }

    public void clickOnSettings(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnSettingButton();
    }

    public void clickOnTheme(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnThemes();
    }

    public void clickOnLanguage(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnLanguage();
    }

    public void clickOnLocation(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnLocation();
    }

    public void clickOnSetLink(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnSettingLink();
    }

    public void clickOnData(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnYourDataYT();
    }

    public void clickOnHelp(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnHelp();
    }

    public void clickOnFeedback(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnSendFeedback();
    }

    public void clickOnKeyboard(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnKeyboardShortcuts();
    }

    public void clickOnRestricted(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnRestrictedMode();
    }

    public void clickOnAuthenticationButton(){
        AuthenticationPageObject authenticationPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAuthenticationPageObject();
        authenticationPageObject.clickOnAuthButton();
    }

    public boolean enoughVideosInRecommendedSection(){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        if (homePageMainAreaPageObject.countVideosInRecommendedSection() >= 5){
            return true;
        }
        return false;
    }

    public void clickOnLeftMenuNewsButton(){
        LeftMenuBestOfYoutubePageObject leftMenuBestOfYoutubePageObject = this.youtubeHomePage.getYoutubeLeftAreaComponent().getLeftMenuBestOfYoutubePageObject();
        leftMenuBestOfYoutubePageObject.clickOnLeftMenuNewsButton();
    }

    public boolean enoughVideosInTrendingSection(){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        if (homePageMainAreaPageObject.countVideosInTrendingSection() >= 5){
            return true;
        }
        return false;
    }
}
