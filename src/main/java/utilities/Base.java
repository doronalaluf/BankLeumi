package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import pageobjects.LocatingBranchesPage;

public class Base {
    protected static WebDriver driver;
    protected static Wait wait;

    protected static pageobjects.HomePage Home;
    protected static LocatingBranchesPage LocatingBranches;
}
