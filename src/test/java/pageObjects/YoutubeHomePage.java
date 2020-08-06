package pageObjects;

import org.openqa.selenium.WebDriver;

public class YoutubeHomePage {
    private WebDriver driver;

    //Constructor
    public YoutubeHomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getYoutubeHomePageTitle(){
        String title = driver.getTitle();
        return title;
    }



}
