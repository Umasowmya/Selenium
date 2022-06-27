import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowActivities {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
        driver.navigate().back();

    }
}
