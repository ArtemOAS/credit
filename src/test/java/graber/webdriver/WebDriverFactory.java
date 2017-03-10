package graber.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.StringUtils;

public class WebDriverFactory {

    public static WebDriver getWebDriver() {
        WebDriver webDriver = createWebDriver();
        return webDriver;
    }

    private static WebDriver createWebDriver() {

        WebBrowser browser = WebBrowser.valueOf(getBrowserName());
        System.out.println("I am using - " + browser.name());
        System.setProperty("webdriver.chrome.driver", "src/test/java/graber/drivers/chromedriver.exe");

        switch (browser) {
            case CHROME:
                return new ChromeDriver();
            default:
                return new ChromeDriver();
        }
    }

    private static String getBrowserName() {
        String browser = System.getProperty("browser");
        if (StringUtils.isEmpty(browser)) {
            browser = "CHROME";
        }

        return browser.toUpperCase();
    }

    public static void quit() {
        WebDriver webDriver = createWebDriver();
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
