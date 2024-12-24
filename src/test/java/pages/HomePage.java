package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {



public HomePage(WebDriver driver) {
    super(driver);
}
public void clickCookieButton() {
    clickToWebElement(cookieButton);
}
public WebElement insiderLogoCheck(){
    return isElementDisplayed(insiderLogo);
}
public void clickCompanyElement() {
    clickToWebElement(companyElement);
}
public void clickCareersElement() {
    clickToWebElement(careersElement);
}


}
