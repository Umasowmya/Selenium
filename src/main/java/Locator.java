import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9848657467");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();



    }
}
