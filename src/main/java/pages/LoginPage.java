package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By emailInput = By.id("ap_email");
    By continueButton = By.xpath("//*[@id='continue'][@type='submit']");
    By passwordInput = By.cssSelector("#ap_password");
    By submitButton = By.id("signInSubmit");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void login() {
        sendKeysToElement(emailInput, "amazontestdeneme1@gmail.com");
        clickToElement(continueButton);
        sendKeysToElement(passwordInput, "0018000Na");
        clickToElement(submitButton);
    }

    public void checkForLogout() {
        elementIsDisplayed(emailInput);
    }
}
