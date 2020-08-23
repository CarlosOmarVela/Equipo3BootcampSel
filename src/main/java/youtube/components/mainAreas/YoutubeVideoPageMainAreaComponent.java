package youtube.components.mainAreas;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeBaseMainAreaComponent;
import youtube.pageobjects.mainArea.videoPage.VideoPageMainAreaPageObject;

public class YoutubeVideoPageMainAreaComponent extends YoutubeBaseMainAreaComponent {

    //inicializamos la variable de tipo VideoPageMainAreaPageObject
    private VideoPageMainAreaPageObject videoPageMainAreaPageObject;

    public YoutubeVideoPageMainAreaComponent(WebDriver driver){
        //creamos la instancia del objeto videoPageMainAreaPageObject
        this.videoPageMainAreaPageObject = new VideoPageMainAreaPageObject(driver, driver.getCurrentUrl());
    }
    //creamos el getter
    public VideoPageMainAreaPageObject getVideoPageMainAreaPageObject() { return videoPageMainAreaPageObject;}
}
