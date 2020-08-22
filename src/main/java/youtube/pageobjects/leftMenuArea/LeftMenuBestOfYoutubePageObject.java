package youtube.pageobjects.leftMenuArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class LeftMenuBestOfYoutubePageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//a[@id='endpoint' and @title='News']")
    private WebElement leftMenuNewsButton;

    public LeftMenuBestOfYoutubePageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnLeftMenuNewsButton(){
        leftMenuNewsButton.click();
    }
}
