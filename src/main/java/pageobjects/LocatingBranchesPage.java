package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatingBranchesPage {
    @FindBy(xpath = "//input[@class='watermark ui-autocomplete-input']")
    public WebElement SearchField;

    @FindBy(xpath = "//li[@class='ui-menu-item'][2]")
    public WebElement SelectBranch;

    @FindBy(xpath = "//div[@class='col-sm-12']/h1/span")
    public WebElement TitleBranch;

}
