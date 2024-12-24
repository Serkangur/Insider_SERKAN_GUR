package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public  void clickToWebElement (By locator){
        find(locator).click();
    }

    public void actionsClickElement(By locator){
    Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).click().perform();
    }

    public WebElement isElementDisplayed (By locator){
        WebElement element = driver.findElement(locator);
        Assert.assertTrue(element.isDisplayed());
        return element;
    }

    public void verifyCurrentUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void getDriver(String url){
        driver.get(url);
    }









}
