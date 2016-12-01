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
public class IPhone4SPage extends Page {
    By addToCart = By.className("wpsc_buy_button");
    
    public IPhone4SPage(WebDriver driver) {
        super(driver);
    }
    
    public AddToCartModal clickAddToCart() {
        driver.findElement(addToCart).click();
        
        return new AddToCartModal(driver);
    }
}
