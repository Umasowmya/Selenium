import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locator2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice");

        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


        try{
        Thread.sleep(3000);}
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello Rahul,");
        driver.findElement(By.xpath("//button[text()='Log Out']"));
        driver.close();

    }
}
