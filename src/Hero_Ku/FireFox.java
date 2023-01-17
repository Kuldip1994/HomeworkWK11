package Hero_Ku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) { //main method

        String baseurl = "http://the-internet.herokuapp.com/login"; // storing baseurl
        System.setProperty("webdriver. firefox. driver", "src/drivers/geckodriver.exe"); // setting webdriver
        WebDriver driver = new FirefoxDriver(); // creating objecting of webdriver
        driver.get(baseurl);// method invoke url
        driver.manage().window().maximize(); //maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); // storing title
        System.out.println("Title of this page: " + title); //printing title in the console

        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current Url : " + url); // printing current url in the console

        String source = driver.getPageSource(); // storing source page
        System.out.println("Source page : " + source);//printing source page in the console

        WebElement emailField = driver.findElement(By.id("username"));// storing email address field
        emailField.sendKeys("tomsmith "); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("SuperSecretPassword!"); // sending key to password field
        driver.close(); //closing browser

    }
}
