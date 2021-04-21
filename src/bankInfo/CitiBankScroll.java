package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankScroll {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.citi.com//");

        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("window.scrollBy(0,1500);");

        Thread.sleep(5000);

        ex.executeScript("window.scrollBy(0,-1500);");

       // driver.findElement(By.cssSelector("[@id='0c6f1864-a67f-5171-d9e0-ebd0b1d4d5ce']")).click();

    }

}