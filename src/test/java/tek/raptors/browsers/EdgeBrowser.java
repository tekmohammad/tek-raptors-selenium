package tek.raptors.browsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EdgeBrowser {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.quit();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get("https://facebook.com");
        firefox.quit();
    }
}
