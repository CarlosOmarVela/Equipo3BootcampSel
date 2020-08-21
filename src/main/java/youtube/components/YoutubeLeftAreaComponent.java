package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftMenuArea.LeftMenuHomeButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuTrendingButtonPageObject;

public class YoutubeLeftAreaComponent {

    private LeftMenuHomeButtonPageObject leftMenuHomeButtonPageObject;
    private LeftMenuTrendingButtonPageObject leftMenuTrendingButtonPageObject;

    public YoutubeLeftAreaComponent(WebDriver driver) {
        this.leftMenuHomeButtonPageObject = new LeftMenuHomeButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuTrendingButtonPageObject = new LeftMenuTrendingButtonPageObject(driver, driver.getCurrentUrl());
    }

    public LeftMenuHomeButtonPageObject getLeftMenuHomeButtonPageObject() {
        return leftMenuHomeButtonPageObject;
    }

    public LeftMenuTrendingButtonPageObject getLeftMenuTrendingButtonPageObject() {
        return leftMenuTrendingButtonPageObject;
    }
}
