package classHomeWorkAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://walmart.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='global-search-dropdown-toggle']/span/img")).click(); // click on drop down list

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='searchDropdown-list']/div[3]/div[1]/button[3]")).click(); // click on baby
        driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys("baby swing"); // type on search "baby swing"
        driver.findElement(By.xpath("//*[@id='global-search-submit']/span/img")).click();
        driver.findElement(By.xpath("//*[@id='searchProductResult']/ul/li[1]/div/div[2]/div[2]/a/div/img")).click(); // click on baby swing first one

        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath("//*[@id='price']")).click();
        driver.findElement(By.xpath("//*[@id='add-on-atc-container']/div[1]/section/div[1]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='cart-root-container-content-skip']/div[1]/div/div[2]/div/div/div/div/div[3]/div/div/div[2]/div[1]/div[2]/div/button[1]/span")).click();

        driver.findElement(By.xpath("//*[@id='sign-in-email']")).sendKeys("Hoque");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[3]/div/div[4]/div/section/div/section/form/div[2]/div/div[1]/label/div[2]/div/input")).sendKeys("Hell123");
        WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[3]/div/div[1]/div/section/section/div/h1"));System.out.println(ele.getText());


  }
}
