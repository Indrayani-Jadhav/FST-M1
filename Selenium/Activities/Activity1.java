package Activities;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1
{
    public static void main(String[] args)
    {
        //create object of firefox driver
        FirefoxDriver driver = new FirefoxDriver();
        //open the browser and link
        driver.get("https://www.training-support.net");
        
        //closing browser
        driver.close();
    }
}
