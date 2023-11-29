package tek.raptors.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PrepWindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        String currentSession = driver.getWindowHandle();
        System.out.println(currentSession);
        driver.findElement(By.linkText("Test Selenium")).click();

//        for (String tabs : driver.getWindowHandles()) {
//            if (!tabs.equalsIgnoreCase(currentSession)) {
//                System.out.println(tabs);
//                driver.switchTo().window(tabs);
//            }
//        }

        driver.findElement(By.linkText("Inputs")).click();

    }
}
