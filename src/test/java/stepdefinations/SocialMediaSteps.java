package stepdefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.*;

public class SocialMediaSteps {

    WebDriver driver;
    LoginPage loginPage;
    NewsFeedPage newsFeedPage;
    PostCreationPage postCreationPage;
    MessagingPage messagingPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supri\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login("8972900119", "supriyA@1083");
        newsFeedPage = new NewsFeedPage(driver);
    }
//
//    @Then("the news feed should be displayed")
//    public void the_news_feed_should_be_displayed() {
//        assert newsFeedPage.isNewsFeedDisplayed();
//    }
//    @And("the user creates a post with the message {string}")
//    public void the_user_creates_a_post_with_the_message(String postMessage) {
//        postCreationPage = new PostCreationPage(driver);
//        postCreationPage.createPost(postMessage);
//    }
//
//    @And("the user sends a message to {string} with content {string}")
//    public void the_user_sends_a_message_to_with_content(String recipient, String messageContent) {
//        messagingPage = new MessagingPage(driver);
//        messagingPage.sendMessage(recipient, messageContent);
//    }
}
