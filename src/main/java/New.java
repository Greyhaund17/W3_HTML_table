import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vega.am/am");
        // System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getTitle());
        WebElement dr = driver.findElement(By.xpath("(//a[@class='clearfix'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(dr).build().perform();

    }

}
