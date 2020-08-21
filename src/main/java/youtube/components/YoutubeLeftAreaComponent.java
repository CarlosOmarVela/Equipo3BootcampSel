package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftMenuArea.LeftMenuHomeButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuLibraryButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuSubscriptionButtonPageObject;
import youtube.pageobjects.leftMenuArea.LeftMenuTrendingButtonPageObject;

public class YoutubeLeftAreaComponent {

    private LeftMenuHomeButtonPageObject leftMenuHomeButtonPageObject;
    private LeftMenuTrendingButtonPageObject leftMenuTrendingButtonPageObject;
    private LeftMenuSubscriptionButtonPageObject leftMenuSubscriptionButtonPageObject;
    private LeftMenuLibraryButtonPageObject leftMenuLibraryButtonPageObject;

    public YoutubeLeftAreaComponent(WebDriver driver) {
        this.leftMenuHomeButtonPageObject = new LeftMenuHomeButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuTrendingButtonPageObject = new LeftMenuTrendingButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuSubscriptionButtonPageObject = new LeftMenuSubscriptionButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuLibraryButtonPageObject = new LeftMenuLibraryButtonPageObject(driver,driver.getCurrentUrl());
    }

    public LeftMenuHomeButtonPageObject getLeftMenuHomeButtonPageObject() {
        return leftMenuHomeButtonPageObject;
    }

    public LeftMenuTrendingButtonPageObject getLeftMenuTrendingButtonPageObject() {
        return leftMenuTrendingButtonPageObject;
    }

    public LeftMenuSubscriptionButtonPageObject getLeftMenuSubscriptionButtonPageObject() {
        return leftMenuSubscriptionButtonPageObject;
    }

    public LeftMenuLibraryButtonPageObject getLeftMenuLibraryButtonPageObject() {
        return leftMenuLibraryButtonPageObject;
    }
}
