package youtube.pageobjects.leftMenuArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class LeftMenuLibraryButtonPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//a[@id='endpoint' and @title='Library']")
    private WebElement libraryButton;

    public LeftMenuLibraryButtonPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnLibraryButton(){
        libraryButton.click();
    }
}
