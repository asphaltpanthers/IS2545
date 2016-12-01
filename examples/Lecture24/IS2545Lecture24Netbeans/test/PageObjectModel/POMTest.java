/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author AsphaltPanthers
 */
public class POMTest {
    WebDriver driver;
    
    @Before
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "libs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://store.demoqa.com/");
    }
    
    @After
    public void TearDown() {
        driver.close();
    }
    
    @Test
    public void addIPhoneToShoppingCart() {
        new HomePage(driver).navigateToIPhonesProductCategory()
                .selectIPhone4S()
                .clickAddToCart()
                .clickGoToCheckout()
                .removeItemFromCart();
    }
}
