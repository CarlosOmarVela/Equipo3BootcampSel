package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeSideBarPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.ID, using = "guide-button")
    private WebElement searchButton;

    public YoutubeSideBarPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
