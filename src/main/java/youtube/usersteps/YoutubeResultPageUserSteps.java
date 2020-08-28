package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import youtube.page.YoutubeHomePage;
import youtube.page.YoutubeResultPage;
import youtube.pageobjects.mainArea.resultsPage.ResultPageMainAreaPageObject;

import java.util.List;

public class YoutubeResultPageUserSteps {
    private ResultPageMainAreaPageObject resultPageMainAreaPageObject;
    private YoutubeResultPage youtubeResultPage;

    public YoutubeResultPageUserSteps(WebDriver driver){
        this.resultPageMainAreaPageObject = new ResultPageMainAreaPageObject(driver, driver.getCurrentUrl());
        this.youtubeResultPage = new YoutubeResultPage(driver);
    }

    public List<WebElement> getResultsSubList(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getVideoTitles();
        return listResults;
    }
    public List<WebElement> getResultsSubListAuthors(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getAuthors();
        return listResults;
    }
    public List<WebElement> getResultsSubListViews(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getViews();
        return listResults;
    }
    public List<WebElement> getResultsSubListDesc(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getDescriptions();
        return listResults;
    }
    public List<WebElement> getResultsSubListDataRelease(){
        List<WebElement> listResults = this.resultPageMainAreaPageObject.getDateRelease();
        return listResults;
    }

    public void enterFirstVideo(){
        this.resultPageMainAreaPageObject.clickOnFirstVideo();
    }

    public boolean validateSearchStringInResults(String searchString){
        return resultPageMainAreaPageObject.searchStringInLoadedVideos(searchString);
    }

    public boolean validateAllVideosComponentInformation(){
        ResultPageMainAreaPageObject resultPageMainAreaPageObject = this.youtubeResultPage.getResultPageMainAreaComponent().getResultPageMainAreaPageObject();
        return resultPageMainAreaPageObject.validateAllVideosComponentInformation();
    }
}
