package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

       By topSectionTitleLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/h1");
       WebElement element = driver.findElement(topSectionTitleLocator);
       String title =  element.getText();
        System.out.println(title);
    }
}
