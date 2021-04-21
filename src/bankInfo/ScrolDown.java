package bankInfo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolDown {


    public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com/");

            // Scroll Down
            JavascriptExecutor es = (JavascriptExecutor) driver;

            Thread.sleep(5000);
            es.executeScript("window.scrollBy(0,1500);");  // Went down 1500 pixel


            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[4]/a")).click(); // Click Business sellers

            driver.navigate().back();

        // Scroll Up

            es.executeScript("window.scrollBy(0,-1500");  // Went Scroll up -1500


        }
}
