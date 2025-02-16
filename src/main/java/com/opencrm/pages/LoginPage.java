package com.opencrm.pages;

import com.opencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

//page factory - OR

    @FindBy(name = "email")
    WebElement email;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement submitButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[text()='login']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[@class='sc-beyTiQ gDasas']")
    WebElement hdorLogo;

    //initializing the page object
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //Actions

    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateHDORImage(){
        return hdorLogo.isDisplayed();
    }

    public DashBoardPage enterEmail(){
        email.sendKeys(prop.getProperty("username"));
        submitButton.click();
        password.sendKeys(prop.getProperty("password"));
        loginBtn.click();

        return new DashBoardPage();

    }


}
