package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//Locates
    @FindBy(css = "nav#uhf-g-nav > .js-paddle-items")
    @CacheLookup
    WebElement navMenuHome;

    @FindBys
    ( {
            @FindBy(className = "single-link js-nav-menu uhf-menu-item"),
            @FindBy(className = "single-link uhf-menu-item")
    } )
    public List<WebElement> navMenus;

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
        officeText.click();
        
    }

    public String getWinText(){
        return  winText.getAttribute("innerHTML");
    }

    public String getSurfaceText(){
        return  surfaceText.getAttribute("innerHTML");
    }

    public String getXboxText(){
        return  xboxText.getAttribute("innerHTML");
    }

    public String getDealsText(){
        return  dealsText.getAttribute("innerHTML");
    }

    public String getSupportText(){
        return  supportText.getAttribute("innerHTML");
    }

}
