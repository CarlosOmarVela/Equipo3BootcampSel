package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeSettingsPageObject extends YoutubeBasePageObject {
    @FindBy(how = How.XPATH, using = "//div[@id='buttons']/ytd-topbar-menu-button-renderer[@class='style-scope ytd-masthead style-default'][3]")
    private WebElement settingButton;

    public YoutubeSettingsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
