package bankInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHomepage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        String Url = "https://ebay.com";
        openurl(driver,Url);
        verifyWebLogo(driver);

    }

    public static void verifyWebLogo(WebDriver driver){
        System.out.println("Test kcases Id: 001, eBay test 001");
        System.out.println("Test kcases Id: 001, eBay test 002");

        String expectedLogo = "//*[@id='gh-logo']";
        String actualHomePage = driver.getCurrentUrl();


        if(actualHomePage.equals(expectedLogo)){

            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }


    }

    public static void openurl(WebDriver driver, String url){
        driver.get(url);
        System.out.println("Open eBay browser");
    }

    public static void closeBrowser(WebDriver driver,String Url){
        driver.close();
        System.out.println("Close Browser Successfully");
    }
}