package youtubenewdesign.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class YoutubeBasePageObject {
    protected WebDriver driver;
    protected String baseURL;

    public YoutubeBasePageObject(WebDriver driver, String baseURL){
        this.driver = driver;
        this.baseURL = baseURL;
        PageFactory.initElements(this.driver, this);
    }

    public boolean isLoaded(){
        return true;
    }
}
