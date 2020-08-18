package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeLogoPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.ID, using = "logo")
    private WebElement ytLogo;

    public YoutubeLogoPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnYtLogo(){
        this.ytLogo.click();
    }
}
