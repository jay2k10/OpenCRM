package com.opencrm.testcases;

import com.opencrm.base.TestBase;
import com.opencrm.pages.DashBoardPage;
import com.opencrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    DashBoardPage dashBoardPage;

    public LoginPageTest() {
        super();
    }

    @BeforeTest
    public void setUp(){
        initialization();
         loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"HDOR");
    }
    @Test(priority = 2)
    public void hdorLogoTest(){
        boolean flag =loginPage.validateHDORImage();
        Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void login(){
        dashBoardPage=loginPage.enterEmail();
    }




    //@AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }


}
