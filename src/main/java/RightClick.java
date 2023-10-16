
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Electronics']"));
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        //actions.dragAndDrop(element, link).build().perform();  erajin elementov te inch piti texapoxenq isk erkrordov te ur
        // actions.clickAndHold(element).moveToElement(link).release().build().perform(); click es anum elementi vra u klavish@ ches toxnum vercnum es element@ u tanum urish tex u toxnum enq click@ heto havaqum es sax irar het u dnum
    }
}
