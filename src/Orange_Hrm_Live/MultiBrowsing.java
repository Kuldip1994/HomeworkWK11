package Orange_Hrm_Live;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {

    static String browser = "Chrome"; //declareing static variable

    static String baseurl = "https://opensource-demo.orangehrmlive.com/"; //declaring static variable
    static WebDriver driver; //declaring static variable

    public static void main(String[] args) { //main method
        if (browser.equalsIgnoreCase("Chrome")) {// if statement and ignoring lowercase
            System.setProperty("webdriver. chrome. driver", "src/drivers/chromedriver.exe");////setting webdriver
            driver = new ChromeDriver(); ////creating objecting of webdriver
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver. firebox.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver. msedge . driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {////if none of the above print not valid
            System.out.println("not valid browser");
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

        WebElement userField = driver.findElement(By.name("username")); //storing username field
        userField.sendKeys("Admin"); // sending key to username field.
        WebElement passworldField = driver.findElement(By.name("password"));  //storing password field
        passworldField.sendKeys("admin123"); //sending key to username field.

        driver.close(); //closing the browers

    }

}

