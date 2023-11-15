package tek.raptors.locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingWithGoogle {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //Let's type something in search input.
       By searchInputLocator = By.name("q");
      WebElement searchInputElement = driver.findElement(searchInputLocator);
      searchInputElement.sendKeys("Who am I");

      //Click on Search Button.
        By searchButtonLocator = By.name("btnK");
       WebElement searchButtonElement = driver.findElement(searchButtonLocator);
       searchButtonElement.click();
    }
}
