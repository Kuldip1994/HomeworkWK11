package Ultimate_Qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) { //main method
        String baseurl = "https://courses.ultimateqa.com/users/sign_in"; //storing base url
        System.setProperty("webdriver. firebox. chrome", "src/drivers/geckodriver.exe"); // setting web driver
        WebDriver driver = new FirefoxDriver(); // creating object for web driver.
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //time out session

        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page"); // printing title in the console.

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url :" + url); // printing url in the console

        String source = driver.getPageSource(); //storing source page
        System.out.println("Source page " + source); // printing source page in the console.

        WebElement emailField = driver.findElement(By.id("user[email]")); // //storing email field
        emailField.sendKeys("kkkk@gmail.com"); // sending key to email address field
        WebElement passwordField = driver.findElement(By.id("user[password]"));// storing password field
        passwordField.sendKeys("Password1");// sending key to password field.
        driver.close(); // closing the browers


    }
}
