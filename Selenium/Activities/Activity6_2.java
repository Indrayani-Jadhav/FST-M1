package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_2
{
    public static void main(String[] args)
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");

        //get title of page

        String pagetitle= driver.getTitle();
        System.out.println("Page Title:-"+pagetitle);

        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();



        //close browser
        driver.close();


    }
}
