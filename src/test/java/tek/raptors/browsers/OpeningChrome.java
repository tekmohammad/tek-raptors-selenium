package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChrome {

    public static void main(String[] args) {
        //Create an object of a Selenium Class ChromeDriver
        ChromeDriver chrome = new ChromeDriver();
        // get() method navigating to url.
        chrome.get("https://google.com");

        //getTitle() will return the title of website.
        String title = chrome.getTitle();
        System.out.println(title);
        //Quit() method will close all the open tabs and browser.
        chrome.quit();
    }

}
