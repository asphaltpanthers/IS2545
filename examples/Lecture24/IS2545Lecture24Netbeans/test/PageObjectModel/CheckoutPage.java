/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author AsphaltPanthers
 */
public class CheckoutPage extends Page {
    By remove = By.xpath("//*[@value='Remove']");
    
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    
    public CheckoutPage removeItemFromCart() {
        driver.findElement(remove).click();
        
        return this;
    }
}
