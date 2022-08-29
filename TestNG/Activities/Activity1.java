package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1
{
    FirefoxDriver driver = new FirefoxDriver;
    @BeforeMethod
    public void login()
    {

        driver.get("https://www.training-support.net");

    }
        @Test
        public void ()
        {
            // Checking title of page
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            //Assertion for page title
            Assert.assertEquals("Training Support", title);

            //Find the clickable link Abou US and clicking on it
            driver.findElement(By.id("about-link")).click();

            //Checking the new page link title
            System.out.println("New page title is: " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "About Training Support");

        }

    @AfterMethod
    public void afterMethod()
    {
        //Close the browser
        driver.quit();
    }
}
