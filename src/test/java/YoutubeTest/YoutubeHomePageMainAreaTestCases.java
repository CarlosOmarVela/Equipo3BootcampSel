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
import youtube.usersteps.YoutubeResultPageUserSteps;

@Listeners({ TestListener.class})
public class YoutubeHomePageMainAreaTestCases extends BaseTestCase {
    private YoutubeHomePageUserSteps youtubeHomePageUserSteps;
    private YoutubeChannelPageUserSteps youtubeChannelPageUserSteps;
    private YoutubeResultPageUserSteps youtubeResultPageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        this.youtubeChannelPageUserSteps = new YoutubeChannelPageUserSteps(this.myDriver);
        this.youtubeResultPageUserSteps = new YoutubeResultPageUserSteps(this.myDriver);
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
    @Severity(SeverityLevel.NORMAL)
    public void validateNewsSection(){
        youtubeHomePageUserSteps.clickOnLeftMenuNewsButton();
        Assert.assertEquals(youtubeChannelPageUserSteps.nameOfChannel(),"News");
        Assert.assertEquals(youtubeChannelPageUserSteps.enoughVideosInChannelPage(),true,"La seccion de Noticias tiene menos de 5 videos");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateTrendingSection(){
        Assert.assertEquals(youtubeHomePageUserSteps.enoughVideosInTrendingSection(),true,"La seccion de Trending tiene menos de 5 videos");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateVideoComponentInformation(){
        youtubeHomePageUserSteps.videoComponentInformation();
        Assert.assertEquals(youtubeHomePageUserSteps.videoComponentInformation(),true,"La informacion del componente de video esta incompleta");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateClickOnVideoThumbnail(){
        youtubeHomePageUserSteps.clickOnFirstVideoThumbnail();
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo click en el thumbnail");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateClickOnVideoTitle(){
        youtubeHomePageUserSteps.clickOnFirstVideoTitle();
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo click en el Titulo del video");
    }

    // Searching Scenario
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateSearchedStringInResults(){
        youtubeHomePageUserSteps.searchVideo(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo la busqueda del video");
        Assert.assertTrue(youtubeResultPageUserSteps.validateSearchStringInResults(PropertyReader.getProperty("test.properties","SEARCH_VIDEO")),"Search String not found in one video");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateSearchedWithoutInResults(){
        youtubeHomePageUserSteps.searchVideo(PropertyReader.getProperty("test.properties","SEARCH_WITHOUT_RESULT"));
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo la busqueda del video");
        Assert.assertEquals(youtubeResultPageUserSteps.validateSearchWithoutResults(PropertyReader.getProperty("test.properties","SEARCH_WITHOUT_RESULT")),
                youtubeResultPageUserSteps.validateSearchWithoutResults(PropertyReader.getProperty("test.properties","BAD_SEARCH")),
                "Found a video");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void validateSearchResultsVideoComponentInformation(){
        Assert.assertEquals(youtubeHomePageUserSteps.searchVideoAndValidateResults(PropertyReader.getProperty("test.properties","SEARCH_VIDEO")),true,"La informacion de los componentes de video esta incompleta");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void validateClickOnSearchResultsVideo(){
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        youtubeHomePageUserSteps.searchTextEnter(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
        Assert.assertFalse(this.myDriver.getCurrentUrl().equals(PropertyReader.getProperty("test.properties","URL")),"No se realizo la busqueda del video");
    }
}
