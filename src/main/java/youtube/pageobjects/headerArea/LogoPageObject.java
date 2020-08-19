package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class LogoPageObject extends BasePageObject {

    @FindBy(how = How.ID, using = "logo")
    private WebElement ytLogo;

    public LogoPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnYtLogo(){
        this.ytLogo.click();
    }
}
