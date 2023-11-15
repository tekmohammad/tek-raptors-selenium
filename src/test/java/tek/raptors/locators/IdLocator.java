package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        //Locate the Element.
        By searchInputLocator = By.id("APjFqb");
        //ask Selenium to find Located Element.
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        //Ask Selenium to perform action on the Element.
        searchInputElement.sendKeys("Tekschool");
    }
}
