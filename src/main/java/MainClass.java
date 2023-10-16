import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://en.wikipedia.org");
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)","");
        jse.executeScript("window.scrollBy(0,-1000)","");
    }
}