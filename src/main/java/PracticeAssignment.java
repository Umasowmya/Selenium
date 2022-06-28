import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import java.time.Duration;


public class PracticeAssignment {



    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

        driver.findElement(By.xpath("//a[@value='DEL']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        }

        else

        {
            Assert.assertTrue(false);
        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        for(int i=1;i<5;i++)

        {

            driver.findElement(By.id("hrefIncAdt")).click();

        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


        driver.findElement(By.cssSelector("input[value='Search']")).click();

    }



}


