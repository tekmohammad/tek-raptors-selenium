package tek.raptors.extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class CrossBrowsingActivity {

    //Create application and using Scanner ask the type of browser
    //chrome, firefox, edge and navigate to retail app with that browser.
    //print title.
    //quit browser at the end. think about any possible problems.
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter browser name?");
        String browser = scanner.next();

        WebDriver driver;
        switch(browser.toLowerCase()) {
            case "chrome" : driver = new ChromeDriver();
            break;
            case "firefox": driver = new FirefoxDriver();
            break;
            case "edge": driver = new EdgeDriver();
            break;
            default: throw new RuntimeException("Wrong browser");
        }

//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        } else if (browser.equalsIgnoreCase("edge")) {
//            driver = new EdgeDriver();
//        } else {
//            throw new RuntimeException("Wrong Browser type.");
//        }

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
        driver.quit();

    }
}
