package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import static constants.ConstantsAllOpenPositionPage.*;

public class AllOpenPositionPage extends BasePage {



 public AllOpenPositionPage(WebDriver driver) {
        super(driver);
 }



    public class ScrollUtils {
        public static void scrollToElement(WebDriver driver, WebElement element) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }
    }

    public WebElement qualityElement(){
     return find(quality_Value);
    }

    public WebElement waitForQualityVisibility(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(qualityVisibility));
    }

 public void clickLocationElement(){
     clickToWebElement(locationElement);
 }
 public void clickChoiceLocationElement(){
     clickToWebElement(choiceLocation);
 }
 public void clickDepartmentElement(){
     clickToWebElement(departmentElement);
 }
 public void clickChoiceDepartmentElement(){
     clickToWebElement(choiceDepartment);
 }
 public WebElement getJobListCheck(){
     return isElementDisplayed(jobListCheck);
 }

    public List<WebElement> getAllPositionValues() {
        return driver.findElements(allPositionValue);
    }
    public void verifyAllPositionsContainQA() {
        List<WebElement> allPositionValues = getAllPositionValues();
        for (WebElement posValue : allPositionValues) {
            String posText = posValue.getText();
            boolean isValid = posText.contains("Quality Assurance") || posText.contains("QA");
            Assert.assertTrue(isValid);
        }
    }

    public List<WebElement> getQualityValues() {
        return driver.findElements(quality_Value);
    }
    public void verifyQualityValuesContain() {
        List<WebElement> qualityValues = getQualityValues();
        for (WebElement quaValue : qualityValues) {
            String quaText = quaValue.getText();
            Assert.assertTrue(quaText.contains("Quality Assurance"));
        }
    }

    public List<WebElement> getLocationValues() {
        return driver.findElements(location_Value);
    }
    public void verifyLocationValuesContain() {
     List<WebElement> locationValues = getLocationValues();
     for (WebElement locValue : locationValues) {
         String locText = locValue.getText();
         Assert.assertTrue(locText.contains("Istanbul, Turkey"));
     }
    }

    public String clickViewRoleAndSwitchToNewWindow()  throws InterruptedException  {

        String windowHandle1 = driver.getWindowHandle();
        actionsClickElement(viewRoleElement);

        Set<String> handlesValuesSet = driver.getWindowHandles();
        String windowHandle2 = "";
        for (String str : handlesValuesSet) {
            if (!str.equals(windowHandle1)) {
                windowHandle2 = str;
            }
        }
        driver.switchTo().window(windowHandle2);
        return windowHandle2;
    }

    public WebElement getLeverPageElement() {
     return isElementDisplayed(leverPageElement);
    }







}
