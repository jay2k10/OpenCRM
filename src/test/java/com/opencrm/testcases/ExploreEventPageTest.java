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

public class ExploreEventPageTest extends TestBase {

    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    ExploreEventsPage exploreEventsPage;
    PastEventsPage pastEventsPage;

    public ExploreEventPageTest() {
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
        dashBoardPage.clickonExploreEvent();


    }
    @Test
    public void verifyEventName(){
        Assert.assertEquals(exploreEventsPage.verifyEventName(),"KCC Running Challenge - S1");

    }
//    @AfterMethod
//   public void tearDown(){
//        driver.quit();
//    }
}
