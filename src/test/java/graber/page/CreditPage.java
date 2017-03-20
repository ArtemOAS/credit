package graber.page;

import com.dao.BankDao;
import com.entity.CreditEntity;
import graber.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreditPage {

    private WebDriver driver;

    public CreditPage() {
        this.driver = WebDriverFactory.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@ng-model='price_slider.res']")
    private WebElement sumCredit;

    @FindBy(xpath = ".//input[@ng-model='term_slider.res']")
    private WebElement periodCredit;

    @FindBy(xpath = "//div[@class='bank-name ng-binding']")
    private List<WebElement> banksName;

    public void addDataCredit() {

        driver.get("http://xn----7sbbg0aekyd1ak4k.xn--p1ai/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        for (int sum = 1000; sum <= 30000; sum += 1000) {
            webDriverWait.until(ExpectedConditions.visibilityOf(sumCredit));
            sumCredit.clear();
            sumCredit.sendKeys(String.valueOf(sum));

            for (int period = 1; period <= 30; period++) {

                webDriverWait.until(ExpectedConditions.visibilityOf(periodCredit));
                periodCredit.clear();
                periodCredit.sendKeys(String.valueOf(period));

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                webDriverWait.until(ExpectedConditions.visibilityOfAllElements(banksName));
                for (WebElement bankData : banksName) {
                    String bankName = bankData.getText();
                    try {
                        byte[] b = bankName.getBytes("UTF-8");
                        bankName = new String(b, "UTF-8");

                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }

                    CreditEntity creditEntity = new CreditEntity(
                            sumCredit.getAttribute("value"),
                            periodCredit.getAttribute("value"),
                            bankName
                    );
                    if (selectDataCredit().size() != 0) {
                        if (!selectDataCredit().contains(creditEntity)) {
                            insertDataCredit(
                                    sumCredit.getAttribute("value"),
                                    periodCredit.getAttribute("value"),
                                    bankName

                            );
                        }
                    } else {
                        insertDataCredit(
                                sumCredit.getAttribute("value"),
                                periodCredit.getAttribute("value"),
                                bankName

                        );
                    }
                }
            }
        }
    }

    public Connection connection() throws ClassNotFoundException {

        String databaseURL = "jdbc:mysql://vinnik.beget.tech:3306/vinnik_credit?useUnicode=true&characterEncoding=UTF-8";
        String user = "vinnik_credit";
        String password = "vinnik_credit";
        Class.forName("com.mysql.jdbc.Driver");

        try {
            Connection connectionBase = DriverManager.getConnection(databaseURL, user, password);
            System.out.println("Connecting to Database...");

            if (connectionBase != null) {
                System.out.println("Connected to the Database...");
            }

            return connectionBase;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void insertDataCredit(String sumCredit, String period, String bankName) {
        try (
                Connection connection = connection();
                Statement statement = connection.createStatement();
        ) {
            String query = "INSERT INTO data_credit (sum_credit, period_credit, bank) VALUES('" + sumCredit + "'," +
                    "'" + period + "','" + bankName + "')";
            int index = statement.executeUpdate(query);
            Assert.assertNotEquals(index, -1, "Error data base");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CreditEntity> selectDataCredit() {
        List<CreditEntity> creditEntities = new ArrayList<>();
        try (
                Connection connection = connection();
                Statement statement = connection.createStatement();
        ) {

            String query = "SELECT * FROM data_credit";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String newString = new String(resultSet.getString("bank").getBytes("ISO-8859-5"), "UTF-8");
                creditEntities.add(
                        new CreditEntity(
                                resultSet.getString("sum_credit"),
                                resultSet.getString("period_credit"),
                                newString
                        )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return creditEntities;
    }


}
