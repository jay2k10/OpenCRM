package com.opencrm.pages;

import com.opencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastEventsPage extends TestBase {

    public PastEventsPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='February 2025 Cycling Challenge']")
    WebElement eventName;

    public String verifyEventName(){
        return eventName.getText();
    }
}
