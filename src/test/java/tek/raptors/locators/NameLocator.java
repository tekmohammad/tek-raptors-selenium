package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //Locate the Element
        By searchInputLocator = By.name("q");
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("What time is it now?");
    }
}
