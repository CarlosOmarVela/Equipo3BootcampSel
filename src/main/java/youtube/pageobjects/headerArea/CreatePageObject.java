package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public CreatePageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnCreateIcon(){
        this.createIcon.getAttribute("aria-label");
        //this.createIcon.click();
    }
    public void clickOnUploadVideo(){
        this.uploadVideo.click();
    }
    public void clickOnGoLive(){
        this.goLive.click();
    }
}
