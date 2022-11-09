
package Activities;


        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.time.Duration;

public class Activity6_1
{
    public static void main(String args[])
    {
        FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //open browser and link
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //get title of page
        String pagetitle=driver.getTitle();
        System.out.println("The title of page:- "+pagetitle);

        WebElement checkbox=driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));

        WebElement togglecheckbox= driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        //Click the toggle button
        togglecheckbox.click();

        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        //Click toggle button again
        togglecheckbox.click();

        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();

        //close browser
        driver.close();

    }
}
