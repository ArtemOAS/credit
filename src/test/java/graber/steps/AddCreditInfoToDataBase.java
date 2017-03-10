package graber.steps;
import graber.page.CreditPage;
import org.testng.annotations.Test;

public class AddCreditInfoToDataBase {

    @Test
    public void addCreditInfo() {
        CreditPage creditPage = new CreditPage();
        creditPage.addDataCredit();
    }
}
