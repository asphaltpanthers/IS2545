/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author AsphaltPanthers
 */
public class HomePage extends Page {
    By topMenuProductCategory = By.id("menu-item-33");
    By subMenuIPhones = By.id("menu-item-37");
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    public IPhonesPage navigateToIPhonesProductCategory() {
        hoverOverTopMenuProductCategory();
        driver.findElement(subMenuIPhones).click();
        
        return new IPhonesPage(driver);
    }
    
    private void hoverOverTopMenuProductCategory() {
        WebElement topMenuProductCategoryElement = driver.findElement(topMenuProductCategory);
        Actions action = new Actions(driver);
        action.moveToElement(topMenuProductCategoryElement).build().perform();
    }
}
