package tek.raptors.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity1 {
    //https://tek-retail-ui.azurewebsites.net/selenium/dropdown
    //Select from Country dropdown and language drop
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement countryElement = driver.findElement(By.id("countrySelect"));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText("United States");

        Thread.sleep(2000);
        WebElement languageElement = driver.findElement(By.id("languageSelect"));
        Select languageSelect = new Select(languageElement);
        languageSelect.selectByValue("Persian");

        Thread.sleep(3000);
        driver.quit();
    }

}
