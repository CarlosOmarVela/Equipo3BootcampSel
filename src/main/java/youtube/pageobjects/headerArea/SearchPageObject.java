package youtube.pageobjects.headerArea;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class SearchPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//button[@id='search-icon-legacy']/yt-icon")
    private WebElement searchButton;

    public SearchPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnSearchField(String word){
        this.searchBox.click();
        this.searchBox.sendKeys(word);
    }

    public void clickOnSearchButton(){
        this.searchButton.click();
    }

    public void enterSearchField(String word){
        this.searchBox.click();
        this.searchBox.sendKeys(word, Keys.ENTER);
    }

    public void sendKeysSearchBox(String word){
        this.searchBox.clear();
        this.searchBox.sendKeys(word);
    }
}