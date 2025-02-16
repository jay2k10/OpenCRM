package com.opencrm.pages;

import com.opencrm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends TestBase{

    @FindBy(xpath = "//h6[contains(text(),'My Events')]")
    WebElement myEventsLink;

    @FindBy(xpath = "//h6[contains(text(),'Explore Events')]")
    WebElement exploreEventsLink;

    @FindBy(xpath = "//h6[contains(text(),'Past Events')]")
    WebElement pastEventsLink;

    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }

    public String verifyTitle(){
        return driver.getTitle();
    }
    public ExploreEventsPage clickonExploreEvent(){
        exploreEventsLink.click();
        return new ExploreEventsPage();
    }
    public PastEventsPage clickOnPastEvent(){
        pastEventsLink.click();
        return new PastEventsPage();

    }




}
