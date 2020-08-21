package youtube.pageobjects.leftMenuArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class LeftMenuHomeButtonPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//a[@id='endpoint' and @title='Home']")
    private WebElement homeButton;

    public LeftMenuHomeButtonPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnHomeButton(){
        homeButton.click();
    }
}
