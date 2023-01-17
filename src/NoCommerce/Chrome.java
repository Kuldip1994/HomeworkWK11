package NoCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) { //main method
        String baseurl = "https://demo.nopcommerce.com/"; // storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting web driver
        WebDriver driver = new ChromeDriver(); // creating object of webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session

        String title = driver.getTitle(); // title of the page
        System.out.println("Title of the page : " + title); // priting title in the console.

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current Url : " + url); //printing url in the concole.

        String source = driver.getPageSource(); // storing source
        System.out.println("page source :" + source); // printing source in console

        driver.findElement(By.className("ico-login")).click(); //clicking on the login link
        WebElement emailField = driver.findElement(By.id("Email")); // storing email field
        emailField.sendKeys("kkkk@gmail.com"); // sending key to email id field.
        WebElement passwordField = driver.findElement(By.id("Password")); //Storing password field
        passwordField.sendKeys("Password"); //Send keys to password field

        //driver.close();// closing the browers

    }
}
