package Orange_Hrm_Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) { //main method
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //Stroing base url
        System.setProperty("webdriver.msedge.driver", "src/drivers/msedgedriver.exe"); //setting web driver
        WebDriver driver = new EdgeDriver(); // creating object of webdriver
        driver.get(baseurl); // method to invoke url.
        driver.manage().window().maximize(); //maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// timeout session

        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); // priting tittle in the console

        String url = driver.getCurrentUrl();// storing Url
        System.out.println("Current Url " + url); // printing url in the console

        String source = driver.getPageSource(); // storing source
        System.out.println("source page " + source); //printing source page in the console

        WebElement userField = driver.findElement(By.name("username")); //storing username field
        userField.sendKeys("Admin"); //sending key to user name field.
        WebElement passwordField = driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("admin123"); // send keys to password field

        driver.close(); // closing the browser


    }

}
