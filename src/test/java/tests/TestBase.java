package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase {
    public static WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        //quitar Webdriver Type, dejar webdriver
        driver = new ChromeDriver();
        driver.get("https://www.microsoft.com/en-us/");
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown()
    {
        TestBase.driver.close();
        TestBase.driver.quit();
    }

}
