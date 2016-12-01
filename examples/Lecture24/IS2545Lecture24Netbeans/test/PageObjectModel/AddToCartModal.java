/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author AsphaltPanthers
 */
public class AddToCartModal extends Page {
    By goToCheckout = By.className("go_to_checkout");
    
    public AddToCartModal(WebDriver driver) {
        super(driver);
    }
    
    public CheckoutPage clickGoToCheckout() {
        wait.until((Predicate<WebDriver>)d -> d.findElement(goToCheckout).isDisplayed());
        driver.findElement(goToCheckout).click();
        
        return new CheckoutPage(driver);
    }
}
