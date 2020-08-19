package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class SideBarPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//button[@id='button']/yt-icon)[2]")
    private WebElement navMenu;

    public SideBarPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnNavMenu(){
        this.navMenu.click();
    }
}
