package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingTagName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By linksLocator = By.tagName("a");
        List<WebElement> linkElements = driver.findElements(linksLocator);

        System.out.println("Number of Links " + linkElements.size());

        for(WebElement link : linkElements) {
            System.out.println(link.getText());
        }
    }
}
