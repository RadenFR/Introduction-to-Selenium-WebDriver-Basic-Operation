package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement usernameInput;


    @FindBy(id = "password")
    private WebElement passwordInput;


    @FindBy(id = "login-button")
    private WebElement loginButton;


    @FindBy(css = "[data-test='error']")
    private WebElement errorAlert;


    @FindBy(className = "title")
    private WebElement pageTitle;


    public void login(String username, String password) {
        waitForElementToBeVisible(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public boolean isUserLoggedInSuccessfully() {
        try {
            waitForElementToBeVisible(pageTitle);
            return pageTitle.isDisplayed() && pageTitle.getText().equals("Products");
        } catch (Exception e) {
            return false;
        }
    }


    public boolean isErrorMessageDisplayed() {
        try {
            waitForElementToBeVisible(errorAlert);
            return errorAlert.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public String getErrorMessage() {
        try {
            waitForElementToBeVisible(errorAlert);
            return errorAlert.getText();
        } catch (Exception e) {
            return "";
        }
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


}

