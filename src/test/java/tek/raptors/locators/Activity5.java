package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity5 {
    //Navigate to Sign in from tek retail app and print the Labels texts.
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        driver.findElement(By.linkText("Sign in")).click();

        List<WebElement> labelElements = driver.findElements(By.tagName("label"));
        System.out.println("Number of Labels " + labelElements.size());

        for (WebElement element : labelElements) {
           String text = element.getText();
            System.out.println(text);
        }

        driver.quit();
    }

}
