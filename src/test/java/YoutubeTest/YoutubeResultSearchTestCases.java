package YoutubeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;
import youtube.usersteps.YoutubeResultPageUserSteps;

import java.util.List;

@Listeners({ TestListener.class})
public class YoutubeResultSearchTestCases extends BaseTestCase{
    private YoutubeHomePageUserSteps youtubeHomePageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
    }

    @BeforeMethod
    public void beforeMethod(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
    }

    @Test(priority = 1)
    public void validateResultPage() throws InterruptedException {
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        YoutubeResultPageUserSteps youtubeResultPageUserSteps = youtubeHomePageUserSteps.searchAProduct(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(youtubeResultPageUserSteps.getResultsSubList().isEmpty(),"La informacion del componente de video esta incompleta");
        softAssert.assertTrue(youtubeResultPageUserSteps.getResultsSubListAuthors().isEmpty(),"No todos los videos tienen autor");
        softAssert.assertTrue(youtubeResultPageUserSteps.getResultsSubListViews().isEmpty(),"No todos los videos tienen views");
        softAssert.assertTrue(youtubeResultPageUserSteps.getResultsSubListDesc().isEmpty(),"No todos los videos tienen descripción");
        softAssert.assertTrue(youtubeResultPageUserSteps.getResultsSubListDataRelease().isEmpty(),"No todos los videos tienen fecha de creación");
    }
}
