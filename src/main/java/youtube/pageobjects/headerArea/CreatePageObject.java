package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class CreatePageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//div[@id='buttons']/ytd-topbar-menu-button-renderer[@class='style-scope ytd-masthead style-default'][1]")
    private WebElement createIcon;

    public CreatePageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
