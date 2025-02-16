package com.opencrm.util;

import com.opencrm.base.TestBase;

public class TestUtil extends TestBase {

public static long PAGE_LOAD_TIMEOUT = 50;
public static long IMPLICIT_WAIT = 50;

public void switchToFrame(){
    driver.switchTo().frame("");
}

}
