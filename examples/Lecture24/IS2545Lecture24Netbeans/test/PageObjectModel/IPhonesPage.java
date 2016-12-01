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
public class IPhonesPage extends Page {
    By iPhone4S = By.linkText("Apple iPhone 4S 16GB SIM-Free – Black");
    
    public IPhonesPage(WebDriver driver) {
        super(driver);
    }
    
    public IPhone4SPage selectIPhone4S() {
        driver.findElement(iPhone4S).click();
        
        return new IPhone4SPage(driver);
    }
}
