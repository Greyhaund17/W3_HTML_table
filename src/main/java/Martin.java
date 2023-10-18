import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.util.Set;

public class Martin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("newWindowsBtn")).click();
        String mainWindow = driver.getWindowHandle();
        Set<String> secondaryWind = driver.getWindowHandles();
        for (String wind : secondaryWind) {
            if (!wind.equals(mainWindow)) {
                driver.switchTo().window(wind);
                break;
            }
        }
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Davis");
        Thread.sleep(3000);
        driver.close();
      // driver.switchTo().window(mainWindow);
      // driver.findElement(By.id("firstName")).sendKeys("Hello");
        secondaryWind = driver.getWindowHandles();
        String thirdWindow = mainWindow;
        for (String wind : secondaryWind) {
            if (!wind.equals(mainWindow) && !wind.equals(thirdWindow)) {
                driver.switchTo().window(wind);
            }
        }
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("firstName")).sendKeys("olla");
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("name")).sendKeys("DO WE MADE IT?");
        Thread.sleep(3000);
        driver.quit();
    }
}
