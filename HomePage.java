package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.HomePageElements;

public class HomePage extends AbstractPage implements HomePageElements {

    private static final String PAGE_HOME_URL = "http://localhost:4200/festivals";

    //
    By BY_SEARCH_FIELD = By.xpath(HomePageElements.SEARCH_FIELD_XPATH);
    By BY_SEARCH_BOX_ICON = By.xpath(HomePageElements.SEARCH_BOX_ICON_XPATH);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Launch home page URL
    public void navigateToHomePage() {
        getDriver().navigate().to(PAGE_HOME_URL);
    }

   }
