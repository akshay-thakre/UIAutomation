Feature: Test

  Scenario Outline: Login on the test page
    Given User navigates to <url>
#    When I enter username
#    When I enter password and click on submit
#    Then I should be logged in
    Examples:
      | url                    |
      | https://www.google.com |