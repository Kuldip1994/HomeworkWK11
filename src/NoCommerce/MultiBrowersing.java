package NoCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowersing {
    static String browser = "Chrome"; //declaring static variable
    static String baseURL = "https://demo.nopcommerce.com/"; //declaring static variable
    static WebDriver driver; //declaring static variable

    public static void main(String[] args) { //main method
        if(browser.equalsIgnoreCase("Chrome")){ // if statement and ignoring lowercase
            System.setProperty("webdriver.chrome.drive " ,"src/drivers/chromedriver.exe"); //setting webdriver
            driver = new ChromeDriver();//creating objecting of webdriver
        } else if (browser.equalsIgnoreCase("Firefox")) { // gnoring lowercase
            System.setProperty("webdriver.firefox.drive " ,"src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.msedge.driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {//if none of the above print not valid
            System.out.println("Not valid browers");
        }
        driver.get(baseURL);// method to invoke  url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title = driver.getTitle();// storing title
        System.out.println("Title of the page :" + title); //printing title in the console

        String source =driver.getPageSource(); //to print source
        System.out.println("page source "+source); //

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("current url : " + url); // printing url in the console

        driver.findElement(By.className("ico-login")).click(); //clicking on login link
        WebElement emailField = driver.findElement(By.id("Email")); //storing email field
        emailField.sendKeys("kkkk@gmail.com"); //sending key to email id field.
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField.sendKeys("Password"); // send keys to password field

    }
}
