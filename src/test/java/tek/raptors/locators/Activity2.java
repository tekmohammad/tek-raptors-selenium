package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    /*
    Navigate to https://tek-retail-ui.azurewebsites.net/
    Enter keyword to search and click on search button.
    quit browser.
     */
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        By searchInputLocator = By.id("searchInput");
        WebElement searchInputElement =  driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("TV");

        By searchButtonLocator = By.id("searchBtn");
        WebElement searchButtonElement = driver.findElement(searchButtonLocator);
        searchButtonElement.click();

        Thread.sleep(10000);
        driver.quit();
    }
}
