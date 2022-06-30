package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchBar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        WebElement search =driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


    }
}
