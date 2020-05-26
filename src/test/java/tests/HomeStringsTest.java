package tests;

import Pages.HomePage;
import org.testng.annotations.Test;


public class HomeStringsTest extends TestBase {

    @Test
    public void TestStringsOnMenu() throws Exception{
        HomePage HP = new HomePage(driver);
        //System.out.println(HP.getTextOffice());
        HP.getTextOffice();
        HP.getWinText();
        HP.getSurfaceText();
        HP.getXboxText();
        HP.getDealsText();
        HP.getSupportText();
        
        //Assert.assertEquals(ActualValue,"Office");
    }

}
