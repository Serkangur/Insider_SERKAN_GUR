package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsQAPage.*;

public class QAPage extends BasePage {





public QAPage(WebDriver driver) {
    super(driver);
}

public void seeAllJobsClick() {
    clickToWebElement(seeAllJobsElement);
}

}
