/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoPageObjectModel;

import com.google.common.base.Predicate;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author AsphaltPanthers
 */
public class NoPOM {
    @Test
    public void addIPhoneToShoppingCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "libs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://store.demoqa.com/");
        
        //hover over 'Product Category' top menu item
        WebElement topMenuProductCategory = driver.findElement((By.id("menu-item-33")));
        Actions action = new Actions(driver);
        action.moveToElement(topMenuProductCategory).build().perform();
        
        //select iPhones
        driver.findElement(By.id("menu-item-37")).click();
        
        //select iPhone 4S
        driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).click();
        
        //click 'Add To Cart'
        driver.findElement(By.className("wpsc_buy_button")).click();
        
        //click 'Go to Checkout'
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((Predicate<WebDriver>)d -> d.findElement(By.className("go_to_checkout")).isDisplayed());
        driver.findElement(By.className("go_to_checkout")).click();
        
        //remove iPhone from cart
        driver.findElement(By.xpath("//*[@value='Remove']")).click();
        
        Thread.sleep(5000);
        
        driver.close();
    }
    
    
}
