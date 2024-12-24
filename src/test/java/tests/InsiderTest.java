package tests;


import base.BaseTest;
import org.junit.Test;
import pages.AllOpenPositionPage;
import pages.CareersPage;
import pages.HomePage;
import pages.QAPage;



public class InsiderTest extends BaseTest {
    HomePage homePage;
    CareersPage careersPage;
    QAPage qaPage;
    AllOpenPositionPage allOpenPositionPage;

    @Test
    public void insiderTest() throws InterruptedException {
         homePage = new HomePage(driver);
         homePage.getDriver("https://useinsider.com/");
         homePage.clickCookieButton();
         homePage.insiderLogoCheck();
         homePage.clickCompanyElement();
         homePage.clickCareersElement();

         careersPage = new CareersPage(driver);
         careersPage.verifyCurrentUrl("https://useinsider.com/careers/");
         careersPage.getLocationLogo(); //isDisplayed
         careersPage.getTeamsButton();  //isDisplayed
         careersPage.getLifeLogo();     //isDisplayed


         qaPage = new QAPage(driver);
         qaPage.getDriver("https://useinsider.com/careers/quality-assurance/");
         qaPage.seeAllJobsClick();


         allOpenPositionPage = new AllOpenPositionPage(driver);
        AllOpenPositionPage.ScrollUtils.scrollToElement(driver, allOpenPositionPage.getJobListCheck());
        allOpenPositionPage.waitForQualityVisibility(60);
        allOpenPositionPage.clickLocationElement();
        Thread.sleep(1000);
        allOpenPositionPage.clickChoiceLocationElement();
        Thread.sleep(1000);
        allOpenPositionPage.clickDepartmentElement();
        Thread.sleep(1000);
        allOpenPositionPage.clickChoiceDepartmentElement();
        Thread.sleep(1000);
        allOpenPositionPage.getJobListCheck();
        Thread.sleep(2000);
        allOpenPositionPage.verifyAllPositionsContainQA();
        allOpenPositionPage.verifyQualityValuesContain();
        allOpenPositionPage.verifyLocationValuesContain();
        allOpenPositionPage.clickViewRoleAndSwitchToNewWindow();
        allOpenPositionPage.getLeverPageElement(); //isDisplayed

    }
}
