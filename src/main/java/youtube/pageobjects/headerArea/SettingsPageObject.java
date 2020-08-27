package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class SettingsPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//*[@id='button']//yt-icon-button[@id='button'])[3]//button")
    private WebElement settingButton;

    @FindBy(how = How.XPATH, using = "//div[@id='items']/ytd-toggle-theme-compact-link-renderer/div[2]")
    private WebElement themes;

    @FindBy(how = How.XPATH, using = "//a[@id='endpoint']/paper-item/yt-formatted-string[2]")
    private WebElement language;

    @FindBy(how = How.XPATH, using = "(//yt-formatted-string[@id='label'])[2]")
    private WebElement location;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item/yt-formatted-string)[27]")
    private WebElement settingLink;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[24]")
    private WebElement yourDataYT;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[25]")
    private WebElement help;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[26]")
    private WebElement sendFeedback;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[27]")
    private WebElement keyboardShortcuts;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[28]")
    private WebElement restrictedMode;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/ytd-simple-menu-header-renderer/h2/yt-formatted-string")
    private WebElement darkTheme;

    Actions actions = new Actions(driver);

    public SettingsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnSettingButton(){
        actions.moveToElement(this.settingButton).click().build().perform();
    }
    public void clickOnThemes(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.themes).click().build().perform();
    }
    public void clickOnLanguage(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.language).click().build().perform();
    }
    public void clickOnLocation(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.location).click().build().perform();
    }
    public void clickOnSettingLink(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.settingLink).click().build().perform();
    }
    public void clickOnYourDataYT(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.yourDataYT).click().build().perform();
    }
    public void clickOnHelp(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.help).click().build().perform();
    }
    public void clickOnSendFeedback(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.sendFeedback).click().build().perform();
    }
    public void clickOnKeyboardShortcuts(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.keyboardShortcuts).click().build().perform();
    }
    public void clickOnRestrictedMode(){
        actions.moveToElement(this.settingButton).click().build().perform();
        actions.moveToElement(this.restrictedMode).click().build().perform();
    }
}
