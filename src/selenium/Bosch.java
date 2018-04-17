/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Rasmussen
 */
public class Bosch {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver ", "/Users/Rasmussen/NetBeansProjects/Selenium");
        driver = new ChromeDriver();
        driver.get("https://www.bosch-professional.com/dk/da/");
        driver.findElement(By.xpath("//*[@id=\"header-search\"]/div[2]/button")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.id("search"));
        element.sendKeys("PSR 18");
        element.submit();
        driver.findElement(By.xpath("//*[@id=\"06017A5100\"]/a[2]")).click(); 
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"06017A3300\"]/a[2]")).click();
        Thread.sleep(5000);
        driver.quit();
    
    }
    
}
