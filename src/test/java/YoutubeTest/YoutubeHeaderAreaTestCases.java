package YoutubeTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;
import youtube.usersteps.YoutubeResultPageUserSteps;

import java.util.ArrayList;
import java.util.List;

@Listeners({ TestListener.class})
public class YoutubeHeaderAreaTestCases extends BaseTestCase{
    private YoutubeHomePageUserSteps youtubeHomePageUserSteps;

    @BeforeClass
    public void beforeClass(){
        this.youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
    }

    @BeforeMethod
    public void beforeMethod(){
        this.myDriver.get(PropertyReader.getProperty("test.properties","URL"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Check if there is left menu")
    @Test
    public void validateLeftMenuHomeButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHomeButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Check if there is a Youtube logo")
    @Test
    public void validateLogoHomePage(){
        youtubeHomePageUserSteps.clickOnYoutubeLogo();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Check if there is a search field")
    @Test
    public void ValidateSearchField(){
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        youtubeHomePageUserSteps.clickOnSearchField(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
        Assert.assertTrue(myDriver.findElement(By.xpath("//input[@id='search']")).isDisplayed(),"No existe el campo de bùsqueda");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Check if there is a search button")
    @Test
    public void ValidateSearchButton(){
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(myDriver);
        youtubeHomePageUserSteps.clickOnSearchButton(PropertyReader.getProperty("test.properties","SEARCH_VIDEO"));
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Check if there is a create Icon")
    @Test
    public void validateCreateIcon(){
        youtubeHomePageUserSteps.create();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a upload video link")
    @Test
    public void selectUploadVideo(){
        youtubeHomePageUserSteps.clickOnCreate();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Go live link")
    @Test
    public void selectGoLive(){
        youtubeHomePageUserSteps.clickOnLive();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252F%253Fchannel_creation_token%253DKBU%25253D&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Check if there is a Youtube icon")
    @Test
    public void validateAppsYoutubeIcon(){
        youtubeHomePageUserSteps.clickOnApps();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/");
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Youtube TV link")
    @Test
    public void selectYoutubeTV(){
        youtubeHomePageUserSteps.clickOnYtTV();
        List<String> browserTabs = new ArrayList<String> (myDriver.getWindowHandles());
        myDriver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(this.myDriver.getTitle(),"YouTube TV - Watch & DVR Live Sports, Shows & News");
        myDriver.close();
        myDriver.switchTo().window(browserTabs.get(0));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Youtube Music link")
    @Test
    public void selectYoutubeMusic(){
        youtubeHomePageUserSteps.clickOnYtMusic();
        List<String> browserTabs = new ArrayList<String> (myDriver.getWindowHandles());
        myDriver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://music.youtube.com/");
        myDriver.close();
        myDriver.switchTo().window(browserTabs.get(0));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Youtube Kids link")
    @Test
    public void selectYoutubeKids(){
        youtubeHomePageUserSteps.clickOnYtKids();
        List<String> browserTabs = new ArrayList<String> (myDriver.getWindowHandles());
        myDriver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtubekids.com/?source=youtube_web");
        myDriver.close();
        myDriver.switchTo().window(browserTabs.get(0));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Youtube Creator academy link")
    @Test
    public void selectYoutubeCreatorAcademy() throws InterruptedException {
        youtubeHomePageUserSteps.clickOnYtCreatorAcademy();
        List<String> browserTabs = new ArrayList<String> (myDriver.getWindowHandles());
        myDriver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://creatoracademy.youtube.com/page/home?utm_source=YouTube&utm_medium=YT%20Main&utm_campaign=YT%20Appsn");
        myDriver.close();
        myDriver.switchTo().window(browserTabs.get(0));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Youtube for artists link")
    @Test
    public void selectYoutubeForArtists(){
        youtubeHomePageUserSteps.clickOnYtForArtists();
        List<String> browserTabs = new ArrayList<String> (myDriver.getWindowHandles());
        myDriver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://artists.youtube.com/");
        myDriver.close();
        myDriver.switchTo().window(browserTabs.get(0));
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Check if there is a Setting icon")
    @Test
    public void validateSettingsIcon(){
        youtubeHomePageUserSteps.clickOnSettings();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting theme link")
    @Test
    public void validateSettingsTheme(){
        youtubeHomePageUserSteps.clickOnTheme();
        WebElement theme = myDriver.findElement(By.xpath("//*[@id='header']/ytd-simple-menu-header-renderer/h2/yt-formatted-string"));
        System.out.println("Tema de fondo = " + theme.getText());
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting languaje link")
    @Test
    public void validateSettingsLanguage(){
        youtubeHomePageUserSteps.clickOnLanguage();
        WebElement idioma = myDriver.findElement(By.xpath("//*[@id='header']/ytd-simple-menu-header-renderer/h2/yt-formatted-string"));
        System.out.println("Idioma = " + idioma.getText());
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting location link")
    @Test
    public void validateSettingsLocation(){
        youtubeHomePageUserSteps.clickOnLocation();
        WebElement ubicacion = myDriver.findElement(By.xpath("//*[@id='header']/ytd-simple-menu-header-renderer/h2/yt-formatted-string"));
        System.out.println("Ubicación = " + ubicacion.getText());
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting Setting link")
    @Test
    public void validateSettingSettingLink(){
        youtubeHomePageUserSteps.clickOnSetLink();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://www.youtube.com/account");
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting Date link")
    @Test
    public void validateSettingData(){
        youtubeHomePageUserSteps.clickOnData();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fmyaccount.google.com%2Fu%2F0%2Fyourdata%2Fyoutube%3Fhl%3Den&followup=https%3A%2F%2Fmyaccount.google.com%2Fu%2F0%2Fyourdata%2Fyoutube%3Fhl%3Den&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting help link")
    @Test
    public void validateSettingHelp(){
        youtubeHomePageUserSteps.clickOnHelp();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting SendFeedback link")
    @Test
    public void validateSettingSendFeedback(){
        youtubeHomePageUserSteps.clickOnFeedback();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting keyboard Shortcut link")
    @Test
    public void validateSettingKeyboardShortcut(){
        youtubeHomePageUserSteps.clickOnKeyboard();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("Check if there is a Setting Restricted Mode link")
    @Test
    public void validateSettingRestrictedMode(){
        youtubeHomePageUserSteps.clickOnRestricted();
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Check if there is a Login button")
    @Test
    public void validateLoginButton(){
        youtubeHomePageUserSteps.clickOnAuthenticationButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(),"https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }
}
