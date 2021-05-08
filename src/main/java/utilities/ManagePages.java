package utilities;

import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;

public class ManagePages extends Base{

    public static void initBankLeumi () {
        Home = PageFactory.initElements(driver , pageobjects.HomePage.class);
        LocatingBranches = PageFactory.initElements(driver , pageobjects.LocatingBranchesPage.class);
    }
}
