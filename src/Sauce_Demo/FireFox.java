package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver. firefox.driver", "src/drivers/geckodriver.exe"); //setting web driver
        WebDriver driver = new FirefoxDriver(); // creating object of web driver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize();// maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //time out session

        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); // printing title of the page in the console

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url :" + url); //printing url in the console

        String source = driver.getPageSource(); // storing source page
        System.out.println("Source page :" + source); // printing source page in the console

        WebElement emailField = driver.findElement(By.id("user-name")); //storing email field
        emailField.sendKeys("standard_user"); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("secret_sauce"); // sending key to password field
        driver.close();// closing driver
    }
}
