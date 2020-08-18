package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeAuthenticationPageObject extends YoutubeBasePageObject {
    @FindBy(how = How.XPATH, using = "//div[@id='buttons']//paper-button[@id=\'button\']")
    private WebElement authButton;

    public YoutubeAuthenticationPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
