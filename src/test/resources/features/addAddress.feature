Feature: Add Addrress page feature
  Scenario: adding the address details
    Given launch url "https://www.amazon.in/" and login using mobile number "9787291404" and password "prabha" and click on select your address
    When enter the address details name "Prabhakaran" , mobile number "9787291404" , pincode "603306" , flat no. & building "no.1,Thambiran House" , area "Thambiran Nagar" , landmark "Gayathri Store" , town "Maduranthakam"
    And verify address page title "Your Addresses"
    Then add address page close drive