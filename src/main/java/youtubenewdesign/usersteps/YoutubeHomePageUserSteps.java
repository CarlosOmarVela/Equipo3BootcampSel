package youtubenewdesign.usersteps;

import org.openqa.selenium.WebDriver;
import youtubenewdesign.page.YoutubeHomePage;
import youtubenewdesign.pageobjects.header.YoutubeSearchPageObject;

public class YoutubeHomePageUserSteps {
    private YoutubeHomePage youtubeHomePage;
    private WebDriver driver;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public YoutubeHomePage getYoutubeHomePage() {
        return youtubeHomePage;
    }

    public void searchAProduct(String video){
        YoutubeSearchPageObject youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getYoutubeSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(video);
        youtubeSearchPageObject.clickOnSearchButton();
    }
}
