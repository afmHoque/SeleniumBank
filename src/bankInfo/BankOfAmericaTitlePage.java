package bankInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaTitlePage {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");

        String targetUrl= "https://www.bankofamerica.com/";

        openUrl(driver, targetUrl);   // Open the browser and go to the target url
        verifyHomePageTitle(driver); // Verify Home page title
    }

    public static void verifyHomePageTitle(WebDriver driver){

        System.out.println("Test case ID; BankOfAmerica 001");
        System.out.println("Test case name : verify home page title");

        String expextedTitle = "data-sparta-container";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expextedTitle));{
            System.out.println("Test Passed");
        }

    }

    public static void openUrl(WebDriver driver, String Url) {
        driver.get(Url);
        System.out.println("Browser opend and went to url successfully ");

    }

    public static void closeBrowser(WebDriver driver, String Url) {
        driver.close();
        System.out.println("Browser closed Successfully ");

    }
}