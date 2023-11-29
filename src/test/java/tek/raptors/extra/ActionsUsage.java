package tek.raptors.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsUsage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");

        //driver.findElement(By.linkText("Sign in")).click();
        Actions actions = new Actions(driver);
//        WebElement buttonElement = driver.findElement(By.linkText("Sign in"));
//        actions.click(buttonElement).perform();

       WebElement element  = driver.findElement(
               By.xpath("//div[@id='topRatedProducts']/div/div[1]"));
       actions.moveToElement(element).perform();

       actions.click(element).perform();
    }
}
