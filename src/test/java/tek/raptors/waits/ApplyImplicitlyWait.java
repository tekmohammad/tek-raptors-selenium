package tek.raptors.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplyImplicitlyWait {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        //Apply Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("email")).sendKeys("someEmail@email.com");
        driver.findElement(By.name("password")).sendKeys("WrongPassword");

        driver.findElement(By.id("loginBtn")).click();

        String text = driver.findElement(By.cssSelector("div.error")).getText();
        System.out.println(text);
        driver.quit();
    }
}
