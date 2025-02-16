package com.opencrm.pages;

import com.opencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreEventsPage extends TestBase {

    @FindBy(xpath = "//div[text()='KCC Running Challenge - S1']")
    WebElement eventName;

    public ExploreEventsPage(){
        PageFactory.initElements(driver,this);
    }


    public String verifyEventName(){
        return eventName.getText();
    }
}
