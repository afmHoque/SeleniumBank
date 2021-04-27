package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSSCelectorPractice {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/"); // open url BOA

        // Tag and ID

//        driver.findElement(By.cssSelector("#email")).sendKeys("hoque");
//        driver.findElement(By.cssSelector("imput#email")).sendKeys("hoque");

        // Tag and Class

        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
       // driver.findElement(By.cssSelector(".inputtext ")).sendKeys("Alimure");

        // Tag and attribuute values
       // driver.findElement(By.cssSelector("[data-testid=royal_email]")).sendKeys("SK Ahmed");
        //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("ASM Zakaria");
        // Tag, Class And attribute
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email")).sendKeys("Milad");
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass")).sendKeys("Abc");

    }
}