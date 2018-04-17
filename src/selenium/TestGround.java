
package selenium;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rasmussen
 */
public class TestGround {
   private static WebDriver driver = null;
   
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver ", "/Users/Rasmussen/NetBeansProjects/Selenium");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Tina Jensen");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}
