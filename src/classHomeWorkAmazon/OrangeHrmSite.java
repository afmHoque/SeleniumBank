package classHomeWorkAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmSite {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/SeleniumBank/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();


            Thread.sleep(5000);
            driver.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin"); // Login panel
            driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin123"); // Enter valid password
            driver.findElement(By.cssSelector("input[name=Submit]")).click(); // click on LOGIN button

            // Personal Details Pull name

            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#menu_pim_viewMyDetails")).click(); // click on my "My Info"

            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#btnSave")).click();

            driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']")).clear();

            // Personal Details

            driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']")).sendKeys("Afm");  //  first name

            driver.findElement(By.cssSelector("#personal_txtEmpMiddleName")).sendKeys("M"); // middle name

            driver.findElement(By.cssSelector("#personal_txtEmpLastName")).clear();  // clear

            driver.findElement(By.cssSelector("#personal_txtEmpLastName")).sendKeys("Hoque"); // last name

            driver.findElement(By.cssSelector("input[id=personal_txtEmployeeId]")).clear();  // clear

            driver.findElement(By.cssSelector("input[id=personal_txtEmployeeId]")).sendKeys("13070"); // Employee Id

            driver.findElement(By.cssSelector("input[id=personal_txtOtherID]")).clear();  // clear
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[id=personal_txtOtherID]")).sendKeys("0117");  // Other Id


            driver.findElement(By.cssSelector("input[id=personal_txtLicenNo]")).sendKeys("01234567"); // Driver's License Number

            driver.findElement(By.cssSelector("input[id=personal_txtLicExpDate]")).click(); // License Expiry Date

            driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month")).click(); //  License Expiry Date

            Thread.sleep(3000);

            driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year")).click(); // License Expiry Date

            //License Expiry Date

            // driver.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(4) > td.ui-datepicker-current-day > a")).click();

            driver.findElement(By.cssSelector("input[id=personal_txtNICNo]")).sendKeys("070-11-0010");  // SSN Number
            driver.findElement(By.cssSelector("input[id=personal_txtSINNo]")).sendKeys("o70-11-1234"); // SIN Number

            driver.findElement(By.cssSelector("input[id=personal_optGender_1]")).click();  // Gender

            driver.findElement(By.cssSelector("#personal_cmbMarital")).click();  // Marital Status
            driver.findElement(By.cssSelector("#personal_cmbNation")).click();

            driver.findElement(By.cssSelector("input[id=personal_txtEmpNickName]")).sendKeys("Shipon"); // nick name
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();  // Smpker
            driver.findElement(By.cssSelector("#personal_txtMilitarySer")).sendKeys("No");  // Military Service



    }

}