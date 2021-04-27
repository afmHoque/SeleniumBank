package classHomeWorkAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WallMartWebsite {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://walmart.com");

        JavascriptExecutor es = (JavascriptExecutor) driver;

        Thread.sleep(5000);

        es.executeScript("window.scrollBy(0,4500);");  // Went scroll down 4500 pixel


        WebElement ele = driver.findElement(By.cssSelector("#js-global-footer-wrapper > div > div:nth-child(2) > div > div:nth-child(4) > ul"));
        System.out.println(ele.getText());






      //  driver.close();


    }
}