package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class AuthenticationPageObject extends BasePageObject {
    @FindBy(how = How.XPATH, using = "//div[@id='buttons']//ytd-button-renderer")
    private WebElement authButton;

    @FindBy(how = How.XPATH, using = "//*[@id='headingText']")
    private WebElement signInText;

    public AuthenticationPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnAuthButton(){
        this.authButton.click();
        this.signInText.getText();
    }
}
