import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("confirm('Are you sure');");
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
    }
}
