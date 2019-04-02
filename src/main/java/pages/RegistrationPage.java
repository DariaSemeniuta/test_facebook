package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class RegistrationPage {
    public String mainPage = "https://www.facebook.com/";
    public By firstName = By.name("firstname");
    public By lastName = By.name("lastname");
    public By regEntity = By.name("reg_email__");
    public By regPwd = By.name("reg_passwd__");
    public By birthdayDay = By.id("day");
    public By birthdayMonth = By.id("month");
    public By birthdayYear = By.id("year");
    public By radioSex = By.name("sex");
    public By registrationButton = By.name("websubmit");

    private WebElement webElement = null;
    private final WebDriver webDriver;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(mainPage);
        PageFactory.initElements(webDriver, this);
    }

    private void enterValue(By textField, String value){
        webElement = webDriver.findElement(textField);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public void fillForm(String name, String surname, String regEmail, String password, String day, String month, String year, String sex ){
        enterValue(firstName, name);
        enterValue(lastName, surname);
        enterValue(regEntity, regEmail);
        enterValue(regPwd, password);
        setGender(sex);
        select(birthdayDay, day);
        select(birthdayMonth, month);
        select(birthdayYear, year);
    }

    private void select(By selectBox, String value){
        Select values = new Select(webDriver.findElement(selectBox));
        values.selectByValue(value);
    }

    public void setGender (String value){
        List<WebElement> radioButtons = webDriver.findElements(radioSex);
        if(value.equals("w")){
            radioButtons.get(0).click();
        }else{
            radioButtons.get(1).click();
        }
    }

    public void submit(){
        webElement = webDriver.findElement(registrationButton);
        webElement.click();
    }
}
