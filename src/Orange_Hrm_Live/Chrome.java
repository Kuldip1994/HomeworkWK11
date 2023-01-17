package Orange_Hrm_Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) { // main method
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); //setting web driver
        WebDriver driver = new ChromeDriver(); // creating object of webdriver
        driver.get(baseurl); // method to invoke url.
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // time out secssion

        String title = driver.getTitle(); //storing title
        System.out.println("Titel of the page : " + title); // printing title in the console

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current url " + url); // priting url in the console

        String source = driver.getPageSource(); // storing source
        System.out.println("source page " + source); // printing source in the console

        //driver.findElement(By.className("oxd-input oxd-input--active")).click(); // clicking on username field
        WebElement userField = driver.findElement(By.name("username")); //storing username field
        userField.sendKeys(" Admin "); // sending key to username field
        WebElement passwordField = driver.findElement(By.name("password")); //storing password on field
        passwordField.sendKeys("admin123");
        driver.close(); // closing the browser


    }
}
