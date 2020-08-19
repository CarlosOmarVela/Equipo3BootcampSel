package youtube.pageobjects.headerArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.BasePageObject;

public class AppsPageObject extends BasePageObject {

    @FindBy(how = How.XPATH, using = "(//button[@id='button']/yt-icon)[5]")
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

    public AppsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }
    public void clickOnYtApps(){
        this.ytApp.click();
    }
    public void clickOnYtTV(){
        this.ytTV.click();
    }
    public void clickOnYtMusic(){
        this.ytMusic.click();
    }
    public void clickOnYtKids(){
        this.ytKids.click();
    }
    public void clickOnCreatorAcademy(){
        this.creatorAcademy.click();
    }
    public void clickOnYtForArtists(){
        this.ytForArtists.click();
    }
}
