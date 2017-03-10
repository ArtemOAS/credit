package graber;

import graber.webdriver.WebDriverFactory;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Artem on 06.03.2017.
 */
public class LifecycleSteps {
    private static final Logger LOG = Logger.getLogger(LifecycleSteps.class);

    @BeforeMethod
    public void initWebDrover() {
        LOG.info("BeforeStory init web driver");
        WebDriverFactory.getWebDriver();
    }

    @AfterMethod
    public void quiteBrowser() {
        LOG.info("AfterStory quit driver");
        WebDriverFactory.quit();
    }
}
