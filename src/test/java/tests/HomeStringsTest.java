package tests;

import Pages.HomePage;
import org.testng.annotations.Test;


public class HomeStringsTest extends TestBase {

    @Test
    public void TestValues() throws Exception{
        HomePage HP = new HomePage(driver);
        HP.getTextOffice();
        //Assert.assertEquals(ActualValue,"Office");
    }

}
