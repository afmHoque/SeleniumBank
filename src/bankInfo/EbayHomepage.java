package bankInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHomepage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.ebay.com/");

        String targetUrl = "https://www.ebay.com/";
        openUrl(driver,targetUrl);
        verifyHomePage(driver);

    }

    public static void verifyHomePage(WebDriver driver){

        System.out.println("Test case open Url ID: eBay 001");
        System.out.println("Test case Close Url ID: eBay 002");

        String expecetedLogo = "//*[@id=\"gh-logo\"]";
        String actualHomePageLogo = driver.getCurrentUrl();

        // =  objective
        // == primitive data type
        // equals

        // yes we did

        if(actualHomePageLogo.equals(expecetedLogo)){

            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }

    }

    public static void openUrl(WebDriver driver, String Url) {
        driver.get(Url);
        System.out.println("Open browser Successfully");
    }

    public static void closeUrl(WebDriver driver, String Url) {
        driver.close();
        System.out.println("Close browser Successfully");

    }
}
