package extensions;

import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;



public class Verifications {
    public static void VerifyText (WebElement elem, String expectedText){
        assertEquals(elem.getText(), expectedText);
    }

}
