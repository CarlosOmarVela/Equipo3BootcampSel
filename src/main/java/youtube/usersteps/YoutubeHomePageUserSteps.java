package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.pageobjects.headerArea.*;
import youtube.pageobjects.leftMenuArea.*;

public class YoutubeHomePageUserSteps {
    private YoutubeHomePage youtubeHomePage;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public void searchAProduct(String video){
        SearchPageObject youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(video);
        youtubeSearchPageObject.clickOnSearchButton();
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

    public void clickOnCreate(){
        CreatePageObject createPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeCreatePageObject();
        createPageObject.clickOnCreateIcon();
    }

    public void clickOnApps(){
        AppsPageObject appsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAppsPageObject();
        appsPageObject.clickOnYtApps();
    }

    public void clickOnSettings(){
        SettingsPageObject settingsPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSettingsPageObject();
        settingsPageObject.clickOnSettingButton();
    }

    public void clickOnAuthenticationButton(){
        AuthenticationPageObject authenticationPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeAuthenticationPageObject();
        authenticationPageObject.clickOnAuthButton();
    }
}
