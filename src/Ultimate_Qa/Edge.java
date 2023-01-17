package Ultimate_Qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) { //main method
        String baseurl = "https://courses.ultimateqa.com/users/sign_in"; //storing base url
        System.setProperty("webdriver . msedge.driver ", "src/drivers/msedgedriver.exe"); //setting web driver
        WebDriver driver = new EdgeDriver();// creating object of webdriver
        driver.get(baseurl); // method invoke url
        driver.manage().window().maximize(); //maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing tittle
        System.out.println("Titel of the page :" + title); // printing title in the page

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current url : " + url);// printing url in the console

        String source = driver.getPageSource(); //storing url
        System.out.println("Page source :" + source); // printing page source in the console

        WebElement emailField = driver.findElement(By.id("user[email]")); //storing email field
        emailField.sendKeys("kkkk@gmail.com"); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("user[password]")); // storing password filed
        passwordField.sendKeys("Password1"); //sending key to password field
        driver.close(); // closing browser


    }
}
