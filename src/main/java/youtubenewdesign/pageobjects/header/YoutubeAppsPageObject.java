package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeAppsPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.XPATH, using = "//div[@id='buttons']/ytd-topbar-menu-button-renderer[@class='style-scope ytd-masthead style-default'][2]")
    private WebElement createIcon;

    public YoutubeAppsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
