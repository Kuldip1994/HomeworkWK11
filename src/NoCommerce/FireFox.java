package NoCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) { //main method

        String baseurl = "https://demo.nopcommerce.com/"; //storing base url
        System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe"); // setting web driver
        WebDriver driver = new FirefoxDriver(); // creating object of webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //time out session

        String title = driver.getTitle(); //Stroing title
        System.out.println("Title of the page : " + title); //printing title in the console

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Currecnt url : " + url); // printing url in the console

        String source = driver.getPageSource(); //storing page source
        System.out.println("Page source " + source); // printing page source in the console.

        driver.findElement(By.className("ico-login")).click(); //clicking on the login link
        WebElement emailField = driver.findElement(By.id("Email")); //storing email field
        emailField.sendKeys("kkkk@gmail.com"); // Sending key to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField.sendKeys("Password"); // Send key to password field.

        driver.close(); // closing the browers
    }

}
