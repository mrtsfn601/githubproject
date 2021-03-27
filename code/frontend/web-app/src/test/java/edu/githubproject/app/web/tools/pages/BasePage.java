package edu.githubproject.app.web.tools.pages;

import edu.githubproject.app.web.tools.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath = "//a[@aria-label='Go to Uber.com']") // TODO Assel K
    public WebElement logo;

    // Login

    @FindBy() // TODO Bulat S
    public WebElement loginButton;

    @FindBy(xpath = "//h2[text()='Driver login']") // TODO Dana I
    public WebElement driverLoginButton;

    @FindBy(xpath = "//span[text()='Ride']") // TODO Daniel K
    public WebElement riderLoginButton;

    // Signup

    @FindBy() // TODO Kate Z
    public WebElement signupButton;

    // Menu

    @FindBy() // TODO Elena T
    public WebElement menuButton;

    @FindBy() // TODO Liudmyla S
    public WebElement companyButton;

    @FindBy() // TODO Maksym F
    public WebElement safetyButton;

    @FindBy(xpath = "//a[@aria-label='Get help']") // TODO Malika M
    public WebElement helpButton;

    @FindBy() // TODO Mariya S
    public WebElement covid19ResourcesButton;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDriverLoginButton() {
        return driverLoginButton;
    }

    public WebElement getRiderLoginButton() {
        return riderLoginButton;
    }

    public WebElement getSignupButton() {
        return signupButton;
    }

    public WebElement getMenuButton() {
        return menuButton;
    }

    public WebElement getCompanyButton() {
        return companyButton;
    }

    public WebElement getSafetyButton() {
        return safetyButton;
    }

    public WebElement getHelpButton() {
        return helpButton;
    }

    public WebElement getCovid19ResourcesButton() {
        return covid19ResourcesButton;
    }
}
