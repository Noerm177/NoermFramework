package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsPage {

    WebDriver driver;
    WebDriverWait wait;

    public WindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
    }

    @FindBy(id = "c-shellmenu_50")
    WebElement win10;

    @FindBy(css = "ul[data-m='{\\\"cN\\\":\\\"Windows10_cont\\\",\\\"cT\\\":\\\"Container\\\",\\\"id\\\":\\\"c3c8c2m1r1a1\\\",\\\"sN\\\":3,\\\"aN\\\":\\\"c8c2m1r1a1\\\"}']")
    WebElement dropWin;

    public void openDropWin10() {
        win10.click();
    }

    public void printDropWin() {
        openDropWin10();
        System.out.println("\n" + dropWin.getAttribute("innerText"));
        
    }


}
