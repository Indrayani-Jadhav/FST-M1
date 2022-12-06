/* get title of site on the page
Left click and print the value of the side in the front.
Double click to show a random side and print the number.
Right click and print the value shown on the front of the cube.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        //Find the cude
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //Left click
        actions.click(cube).build().perform();
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());

        //Double click
        actions.doubleClick(cube).build().perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());

        //Right click
        actions.contextClick(cube).build().perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());

        //Close browser
        driver.close();
    }
}