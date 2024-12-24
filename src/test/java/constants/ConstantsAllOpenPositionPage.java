package constants;

import org.openqa.selenium.By;

public class ConstantsAllOpenPositionPage {
    public static By locationElement = By.xpath("//span[@id=\"select2-filter-by-location-container\"]");
    public static By choiceLocation = By.xpath("(//ul[@class=\"select2-results__options\"])/li[2]");
    public static By departmentElement = By.xpath("//span[@id=\"select2-filter-by-department-container\"]");
    public static By choiceDepartment= By.xpath("//ul[@class=\"select2-results__options\"]/li[14]");
    public static By jobListCheck= By.xpath("//div[@id=\"jobs-list\"]");
    public static By allPositionValue =By.xpath("//p[@class=\"position-title font-weight-bold\"]");
    public static By quality_Value = By.xpath("//span[@class=\"position-department text-large font-weight-600 text-primary\"]");
    public static By location_Value =By.xpath("//div[@class=\"position-location text-large\"]");
    public static By qualityVisibility= By.xpath("//span[@title=\"Quality Assurance\"]");
    public static By viewRoleElement= By.xpath("(//a[text()='View Role'])[2]");
    public static By leverPageElement=By.xpath("//img[@alt=\"Insider. logo\"]");
}
