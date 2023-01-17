package NoCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {

    public static void main(String[] args) { // main method

        String baseurl = "https://demo.nopcommerce.com/"; // storing base url
        System.setProperty("webdriver.msedge.driver", "src/drivers/msedgedriver.exe"); // Setting web driver
        WebDriver driver = new EdgeDriver(); // creating object of the web driver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize windowns
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // time out session.

        String title = driver.getTitle(); // storing title
        System.out.println("Titel of the page : " + title); //printing title in the console

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current url  :" + url); //printing url in the console.

        String source = driver.getPageSource(); //storing source
        System.out.println("Page source : " + source); // printing source in the console.

        driver.findElement(By.className("ico-login")).click(); // clicking on the login in link
        WebElement emailField = driver.findElement(By.id("Email")); //storing email field
        emailField.sendKeys("kkkk@gmail.com"); // sending key to email id field.
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField.sendKeys("Password"); // send key to password field

        driver.close(); // closing the browers

    }
}
