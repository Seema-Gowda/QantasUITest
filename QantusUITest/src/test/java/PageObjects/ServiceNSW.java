package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServiceNSW {

    public WebDriver driver;
    By findlocation = By.cssSelector("nav#block-global-header-menu li:nth-child(3) > a");

    /**
     * Constructor to initialise the driver
     * @param driver
     */
    public ServiceNSW(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Function to click on locate us
     */
    public void clickLocateUs() {
        driver.findElement(findlocation).click();
    }

}