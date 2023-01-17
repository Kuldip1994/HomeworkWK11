package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver. msedge.driver", "src/drivers/msedgedriver.exe"); // setting web driver
        WebDriver driver = new EdgeDriver(); // creating object for web driver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize();// maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session

        String title = driver.getTitle(); // storing titel
        System.out.println("Title of the page :" + title); // printing title in the console

        String url = driver.getCurrentUrl();//Storing url
        System.out.println("Current url : " + url);// printing url in the console

        String source = driver.getPageSource(); // storing source page
        System.out.println("Source page : " + source);//printing source page in the console

        WebElement emailField = driver.findElement(By.id("user-name")); // storing email field
        emailField.sendKeys("standard_user"); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("secret_sauce"); //send keys to password field.

        driver.close();//closing the browers

    }
}
