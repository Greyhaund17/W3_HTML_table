import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class New {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("https://ru.wikipedia.org/");
      driver.manage().window().maximize();
      WebElement g=driver.findElement(By.id("searchInput"));
      g.sendKeys(Keys.chord(Keys.SHIFT,"text"));
      g.sendKeys(Keys.ENTER);
    }
}