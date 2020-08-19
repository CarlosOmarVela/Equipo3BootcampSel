package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class AppsPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "//div[@id='buttons']/ytd-topbar-menu-button-renderer[@class='style-scope ytd-masthead style-default'][2]")
    private WebElement createIcon;

    public AppsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
}
