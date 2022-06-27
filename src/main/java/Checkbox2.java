import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        if(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected())
            System.out.println("true");
        else
            System.out.println("false");

        //Count the number of checkboxes

        List<WebElement> checkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println(checkBox.size());


    }
}
