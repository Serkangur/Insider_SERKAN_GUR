package constants;

import org.openqa.selenium.By;

public class ConstantsHomePage {
    public static By cookieButton = By.id("wt-cli-accept-all-btn");
    public static By insiderLogo =By.xpath("//img[@alt=\"insider_logo\"]");
    public static By companyElement=By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[5]");
    public static By careersElement = By.xpath("//a[text()='Careers']");
}
