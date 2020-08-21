package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.pageobjects.headerArea.SearchPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuHomeButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuSubscriptionButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuTrendingButtonPageObject;

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
}
