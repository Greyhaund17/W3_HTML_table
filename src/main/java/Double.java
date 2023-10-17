import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Double {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainWindow = driver.getWindowHandle(); //glxavor window
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("(//p[@class='fc-button-label'])[1]")).click();
      //  Thread.sleep(3000);          POP UP
        System.out.println("Parent window " + mainWindow);
        driver.findElement(By.id("newWindowBtn")).click();    // gorcoxutyun glxavor wind-um
        Set<String> windowHandles = driver.getWindowHandles();  //miqani windowi het ashxatelu depqum grum enq getWindowHandles
        for (String windowHandle : windowHandles) {  // texapoxvum enq glxavoric erkrordakan
            System.out.println(windowHandle);
            if (!windowHandle.equals(mainWindow)) {   //if-@ nra hamar vor hastat imananq vor switch enq exel urish browseri vra
                driver.switchTo().window(windowHandle); //texapoxvum enq erkrord wind u grum Davo
                driver.manage().window().maximize();
                driver.findElement(By.id("firstName")).sendKeys("Davo");
                Thread.sleep(2000);
                driver.close();  //pakum enq erkror wind@
            }
        }
        driver.switchTo().window(mainWindow);  // texapoxvum enq main wind
        driver.findElement(By.id("name")).sendKeys("Ready"); //grum inchvorban
        Thread.sleep(2000);
        driver.quit();  // pakum enq amboxjovin
        // tarberutyun@ quit/close ena vor close-i shamanak pakum enq miayn bacvatc wind@ isk quit-i shamanak amboxjutyamb
    }
}
