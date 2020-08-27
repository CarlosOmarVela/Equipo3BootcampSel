package YoutubeTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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
    public void validateTrendingSection(){
        Assert.assertEquals(youtubeHomePageUserSteps.enoughVideosInTrendingSection(),true,"La seccion de Trending tiene menos de 5 videos");
    }

    @Test
    public void validateVideoComponentInformation(){
        youtubeHomePageUserSteps.videoComponentInformation();
        Assert.assertEquals(youtubeHomePageUserSteps.videoComponentInformation(),true,"La informacion del componente de video esta incompleta");
    }

    @Test
    public void validateClickOnVideoThumbnail(){
        youtubeHomePageUserSteps.clickOnFirstVideoThumbnail();
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo click en el thumbnail");
    }

    @Test
    public void validateClickOnVideoTitle(){
        youtubeHomePageUserSteps.clickOnFirstVideoTitle();
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo click en el Titulo del video");
    }

    // Searching Scenario
    @Test
    public void validateSearchedStringInResults(){
    }

    @Test
    public void validateSearchResultsVideoComponentInformation(){}

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void validateClickOnSearchResultsVideo(){
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        youtubeHomePageUserSteps.searchTextEnter(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/watch?v=mf-UJ32PJgU");
    }
}
