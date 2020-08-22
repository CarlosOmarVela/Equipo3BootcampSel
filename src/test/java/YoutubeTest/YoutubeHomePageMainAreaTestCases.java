package YoutubeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;
import youtube.usersteps.YoutubeChannelPageUserSteps;

@Listeners({ TestListener.class})
public class YoutubeHomePageMainAreaTestCases extends BaseTestCase {
    private YoutubeHomePageUserSteps youtubeHomePageUserSteps;
    private YoutubeChannelPageUserSteps youtubeChannelPageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        this.youtubeChannelPageUserSteps = new YoutubeChannelPageUserSteps(this.myDriver);
    }

    @BeforeMethod
    public void beforeMethod(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
    }

    @Test
    public void validateRecommendedSection(){
        Assert.assertEquals(youtubeHomePageUserSteps.enoughVideosInRecommendedSection(), true,"La seccion de recomendados tiene menos de 5 videos");
    }

    @Test
    public void validateNewsSection(){
        youtubeHomePageUserSteps.clickOnLeftMenuNewsButton();
        Assert.assertEquals(youtubeChannelPageUserSteps.nameOfChannel(),"News");
        Assert.assertEquals(youtubeChannelPageUserSteps.enoughVideosInChannelPage(),true,"La seccion de Noticias tiene menos de 5 videos");
    }

    @Test
    public void validateTrendingSection(){}

    @Test
    public void validateVideoComponentInformation(){}

    @Test
    public void validateClickOnVideoThumbnail(){}

    @Test
    public void validateClickOnVideoTitle(){}

    // Searching Scenario
    @Test
    public void validateSearchedStringInResults(){}

    @Test
    public void validateSearchResultsVideoComponentInformation(){}

    @Test
    public void validateClickOnSearchResultsVideo(){}
}
