package tek.raptors.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity02 {
    //Navigate to https://dev.insurance.tekschool-students.com/
    //Click on Login
    //Enter Username values.
    //get Attribute value of username Input. and make sure is not empty
    //Click on clear form
    //get Attribute value of username Input. and make sure is empty
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By loginLocator = By.linkText("Login");
        wait.until(ExpectedConditions.elementToBeClickable(loginLocator)).click();

        By usernameLocator = By.name("username");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator))
                .sendKeys("supervisor");
       String inputFiledValue = wait.until(
               ExpectedConditions.visibilityOfElementLocated(usernameLocator))
               .getAttribute("value");
        System.out.println(inputFiledValue.isEmpty());

        By clearFormLocator = By.xpath("//button[text() ='Clear Form']");
        wait.until(ExpectedConditions.elementToBeClickable(clearFormLocator)).click();

        String inputValueAtt = wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameLocator))
                .getAttribute("value");
        System.out.println(inputValueAtt.isEmpty());
        driver.quit();
    }
}
