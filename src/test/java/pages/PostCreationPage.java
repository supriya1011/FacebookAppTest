package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostCreationPage {

    WebDriver driver;
    public  PostCreationPage(WebDriver driver){
        this.driver = driver;
    }

    By createPostBtn = By.xpath("//span[contains(text(),'What')]");
    By postField = By.xpath("//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']");
    By nxtButton = By.xpath("div[aria-label='Next'] div[class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt']");
    By postButton = By.xpath("//body/div[@id='mount_0_0_5K']/div/div[@class='html-div xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x17hbii1 xgs3av9 x13ywhbb x1u5rh7q x78zum5 xdt5ytf x1iyjqo2']/div/div[@class='x9f619 x1n2onr6 x1ja2u2z']/div/div/div[@class='__fb-dark-mode x17hbii1 xgs3av9 x13ywhbb x1u5rh7q x1n2onr6 xzkaem6']/div[@class='x9f619 x1n2onr6 x1ja2u2z']/div[@class='x78zum5 xdt5ytf xippug5 xg6iff7 x1n2onr6']/div[@class='x1uvtmcs x4k7w5x x1h91t0o x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1n2onr6 x1qrby5j x1jfb8zj']/div[@class='__fb-dark-mode x1qjc9v5 x9f619 x78zum5 xdt5ytf xl56j7k x1c4vz4f xg6iff7']/div[@class='x1cy8zhl x9f619 x78zum5 xl56j7k xeuugli x47corl x1x97wu9 xbr3nou xurb0ha x1sxyh0 x3v4vwv x1dzdb2q x1xoerdy']/div[@role='dialog']/form[@method='POST']/div[@class='xt7dq6l x1a2a7pz x6ikm8r x10wlt62 x1n2onr6 x14atkfc']/div[@class='x9f619 x1ja2u2z x1k90msu x6o7n8i x1qfuztq x17qophe x10l6tqk x13vifvy x1hc1fzr x71s49j']/div[@class='x1uvtmcs x4k7w5x x1h91t0o x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1n2onr6 x1qrby5j x1jfb8zj']/div/div/div[@class='xod5an3 xktsk01 x1d52u69 x14vqqas']/div[@aria-label='Post']/div[1]");

    public void createPost(String message){
        driver.findElement(createPostBtn).click();
        driver.findElement(postField).sendKeys(message);
        driver.findElement(nxtButton).click();
    }
}
