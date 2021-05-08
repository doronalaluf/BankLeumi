package Sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import utilities.CommonOps;
import workflows.WebFlows;

public class BankLeumiWeb extends CommonOps {

    @Test(description = "Test01- Verify Locate Branch")
    @Description ("This Test Search Branch and Verify it")
    public static void LocateBranch (){
        WebFlows.LocatingBranches();
        Verifications.VerifyText(LocatingBranches.TitlePage , "איתור סניפים");
        WebFlows.SearchForBranch();
        Verifications.VerifyText(LocatingBranches.TitleBranch , "סניף פלורנטין");
        WebFlows.DaysOfWeeks();
    }


}
