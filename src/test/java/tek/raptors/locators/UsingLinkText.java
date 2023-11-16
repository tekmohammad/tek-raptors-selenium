package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        //navigate to Sport Link.
//        By sportLinkLocator = By.linkText("Sport");
//        WebElement element = driver.findElement(sportLinkLocator);
//        element.click();

//        By newsLinkLocator = By.linkText("A rivalry heated by history - the significance of Morocco's win over Spain");
//       WebElement element = driver.findElement(newsLinkLocator);
//       element.click();

        By newsLinkLocator = By.partialLinkText("A rivalry heated by history");
       WebElement element = driver.findElement(newsLinkLocator);
       element.click();

    }
}
