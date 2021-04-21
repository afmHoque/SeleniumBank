package bankInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welsfargo {


    public static void main(String[] args) {


        System.setProperty ("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://Wellsfargo.com");


    }


}
