package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static constants.ConstantsCareersPage.*;

public class CareersPage extends BasePage {



    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLocationLogo() {
        return isElementDisplayed(locationLogo);
    }
    public WebElement getTeamsButton() {
        return isElementDisplayed(teamsButton);
    }
    public WebElement getLifeLogo() {
        return isElementDisplayed(lifeLogo);
    }


}
