package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftMenuArea.LeftMenuHomeButtonPageObject;

public class YoutubeLeftAreaComponent {

    private LeftMenuHomeButtonPageObject leftMenuHomeButtonPageObject;

    public YoutubeLeftAreaComponent(WebDriver driver) {
        this.leftMenuHomeButtonPageObject = new LeftMenuHomeButtonPageObject(driver, driver.getCurrentUrl());
    }

    public LeftMenuHomeButtonPageObject getLeftMenuHomeButtonPageObject() {
        return leftMenuHomeButtonPageObject;
    }
}
