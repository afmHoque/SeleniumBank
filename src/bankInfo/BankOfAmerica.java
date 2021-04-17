package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmerica {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bankofamerica.com/"); // open url BOA

        driver.findElement(By.xpath("//input[@ id ='onlineId1']")).sendKeys("Hoque");  // On line id or email

        driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("Password"); // Password

        driver.findElement(By.xpath("//label[@class='spa-input-option-label']")).click(); // save box

        Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@class='spa-btn spa-btn--primary spa-btn--block spa-btn--medium']")).click(); // Click sign in button

        driver.findElement(By.xpath("//a[@id='forgot-oid-pwd']")).click(); // forget password

        Thread.sleep(5000);
        driver.navigate().back();



    }

}


