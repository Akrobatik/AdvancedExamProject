/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rasmussen
 */
public class DenvyBlog {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver ", "/Users/Rasmussen/NetBeansProjects/Selenium");
        driver = new ChromeDriver();
        driver.get("http://google.dk/");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("Created and hosted by DanaWeb A/S");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        List<WebElement> titles = driver.findElements(By.cssSelector("cite.iUh30"));
        //List<WebElement> dates = driver.findElements(By.cssSelector("span.entry-date"));
        System.out.println(" =============== Denvycom Articles on Research ================= ");
        for (int j = 0; j < titles.size(); j++) {
            System.out.println(  titles.get(j).getText() ) ;
        }
        
        driver.quit();
    
    }
    
}
