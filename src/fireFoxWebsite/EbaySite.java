package fireFoxWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySite {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver","/Users/afmhoque/IdeaProjects/SeleniumBank/driver.FirefoxDriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");


    }
}
