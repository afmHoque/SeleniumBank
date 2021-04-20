package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaHomePage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://bankofamerica.com/");

        driver.findElement(By.xpath("//*[@id='navHomeLoans']/span[3]")).click();  // I click on Home loans

        driver.findElement(By.xpath("//*[@id='firstTimeHomeBuyer']")).click();

        driver.findElement(By.xpath("//imput[@ type='text']")).sendKeys("Hoque");


       // Thread.sleep(500);

      //  driver.findElement(By.xpath("//a[@id='firstTimeHomeBuyer']")).click();



      //  driver.findElement(By.xpath("//*[@id='overview']/section/div/div[1]/div[2]")).click();

    }

}

