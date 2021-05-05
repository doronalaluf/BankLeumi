package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath = "//ul[@class='inner_menu iconMenu']/li[2]")
    public WebElement LocatingBranches;


}
