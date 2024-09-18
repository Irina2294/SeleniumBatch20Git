package liveclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.chrono.ThaiBuddhistEra;

public class locatorsLive {
        public static void main(String[] args) throws InterruptedException {
//
            WebDriver driver =new ChromeDriver();
            driver.manage().window().maximize();
//        goto facebook
            driver.get("https://www.facebook.com");
//        enter email address
            WebElement emailAddress = driver.findElement(By.id("email"));
//        send the text
            emailAddress.sendKeys("moazzamsadiq94@gmail.com");
//        eneter the password
            WebElement password = driver.findElement(By.name("pass"));  // Data Type of the password variable is WebElement
            //WebElement datatype is used to be able to perform clickable actions or other with it. It is not a String
            password.sendKeys("rutherfordking123@13456hopkings");
//click on create new account\
           WebElement createNewAccountBtn= driver.findElement(By.linkText("Create new account"));
           createNewAccountBtn.click();
           // If there is not enough time for the firstname to populate add this code to extend the period after the click
            Thread.sleep(2000); //sleep for 2 secs.
           //enter the name
           WebElement newName = driver.findElement((By.name("firstname")));
            newName.sendKeys("abracadabra");
            // a Couple errors we cane face:
            //

        }
}
