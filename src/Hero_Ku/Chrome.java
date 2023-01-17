package Hero_Ku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String [] args){
        String baseurl = "http://the-internet.herokuapp.com/login"; // storing baseurl
        System.setProperty("webdriver. chrome. driver", "src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver = new ChromeDriver(); //creating object of webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize windowns
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session

        String title = driver.getTitle(); // storing title
        System.out.println("Titel of the page :"+title); //printing title in the console

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url : "+url); // printing url in the console

        String source = driver.getPageSource(); //storing source
        System.out.println("Source page  : "+source); // printing source in the console

        WebElement emailField = driver.findElement(By.id("username")); //storing username field
        emailField.sendKeys("tomsmith "); // sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); // storing password field
        passwordField.sendKeys("SuperSecretPassword!"); // send keys to password field.

        //driver.close(); //closing the browser


    }
}
