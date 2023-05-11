Feature: Login to Amazon
  Scenario: Login to Amazon application
    Given launch url "https://www.amazon.in/"
    When click on Sign in
    And Enter mobile number "9787291404" and password "prabha"
    Then Verify Login page Title "Amazon Sign In"
    Then login and redirect to homepage
    Then login page close driver
