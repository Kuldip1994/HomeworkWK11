package Hero_Ku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) { //main method

        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver. msedge. driver", "src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver();// creating object of webdriver
        driver.get(baseurl); //method invoke url
        driver.manage().window().maximize(); // maximize windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //time out session

        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page : " + title); // printing title in the console page.

        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current url : " + url); // printing url in the console page.

        String source = driver.getPageSource(); //storing page source
        System.out.println("Page source : " + source); // printing source in the console page.

        WebElement emailField = driver.findElement(By.id("username")); //storing username field
        emailField.sendKeys("tomsmith "); //sending key to email id field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("SuperSecretPassword!");// sending key to password field
        driver.close(); // closing the browser


    }

}
