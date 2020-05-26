package Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locates
    @FindBy(css = "nav#uhf-g-nav > .js-paddle-items")
    @CacheLookup
    WebElement navMenuHome;

    @FindBys({ @FindBy(css = "a#shellmenu_1.c-uhf-nav-link"), @FindBy(id = "shellmenu_2"), @FindBy(id = "shellmenu_3"),
            @FindBy(id = "shellmenu_4"), @FindBy(id = "shellmenu_5"), @FindBy(id = "l1_support") })
    List<WebElement> navMenus; // = new ArrayList<WebElement>();

    @FindBy(css = "a#shellmenu_1.c-uhf-nav-link")
    WebElement officeText;

    @FindBy(id = "shellmenu_2")
    WebElement winText;

    @FindBy(id = "shellmenu_3")
    WebElement surfaceText;

    @FindBy(id = "shellmenu_4")
    WebElement xboxText;

    @FindBy(id = "shellmenu_5")
    WebElement dealsText;

    @FindBy(id = "l1_support")
    WebElement supportText;

    public void getTextOffice() {
        String realOffice = officeText.getAttribute("innerText");
        try {
            Assert.assertEquals("Office", realOffice);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realOffice);
            throw e;
        }
        System.out.println("*PASS* Found: " + realOffice);
    }

    public void getWinText() {
        String realWin = winText.getAttribute("innerText");
        try {
            Assert.assertEquals("Windows", realWin);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realWin);
            throw e;
        }
        System.out.println("*PASS* Found: " + realWin);
    }

    public void getSurfaceText() {
        String realSurf = surfaceText.getAttribute("innerText");
        try {
            Assert.assertEquals("Surface", realSurf);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realSurf);
            throw e;
        }
        System.out.println("*PASS* Found: " + realSurf);

    }

    public void getXboxText() {
        String realXbx = xboxText.getAttribute("innerText");
        try {
            Assert.assertEquals("Xbox", realXbx);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realXbx);
            throw e;
        }
        System.out.println("*PASS* Found: " + realXbx);
    }

    public void getDealsText() {
        String realDeal = dealsText.getAttribute("innerText");
        try {
            Assert.assertEquals("Deals", realDeal);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realDeal);
            throw e;
        }
        System.out.println("*PASS* Found: " + realDeal);
    }

    public void getSupportText() {
        String realSupp = supportText.getAttribute("innerText");
        try {
            Assert.assertEquals("Support", realSupp);

        } catch (AssertionError e) {
            System.out.println("*ERROR* Expected: \"Office\" Found: " + realSupp);
            throw e;
        }
        System.out.println("*PASS* Found: " + realSupp);
    }

}
