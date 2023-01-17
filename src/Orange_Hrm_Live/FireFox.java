package Orange_Hrm_Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) { //main method

        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //Stroing base url
        System.setProperty("webdriver. firebox.driver ", "src/drivers/geckodriver.exe"); //setting web driver
        WebDriver driver = new FirefoxDriver(); // creating object of web driver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximize
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing title
        System.out.println("Titel of the page : " + title); // printing title in the console.

        String url = driver.getCurrentUrl(); //storing url.
        System.out.println("Current url : " + url); //printing url in the console

        String source = driver.getPageSource(); //storing page source
        System.out.println("Source page :" + source); // printing source page in the console

        WebElement userField = driver.findElement(By.name("username")); //storing user name field
        userField.sendKeys("Admin"); // sending key to username field.
        WebElement passworldField = driver.findElement(By.name("password"));  //storing password field
        passworldField.sendKeys("admin123"); //sending key to username field.

        driver.close(); // closing the browser


    }

}
