Feature: Social Media Critical Functionality Test

  Scenario: Test user login, news feed loading, post creation, and messaging
    Given the user is on the login page
    When the user logs in with username "<username>" and password "<password>"
    Then the news feed should be displayed
    And the user creates a post with the message "<postMessage>"
    And the user sends a message to "<recipient>" with content "<messageContent>"