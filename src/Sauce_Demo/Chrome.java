package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {

        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver. chrome. driver", "src/drivers/chromedriver.exe"); //setting web driver
        WebDriver driver = new ChromeDriver(); // creating object of webdriver
        driver.get(baseurl);// method to invoke
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session.

        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page : " + title); // printing title in the console

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url ");// printing url in the console

        String source = driver.getPageSource(); // storing source page
        System.out.println("Source page  : " + source); // printing source in the console

        WebElement emailField = driver.findElement(By.id("user-name")); // storing email field
        emailField.sendKeys("standard_user");//sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("secret_sauce");//send keys to password field.
        driver.close(); // closing browser
    }
}
