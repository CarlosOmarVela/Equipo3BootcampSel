package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import youtube.page.YoutubeHomePage;
import youtube.page.YoutubeResultPage;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

import java.util.List;

public class YoutubeResultPageUserSteps {
    private ResultPageMainAreaPageObject resultPageMainAreaPageObject;

    public YoutubeResultPageUserSteps(WebDriver driver){
        this.resultPageMainAreaPageObject = new ResultPageMainAreaPageObject(driver, driver.getCurrentUrl());
    }

    public void clickOnThumbnail(int resultIndex){
        this.resultPageMainAreaPageObject.getVideoThumbnails().get(resultIndex).click();
    }

    public List<WebElement> getResultsSubList(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getVideoTitles();
        return listResults;
    }
}
