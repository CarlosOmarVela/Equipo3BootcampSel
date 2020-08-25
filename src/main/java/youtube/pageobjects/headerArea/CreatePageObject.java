package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class CreatePageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//*[@id='button']//yt-icon-button[@id='button'])[1]//button")
    private WebElement createIcon;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[21]")
    private WebElement uploadVideo;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[22]")
    private WebElement goLive;

    Actions actions = new Actions(driver);

    public CreatePageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnCreateIcon(){
        actions.moveToElement(this.createIcon).click().build().perform();
    }
    public void clickOnUploadVideo(){
        actions.moveToElement(this.createIcon).click().build().perform();
        actions.moveToElement(this.uploadVideo).click().build().perform();
    }
    public void clickOnGoLive(){
        actions.moveToElement(this.createIcon).click().build().perform();
        actions.moveToElement(this.goLive).click().build().perform();
    }
}
