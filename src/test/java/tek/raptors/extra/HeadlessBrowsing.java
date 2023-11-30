package tek.raptors.extra;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowsing {
    //Headless Mode for browsers are when We don't see Graphical
    //User interface of Browser and browser open in background.
    //Selenium still can interact with headless browsers.
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Thread.sleep(2000);
        System.out.println(title);
        driver.quit();
    }

}
