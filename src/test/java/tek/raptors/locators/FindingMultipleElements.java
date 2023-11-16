package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingMultipleElements {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.partialLinkText("New Account")).click();
        driver.findElement(By.id("signupBtn")).click();

        List<WebElement> errorElements = driver.findElements(By.className("error"));

        for(WebElement element : errorElements) {
            String text = element.getText();
            System.out.println(text);
        }
    }
}
