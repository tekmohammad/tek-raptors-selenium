package tek.raptors.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity01 {
    // Navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
    //Select value from any of those dropdowns
    //Apply Implicit and explicit waits to your elements.
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        By programmingDDLocator= By.cssSelector("select#programmingLanguageSelect");
        WebElement programSelect = wait.until(
                ExpectedConditions.visibilityOfElementLocated(programmingDDLocator));
        Select select = new Select(programSelect);
        select.selectByVisibleText("Java");

        //Handling multiple Element with Wait.
       By optionsLocator = By.cssSelector("select#programmingLanguageSelect option");
      List<WebElement> optionsElement = wait.until(
              ExpectedConditions.visibilityOfAllElementsLocatedBy(optionsLocator));

      for (WebElement element : optionsElement) {
          System.out.println(element.getText());
      }


    }

}
