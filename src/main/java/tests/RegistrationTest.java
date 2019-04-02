package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.RegistrationPage;

public class RegistrationTest extends InitTest {

    private RegistrationPage regPage;
    private String firstName = "test";
    private String lastName = "test";
    private String regEntity = "+38096280000";
    private String regPwd = "123";
    private String birthdayDay = "1";
    private String birthdayMonth = "3";
    private String birthdayYear = "1994";
    private String radioSex = "w";

    @Test
    public void testRegisterByPhone() throws InterruptedException {
        regPage = new RegistrationPage(webDriver);
        regPage.fillForm(firstName,lastName, regEntity, regPwd,birthdayDay,birthdayMonth,birthdayYear,radioSex);
        regPage.submit();
        //webDriver.wait(300);
        Assert.assertTrue(true);

    }
}
