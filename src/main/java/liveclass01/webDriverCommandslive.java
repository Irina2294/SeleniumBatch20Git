package liveclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommandslive {
    //goto the website "facebook.com"
    //print the current url
    //print the title
    public static void main(String[] args) throws InterruptedException {
        //Webdriver
        WebDriver driver=new ChromeDriver();
        //goto the url
        driver.get("https://www.facebook.com");
        //maximize the screen
        driver.manage().window().maximize();
        //print the current url
        String currentUrl=driver.getCurrentUrl();
        System.out.println("te current url of the website is: "+currentUrl);
        //print the title
        String title=driver.getTitle();
        System.out.println("the current title of the page is :" +title); // Tagname - title in html. user ctrl+F t search
        //goto google.com
        //I want to click on the back arrow key and goback to facebook.com
        //I want to refresh the facebook.com page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();
        //driver.quit -webdriver instance shuts down so everything is closing.

    }
}
