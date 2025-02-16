package com.opencrm.testcases;

import com.opencrm.base.TestBase;
import com.opencrm.pages.DashBoardPage;
import com.opencrm.pages.ExploreEventsPage;
import com.opencrm.pages.LoginPage;
import com.opencrm.pages.PastEventsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase {

    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    ExploreEventsPage exploreEventsPage;
    PastEventsPage pastEventsPage;

    public DashboardPageTest() {
        super();
    }

    @BeforeTest
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        dashBoardPage = new DashBoardPage();
        exploreEventsPage = new ExploreEventsPage();
        pastEventsPage = new PastEventsPage();
        dashBoardPage = loginPage.enterEmail();

    }

    @Test(priority = 1)
    public void verifyDashboardTitle() {
        String titleDashboard = dashBoardPage.verifyTitle();
        Assert.assertEquals(titleDashboard, "HDOR", "DashBoard Title Not Matched!!");
    }

    @Test(priority = 2)
    public void clickonExploreEventsPage() {
        exploreEventsPage = dashBoardPage.clickonExploreEvent();


    }

    @Test(priority = 3)
    public void clickonPastEvent() {
        pastEventsPage = dashBoardPage.clickOnPastEvent();
    }


//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

}
