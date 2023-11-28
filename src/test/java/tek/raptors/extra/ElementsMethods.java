package tek.raptors.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By textInputLocator = By.id("textInput");
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(textInputLocator));
        //return true if the element displayed on web app
        //can be used for validation.
        boolean isElementDisplayed = element.isDisplayed();
        //return true if element is not disabled.
        //can be used for validate.
        boolean isElementEnabled = element.isEnabled();
        //Can be used for element of type Input it well clear current text of Input.
        //usually used before sendkeys method.
        element.clear();

        By rangeLocator = By.id("rangeInput");
        WebElement rangeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(rangeLocator));
        for (int i = 0 ; i < 10 ; i ++) {
            //SendKeys can send Keyboard keys to an Element,
            rangeElement.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
