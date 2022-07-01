package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaclickacademy.com/practice.php/");

        //count links in the page
        System.out.println(driver.findElements(By.tagName("a")).size());

        //count the links only in footer section

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());


        //count the links in column of footer

        WebElement coloumndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        //navigate to child tabs and print title of child tabs
        for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
        {

            String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);

            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
           try{ Thread.sleep(5000L);}
           catch(Exception e){e.printStackTrace();}

        }// opens all the tabs
        Set<String> abc=driver.getWindowHandles();//4
        Iterator<String> it=abc.iterator();

        while(it.hasNext())
        {

            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }

    }
}
