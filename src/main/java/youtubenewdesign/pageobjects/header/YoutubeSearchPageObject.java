package youtubenewdesign.pageobjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtubenewdesign.pageobjects.YoutubeBasePageObject;

public class YoutubeSearchPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.XPATH, using = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//button[@id='search-icon-legacy']/yt-icon")
    private WebElement searchButton;

    public YoutubeSearchPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnSearchButton(){
        this.searchButton.click();
    }

    public void sendKeysSearchBox(String word){
        this.searchBox.clear();
        this.searchBox.sendKeys(word);
    }
}