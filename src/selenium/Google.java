/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rasmussen
 */
public class Google {
    
    private static WebDriver driver = null;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get( "https://www.google.dk/search?ei=iG-qWve0CMzX6AS9gaTYBg&q=Created+and+hosted+by+danaweb&oq=Created+and+hosted+by+danaweb&gs_l=psy-ab.3..0i22i30k1l2.16426704.16430880.0.16431109.29.24.0.5.5.0.155.1845.21j3.24.0....0...1c.1.64.psy-ab..0.29.1854...0j0i67k1j0i131k1j0i131i67k1j0i10k1j0i22i10i30k1j0i13i30k1j33i22i29i30k1.0.MtSDa1Uza8o" );
        
        List<WebElement> cites = driver.findElements(By.cssSelector("#search cite"));
        
        System.out.println("" + driver.getTitle());
        
        String[] al = new String[9];
        
        for (String string : al) {
            
        }
        
        driver.close();
    }
}
