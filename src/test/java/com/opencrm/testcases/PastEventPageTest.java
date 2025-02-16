package com.opencrm.testcases;

import com.opencrm.base.TestBase;
import com.opencrm.pages.DashBoardPage;
import com.opencrm.pages.ExploreEventsPage;
import com.opencrm.pages.LoginPage;
import com.opencrm.pages.PastEventsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PastEventPageTest extends TestBase {

    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    ExploreEventsPage exploreEventsPage;
    PastEventsPage pastEventsPage;

    public PastEventPageTest() {
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
        dashBoardPage.clickOnPastEvent();

    }
    @Test
    public void verifyEventName(){
        Assert.assertEquals(pastEventsPage.verifyEventName(),"February 2025 Cycling Challenge");

    }
}
