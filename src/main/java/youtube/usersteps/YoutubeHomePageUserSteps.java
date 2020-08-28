package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.page.YoutubeResultPage;
import youtube.pageobjects.headerArea.*;
import youtube.pageobjects.leftMenuArea.*;
import youtube.pageobjects.mainArea.homePage.HomePageMainAreaPageObject;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

public class YoutubeHomePageUserSteps extends YoutubeResultPageUserSteps{
    private YoutubeHomePage youtubeHomePage;
    private YoutubeResultPage youtubeResultPage;
    private WebDriver driver;


    public YoutubeHomePageUserSteps(WebDriver driver){
        super();
        this.driver = driver;
        this.youtubeHomePage = new YoutubeHomePage(driver);
        this.youtubeResultPage = new YoutubeResultPage(driver);
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

    public void clickOnSearchField(String video){
        SearchPageObject searchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        searchPageObject.clickOnSearchField(video);
    }
    public SearchPageObject clickOnSearchButton(String video){
        SearchPageObject searchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        searchPageObject.clickOnSearchField(video);
        searchPageObject.clickOnSearchButton();
        return new SearchPageObject(this.driver,driver.getCurrentUrl());
    }

    public void searchTextEnter(String video){
        SearchPageObject searchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        searchPageObject.enterSearchField(video);
        youtubeResultPage.getYoutubeResultPageMainAreaComponent().clickOnFirstVideo();
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

    public boolean videoComponentInformation(){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        return homePageMainAreaPageObject.videoComponentInformation();
    }

    public void clickOnFirstVideoThumbnail(){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        homePageMainAreaPageObject.clickOnFirstVideoThumbnail();
    }

    public void clickOnFirstVideoTitle(){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        homePageMainAreaPageObject.clickOnFirstVideoTitle();
    }

    public void searchVideo(String searchString){
        HomePageMainAreaPageObject homePageMainAreaPageObject = this.youtubeHomePage.getYoutubeHomePageMainAreaComponent().getHomePageMainAreaPageObject();
        homePageMainAreaPageObject.enterTextInSearchBox(searchString);
        homePageMainAreaPageObject.pressEnterInSearchBox();
    }
}
