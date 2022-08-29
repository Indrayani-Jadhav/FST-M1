package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CRM
{

        WebDriver driver = new FirefoxDriver();
        @BeforeMethod
        public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        }

        @Test(priority = 1)
                public void getTiteofpage()
        {
            //Get title of page
            String pagetitle = driver.getTitle();
            System.out.println("Title of page:- " + pagetitle);

            //Thread.sleep(10);
            String title="SuiteCRM";
            if(pagetitle.equals(title))
            {
                //Close browser
                System.out.println("Closing driver");
                driver.close();
                driver.quit();
            }
        }
        @Test(priority = 2)
        public void getImageText()
        {
            //Get URL of image-SuiteCRM
            WebElement linkTextLocator = driver.findElement(By.linkText("SuiteCRM"));
            System.out.println("Text in element: " + linkTextLocator.getText());

            //Link of img
            // driver.findElement(By.linkText("title")).click();
            WebElement titleImage = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/form[1]/div[1]/img"));
            System.out.println("Image URL is: "+ titleImage.getAttribute("src"));

            //Click on the image-SuiteCRM---(image having link)
            driver.findElement(By.linkText("SuiteCRM")).click();
        }
        @Test(priority = 3)
        public void getCopyrightText()
        {
            //Get Copyright Text (using id )
            WebElement copyrihttext = driver.findElement(By.id("admin_options"));
            System.out.println("Copy Right Text on Web page :-  "+copyrihttext.getText());
        }

        @Test(priority = 4)
                public void loginCRM()
        {
            WebElement username = driver.findElement(By.id("user_name"));
            WebElement username_password = driver.findElement(By.id("username_password"));
            username.sendKeys("admin");
            username_password.sendKeys("pa$$w0rd");
        /*
        optional code we can write in one line only
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.id("username_password")).sendKeys("");*/

            //Click on login
            driver.findElement(By.id("bigbutton")).click();

        /*
        //Click on login by xpath
        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click(); */

            //Login Successfully
            System.out.println("Login Successfully");
        }

        @Test(priority = 5)
        public void getcolorofNavigationMenu()
        {
            WebElement username = driver.findElement(By.id("user_name"));
            WebElement username_password = driver.findElement(By.id("username_password"));
            username.sendKeys("admin");
            username_password.sendKeys("pa$$w0rd");
        /*
        optional code we can write in one line only
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.id("username_password")).sendKeys("");*/

            //Click on login
            driver.findElement(By.id("bigbutton")).click();
            //Login Successfully
            System.out.println("Login Successfully");

            //Get color of navigation menu

            //Find the fifth header and get it's colour
            String navigationmenucolor = driver.findElement(By.xpath("//*[@id=\"toolbar\"]")).getCssValue("color");
            System.out.println("Navigation Menu colour is: " + navigationmenucolor);

        }

        @Test(priority = 6)
                public void checkActivityMenuExist()
        {
            WebElement username = driver.findElement(By.id("user_name"));
            WebElement username_password = driver.findElement(By.id("username_password"));
            username.sendKeys("admin");
            username_password.sendKeys("pa$$w0rd");
        /*
        optional code we can write in one line only
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.id("username_password")).sendKeys("");*/

            //Click on login
            driver.findElement(By.id("bigbutton")).click();
            //Login Successfully
            System.out.println("Login Successfully");

            //Checking Activitiy menu available or not

            WebElement element = driver.findElement(By.id("grouptab_3"));
            boolean status = element.isEnabled();

            System.out.println("Status is "+status);
        /*
        or
        driver.findElement(By.name("username")).isEnabled();
         */
        }

        @Test
        @AfterMethod
         public void afterMethod()
        {
            //Close the browser
            driver.quit();
         }


}
