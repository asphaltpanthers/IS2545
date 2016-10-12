/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 *
 * @author AsphaltPanthers
 */
public class HelloWorldTest extends BaseTest {
    @Test
    public void helloWorldTestThatFails() {
        driver.get("http://www.google.com/");
        
        driver.findElement(By.id("lst-ib")).sendKeys("Hello World!" + Keys.RETURN);
        
        WebElement rightHandSideHeader = driver.findElement(By.xpath("//div[contains(@class, 'kno-ecr-pt')]"));
        assertEquals("\"Hello, World!\" program", rightHandSideHeader.getText());
    }
    
    @Test
    public void helloWorldTestThatSucceeds() {
        driver.get("http://www.google.com/");
        
        driver.findElement(By.id("lst-ib")).sendKeys("Hello World!" + Keys.RETURN);
        
        By rightHandSideSelector = By.xpath("//div[contains(@class, 'kno-ecr-pt')]");
        waitUntil(d -> d.findElement(rightHandSideSelector).isDisplayed());
        assertEquals("\"Hello, World!\" program", driver.findElement(rightHandSideSelector).getText());
    }
}
