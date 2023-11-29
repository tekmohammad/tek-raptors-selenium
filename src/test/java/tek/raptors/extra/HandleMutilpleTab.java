package tek.raptors.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleMutilpleTab {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net");

        String mainTab = driver.getWindowHandle();

        //This link will open new tab
        driver.findElement(By.linkText("Test Selenium")).click();
        for (String tab: driver.getWindowHandles()) {
            System.out.println(tab);
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.name("text")).sendKeys("Handle new Window");
        Thread.sleep(2000);
        //Close the current Tab Only.
        driver.close();
        driver.switchTo().window(mainTab);
        driver.findElement(By.linkText("Sign in")).click();
    }
}
