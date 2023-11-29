package tek.raptors.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/selenium/drag-drop");

        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement sourceElement = driver.findElement(
                By.xpath("//h2[text()='To do']/following-sibling::div/div/div[1]"));

        WebElement targetElement = driver.findElement(
                By.xpath("//h2[text()='In Progress']/following-sibling::div/div"));
        actions.dragAndDrop(sourceElement, targetElement)
                .perform();
    }
}
