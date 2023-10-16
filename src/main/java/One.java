import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class One {
    @Test
    public void searchGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://vega.am/am/aowdio-video-tekhnika/herhowstatsowytsner/");
        List<WebElement> checkBoxs = driver.findElements(By.xpath("(//div[@class='mfilter-tb'])[1]//input[@type='checkbox']"));
           checkBoxs.get(3).click(); //list

        if (checkBoxs.size() == 12) System.out.println("It's ok");
        else System.out.println("Fail");
        for (WebElement checkbox : checkBoxs) {
            checkbox.click();
        }
    }
}

