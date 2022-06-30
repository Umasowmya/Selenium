package DropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("btnclosepaxoption")).click();


        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option :options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }

        }




    }
}
