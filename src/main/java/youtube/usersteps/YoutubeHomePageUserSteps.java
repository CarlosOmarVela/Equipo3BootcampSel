package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.pageobjects.headerArea.SearchPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuHomeButtonPageObject;

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
}
