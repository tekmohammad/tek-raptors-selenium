package tek.raptors.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity2 {

    //Write a method that takes Element for Select and always select last option.
    //then in main method call your method and test it
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement programmingElement = driver.findElement(By.id("programmingLanguageSelect"));
        selectLastOption(programmingElement);

        WebElement languageElement = driver.findElement(By.id("languageSelect"));
        selectLastOption(languageElement);

        WebElement countryElement = driver.findElement(By.id("countrySelect"));
        selectLastOption(countryElement);
    }

    public static void selectLastOption(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        select.selectByIndex(options.size() -1 );
    }
    public static void selectFirstOption(WebElement element) {
        Select select = new Select(element);
        if (!select.getOptions().isEmpty())
            select.selectByIndex(0);
    }

}
