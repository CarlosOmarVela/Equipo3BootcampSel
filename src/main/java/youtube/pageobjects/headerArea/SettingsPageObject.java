package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class SettingsPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//button[@id='button']/yt-icon)[6]")
    private WebElement settingButton;

    @FindBy(how = How.XPATH, using = "//div[@id='items']/ytd-toggle-theme-compact-link-renderer/div[2]")
    private WebElement themes;

    @FindBy(how = How.XPATH, using = "//a[@id='endpoint']/paper-item/yt-formatted-string[2]")
    private WebElement languaje;

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

    public SettingsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnSettingButton(){
        this.settingButton.click();
    }
    public void clickOnThemes(){
        this.themes.click();
    }
    public void clickOnLanguajeYT(){
        this.languaje.click();
    }
    public void clickOnLocation(){
        this.location.click();
    }
    public void clickOnSettingLink(){
        this.settingLink.click();
    }
    public void clickOnYourDataYT(){
        this.yourDataYT.click();
    }
    public void clickOnHelp(){
        this.help.click();
    }
    public void clickOnSendFeedback(){
        this.sendFeedback.click();
    }
    public void clickOnKeyboardShortcuts(){
        this.keyboardShortcuts.click();
    }
    public void clickOnRestrictedMode(){
        this.restrictedMode.click();
    }
}
