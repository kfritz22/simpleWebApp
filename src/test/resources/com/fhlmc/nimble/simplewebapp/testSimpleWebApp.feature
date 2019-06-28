Feature: Test the simple web application

Scenario: Test that the web application gives an appropriate hello message

    Given that I have loaded the simple web application
    When I view the page
    Then I see a message that says "Hello!"

