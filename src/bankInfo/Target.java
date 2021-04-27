package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://target.com");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='categories']")).click();
    }

}