package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AddcartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addcart {

    private WebDriver driver;

    private AddcartPage addcartPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        addcartPage = new AddcartPage();
    }

    @AfterClass
    public void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }


    @Test
    public void testValidCart(){addcartPage.formBtnCart();}

}
