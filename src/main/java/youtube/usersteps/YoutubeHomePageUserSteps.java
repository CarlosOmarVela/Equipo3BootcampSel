package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.page.YoutubeHomePage;
import youtube.pageobjects.headerArea.SearchPageObject;

public class YoutubeHomePageUserSteps {
    private YoutubeHomePage youtubeHomePage;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public YoutubeHomePage getYoutubeHomePage() {
        return youtubeHomePage;
    }

    public void searchAProduct(String video){
        SearchPageObject youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(video);
        youtubeSearchPageObject.clickOnSearchButton();
    }
}
