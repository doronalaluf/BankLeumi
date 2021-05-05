package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    @BeforeClass
    public static void StartSession (){
        String platform = "web";
        if(platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
//        else if(platform.equalsIgnoreCase("mobile"))
//            initMobile();
//        else if(platform.equalsIgnoreCase("api"))
//            initAPI();
        else throw new RuntimeException("invalid platform");
    }

    public static void initBrowser (String BrowserType){
        if(BrowserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver ();
        else if (BrowserType.equalsIgnoreCase("IE"))
             driver = initIEDriver ();
        else if (BrowserType.equalsIgnoreCase("firefox"))
            driver = initFireFoxDriver ();
        else throw new RuntimeException("invalid BrowserType");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.leumi.co.il/");
    }


    public static WebDriver initChromeDriver () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initIEDriver () {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    public static WebDriver initFireFoxDriver () {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
