package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class AppsPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//*[@id='button']//yt-icon-button[@id='button'])[2]//button")
    private WebElement ytApp;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[21]")
    private WebElement ytTV;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[22]")
    private WebElement ytMusic;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[23]")
    private WebElement ytKids;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[24]")
    private WebElement creatorAcademy;

    @FindBy(how = How.XPATH, using = "(//a[@id='endpoint']/paper-item)[25]")
    private WebElement ytForArtists;

    Actions actions = new Actions(driver);

    public AppsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnYtApps(){
        actions.moveToElement(this.ytApp).click().build().perform();
    }
    public void clickOnTV(){
        actions.moveToElement(this.ytApp).click().build().perform();
        actions.moveToElement(this.ytTV).pause(1000).click().build().perform();
    }
    public void clickOnMusic(){
        actions.moveToElement(this.ytApp).click().build().perform();
        actions.moveToElement(this.ytMusic).click().build().perform();
    }
    public void clickOnKids(){
        actions.moveToElement(this.ytApp).click().build().perform();
        actions.moveToElement(this.ytKids).click().build().perform();
    }
    public void clickOnAcademy(){
        actions.moveToElement(this.ytApp).click().build().perform();
        actions.moveToElement(this.creatorAcademy).click().build().perform();
    }
    public void clickOnArtists(){
        actions.moveToElement(this.ytApp).click().build().perform();
        actions.moveToElement(this.ytForArtists).click().build().perform();
    }
}
