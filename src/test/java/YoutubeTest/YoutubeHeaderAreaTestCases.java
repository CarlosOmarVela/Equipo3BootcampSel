package YoutubeTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.PropertyReader;
import utils.listeners.TestListener;
import youtube.usersteps.YoutubeHomePageUserSteps;

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

    @Test
    public void validateLeftMenuHomeButton(){
        youtubeHomePageUserSteps.clickOnLeftMenuHomeButton();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }
    @Test
    public void validateLogoHomePage(){
        youtubeHomePageUserSteps.clickOnYoutubeLogo();
        Assert.assertEquals(this.myDriver.getCurrentUrl(), PropertyReader.getProperty("test.properties","URL"));
    }

    @Test(groups = {"Create", "Header"})
    public void validateCreateIcon(){
        youtubeHomePageUserSteps.create();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"},groups = {"Create"})
    public void selectUploadVideo(){
        youtubeHomePageUserSteps.clickOnCreate();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"},groups = {"Create"})
    public void selectGoLive(){
        youtubeHomePageUserSteps.clickOnLive();
    }

    @Test(groups = {"AppsYoutube", "Header"})
    public void validateAppsYoutubeIcon(){
        youtubeHomePageUserSteps.clickOnApps();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"}, groups = {"AppsYoutube"})
    public void selectYoutubeTV(){
        youtubeHomePageUserSteps.clickOnYtTV();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"}, groups = {"AppsYoutube"})
    public void selectYoutubeMusic(){
        youtubeHomePageUserSteps.clickOnYtMusic();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"}, groups = {"AppsYoutube"})
    public void selectYoutubeKids(){
        youtubeHomePageUserSteps.clickOnYtKids();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"}, groups = {"AppsYoutube"})
    public void selectYoutubeCreatorAcademy(){
        youtubeHomePageUserSteps.clickOnYtCreatorAcademy();
    }

    @Test(dependsOnMethods = {"validateAppsYoutubeIcon"}, groups = {"AppsYoutube"})
    public void selectYoutubeForArtists(){
        youtubeHomePageUserSteps.clickOnYtForArtists();
    }

    @Test(groups = {"Settings", "Header"})
    public void validateSettingsIcon(){
        youtubeHomePageUserSteps.clickOnSettings();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingsTheme(){
        youtubeHomePageUserSteps.clickOnTheme();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingsLanguage(){
        youtubeHomePageUserSteps.clickOnLanguage();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingsLocation(){
        youtubeHomePageUserSteps.clickOnLocation();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingSettingLink(){
        youtubeHomePageUserSteps.clickOnSetLink();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingData(){
        youtubeHomePageUserSteps.clickOnData();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingHelp(){
        youtubeHomePageUserSteps.clickOnHelp();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingSendFeedback(){
        youtubeHomePageUserSteps.clickOnFeedback();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingKeyboardShortcut(){
        youtubeHomePageUserSteps.clickOnKeyboard();
    }

    @Test(dependsOnMethods = {"validateSettingsIcon"}, groups = {"Settings"})
    public void validateSettingRestrictedMode(){
        youtubeHomePageUserSteps.clickOnRestricted();
    }

    @Test(groups = {"Login"})
    public void validateLoginButton(){
        youtubeHomePageUserSteps.clickOnAuthenticationButton();
    }
}
