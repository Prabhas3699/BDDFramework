Feature: Home Page Feature
  Scenario: click on add address page
    Given launch url "https://www.amazon.in/" and login using mobile number "9787291404" and password "prabha"
    When click on select your address
    And Verify Home page Title "Your Addresses"
    Then home page close driver