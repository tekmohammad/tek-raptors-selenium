package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCss {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

//        By elementLocator = By.cssSelector("body > div > div:first-child > div:nth-child(1) > div:last-child > div > div:nth-child(2) > :nth-child(2) > div:nth-child(2) > div >div > div:nth-child(1)");
        //Shorter Way
        By elementLocator =By.cssSelector("div.home__content  div.home__category:nth-child(2) div.home__category-item:first-child");
        driver.findElement(elementLocator).click();

    }

}
