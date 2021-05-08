package workflows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.Date;

public class WebFlows extends CommonOps {


    @Step("Business Flow: Locate Branch")
    public static void LocatingBranches (){
        UIActions.click(Home.LocatingBranches);
    }

    @Step("Business Flow: Search For Branch")
    public static void SearchForBranch (){
        UIActions.updateText(LocatingBranches.SearchField , "תל אביב");
        UIActions.click(LocatingBranches.SelectBranch);
    }

    @Step("Business Flow: Return Days Of Weeks")
    public static void DaysOfWeeks (){
        Date date = java.util.Calendar.getInstance().getTime();
        String daysofweeks = date.toString().split(" ")[0];
        if(daysofweeks.equalsIgnoreCase("fri") || daysofweeks.equalsIgnoreCase("sat"))
            Verifications.VerifyText(LocatingBranches.StatusBranch , "סגור עכשיו");
    }
}
