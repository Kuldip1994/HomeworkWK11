package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {

    static String browser = "Edge"; //static variable
    static String baseurl = "https://www.saucedemo.com/"; //static variable
    static WebDriver driver; //static variable

    public static void main(String[] args) { //main method
        if (browser.equalsIgnoreCase("Edge")) { // if statement and ignoring lowercase
            System.setProperty("webdriver.msedge.driver", "src/drivers/msedgedriver.exe");//setting webdriver
            driver = new EdgeDriver(); //creating objecting of webdriver
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdrive.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.firebox.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {//if none of the above print not valid
            System.out.println("not valid browser ");
        }
        driver.get(baseurl);// method to invoke  url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title = driver.getTitle();// storing title
        System.out.println("Title of the page :" + title); //printing title in the console

        String source = driver.getPageSource(); //to print source
        System.out.println("page source " + source); //

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("current url : " + url); // printing url in the console

        WebElement emailField = driver.findElement(By.id("user-name")); //storing email field
        emailField.sendKeys("standard_user"); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("secret_sauce"); // sending key to password field
        //driver.close();// closing driver

    }
}
