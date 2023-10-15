import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    @Test
    public void table() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.id("customers"));
        Table table = new Table(tableElement, driver);
        System.out.println("Rows number is: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2, 3));
        System.out.println(table.getValueFromCell(4, 1));
        System.out.println(table.getValueFromCell(4, "Company"));
        System.out.println(table.getValueFromCell(1, "Country"));
        System.out.println(table.getValueFromCell(2, "Contact"));
    }
}