package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessagingPage {
    WebDriver driver;

    public  MessagingPage(WebDriver driver){
        this.driver = driver;
    }

    By recipientField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]");

    public void sendMessage(String recipient, String messageContent){
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[2]/span[1]/span[1]/div[1]/div[1]")).click();
        driver.findElement(recipientField).click();
    }
}
