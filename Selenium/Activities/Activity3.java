package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3
{
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        //check the title of page
        String title=driver.getTitle();
        System.out.println("Title of page "+title);

        WebElement f_name=driver.findElement(By.id("firstName"));
        WebElement l_name=driver.findElement(By.id("lastName"));


        /*WebElement email=driver.findElement(By.id("email"));
        WebElement contact=driver.findElement(By.id("number"));
        WebElement.sendKeys(email);
        WebElement.sendKeys(contact);*/
        //Enter text
        f_name.sendKeys("Indra");
        l_name.sendKeys("Jadhav");

        //Enter the email id
        driver.findElement(By.id("email")).sendKeys("test@example.com");

        //Enter the mobile number
        driver.findElement(By.id("number")).sendKeys("1234567890");

        //Click Submit by using CSS Selector
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        //close the driver
        driver.close();

    }
}
