import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Cookies {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //delete cookies
        driver.manage().deleteAllCookies();

        //delete specific cookie
        driver.manage().deleteCookieNamed("asdf");

        driver.get("https://www.google.com");

        try{
            Thread.sleep(30000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("/home/umaS/Desktop/Selenium/Selenium1/src/main/resources/screenshot1.png"));

    }
}
