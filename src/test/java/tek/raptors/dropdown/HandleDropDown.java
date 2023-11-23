package tek.raptors.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        By programmingDropDownLocator = By.cssSelector("select#programmingLanguageSelect");
        WebElement programmingElement = driver.findElement(programmingDropDownLocator);

        //If the element tag is <select></select> then we can use Select class in Selenium to interact
        //with dropdown.
        Select programmingSelect = new Select(programmingElement);
        //Option 1) Select using visible text of Drop Down
       // programmingSelect.selectByVisibleText("C++");
        //Option 2) select using text of value attribute in option tag for drop down
       // programmingSelect.selectByValue("golang");
        //Option 3) select using index number of drop down options.
        programmingSelect.selectByIndex(4);
        Thread.sleep(3000);
        driver.quit();
    }
}
