package edu.githubproject.app.web.tools.pages;

import edu.githubproject.app.web.tools.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    // Eat 123 hi

    @FindBy(xpath = "//img[@alt = 'Restaurant location']") // TODO Aigerim B
    public WebElement eatTab;

    @FindBy() // TODO Akif M
    public WebElement orderNowButton;

    // Ride

    @FindBy() // TODO Nurlan N
    public WebElement rideTab;

    @FindBy(xpath = "//div[contains(@class,'tm tn to')]") // TODO Petro Z
    public WebElement pickupLocationInput;

    @FindBy() // TODO Roma
    public WebElement dropoffLocationInput;

    @FindBy() // TODO Rostyslav
    public WebElement requestNowButton;

    // Earn

    @FindBy() // TODO Akmaral S
    public WebElement earnTab;

    @FindBy(xpath = "//span[text()='Earn']") // TODO Safiie
    public WebElement signupToDriveButton;

    // Freight

    @FindBy() // TODO Altynai B
    public WebElement freightTab;

    @FindBy() // TODO Svetlana S
    public WebElement getShipperDetailsButton;

    // Business

    @FindBy() // TODO Altynay
    public WebElement businessTab;

    @FindBy(xpath = "//a[text()='See how']") // TODO Timur Y
    public WebElement businessLearnMoreButton;

    // Transit

    @FindBy(xpath = "//button[@class='dy dz bo ds e0 e1 e2 ct e3 e4 e5 e6 be e7 ca e8 e9 ea eb bi ec ed ee b8 b6 bj b7 bu c4 bv ef eq er es et ek el eu ev de w9 dm']")
    public WebElement languageButton;

    //ToDo Vladimir H
    @FindBy(xpath = "//a[@href='https://www.uber.com/us/en/coronavirus/']")
    public WebElement transitLearnMoreButton;

    // Bike and Scoot

    @FindBy() // TODO Andrew A
    public WebElement bikeScootTab;

    // TODO Jane R
    @FindBy(xpath = "//span[@class='bm l0 ds bo bu c4 bv ef l1 l2 l3' and text()='Ride']")
    public WebElement getRideButton;

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getEatTab() {
        return eatTab;
    }

    public WebElement getOrderNowButton() {
        return orderNowButton;
    }

    public WebElement getRideTab() {
        return rideTab;
    }

    public WebElement getPickupLocationInput() {
        return pickupLocationInput;
    }

    public WebElement getDropoffLocationInput() {
        return dropoffLocationInput;
    }

    public WebElement getRequestNowButton() {
        return requestNowButton;
    }

    public WebElement getEarnTab() {
        return earnTab;
    }

    public WebElement getSignupToDriveButton() {
        return signupToDriveButton;
    }

    public WebElement getFreightTab() {
        return freightTab;
    }

    public WebElement getGetShipperDetailsButton() {
        return getShipperDetailsButton;
    }

    public WebElement getBusinessTab() {
        return businessTab;
    }

    public WebElement getBusinessLearnMoreButton() {
        return businessLearnMoreButton;
    }

    public WebElement getTransitTab() {
        return languageButton;
    }

    public WebElement getTransitLearnMoreButton() {
        return transitLearnMoreButton;
    }

    public WebElement getBikeScootTab() {
        return bikeScootTab;
    }

    public WebElement getGetRideButton() {
        return getRideButton;
    }
}
