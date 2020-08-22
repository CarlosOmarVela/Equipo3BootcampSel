package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftMenuArea.*;

public class YoutubeLeftAreaComponent {

    private LeftMenuHomeButtonPageObject leftMenuHomeButtonPageObject;
    private LeftMenuTrendingButtonPageObject leftMenuTrendingButtonPageObject;
    private LeftMenuSubscriptionButtonPageObject leftMenuSubscriptionButtonPageObject;
    private LeftMenuLibraryButtonPageObject leftMenuLibraryButtonPageObject;
    private LeftMenuHistoryButtonPageObject leftMenuHistoryButtonPageObject;
    private LeftMenuBestOfYoutubePageObject leftMenuBestOfYoutubePageObject;

    public YoutubeLeftAreaComponent(WebDriver driver) {
        this.leftMenuHomeButtonPageObject = new LeftMenuHomeButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuTrendingButtonPageObject = new LeftMenuTrendingButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuSubscriptionButtonPageObject = new LeftMenuSubscriptionButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuLibraryButtonPageObject = new LeftMenuLibraryButtonPageObject(driver,driver.getCurrentUrl());
        this.leftMenuHistoryButtonPageObject = new LeftMenuHistoryButtonPageObject(driver, driver.getCurrentUrl());
        this.leftMenuBestOfYoutubePageObject = new LeftMenuBestOfYoutubePageObject(driver, driver.getCurrentUrl());
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

    public LeftMenuHistoryButtonPageObject getLeftMenuHistoryButtonPageObject() {
        return leftMenuHistoryButtonPageObject;
    }

    public LeftMenuBestOfYoutubePageObject getLeftMenuBestOfYoutubePageObject() {
        return leftMenuBestOfYoutubePageObject;
    }
}
