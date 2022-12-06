// Program to get title and to login to training support site
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1
{
    public static void main(String[] args)
    {
        FirefoxDriver driver = new FirefoxDriver();

        //Open browser and website of training support
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));

        //Type credentials
        userName.sendKeys("admin");
        password.sendKeys("password");
        //Click Log in
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        //Print the login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        //Close the browser
        driver.close();

    }
}