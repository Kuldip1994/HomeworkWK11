package Ultimate_Qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {

        String baseurl = "https://courses.ultimateqa.com/users/sign_in"; //storing base url
        System.setProperty("webdriver. chrome. driver", "src/drivers/chromedriver.exe"); //setting web driver
        WebDriver driver = new ChromeDriver(); // creating object of webdriver
        driver.get(baseurl); // method to invoke url
        driver.get(baseurl);
        driver.manage().window().maximize();//maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //time out session

        String title = driver.getTitle();//storing title
        System.out.println("Titel of the page : " + title); //printing title in the console

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url : " + url);// printing url in the console

        String source = driver.getPageSource();//storing source page
        System.out.println("Source page : " + source); //printing source page in the console.


        WebElement emailField = driver.findElement(By.id("user[email]")); // storing email field
        emailField.sendKeys("kkkk@gmail.com"); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("user[password]"));// storing password field
        passwordField.sendKeys("Password1");//sending key to password field
        driver.close();//Closing browser

    }
}
