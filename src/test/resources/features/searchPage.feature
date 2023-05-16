Feature: Search page feature

  Background:
    Given launch url "https://www.amazon.in/" and login using mobile number "9787291404" and password "prabha" and click on select your address and enter the address details name "Prabhakaran" , mobile number "9787291404" , pincode "603306" , flat no. & building "no.1,Thambiran House" , area "Thambiran Nagar" , landmark "Gayathri Store" , town "Maduranthakam"

  Scenario: searching for product
    When click on search bar and search for product "Headphones"
    And  verify search page title "Amazon.in : Headphones"
    Then search page close drive

  Scenario: searching for product and add the product to the cart
    When click on search bar and search for product "Headphones"
    And  click on product and add the product to the cart
    Then verify search page title "boAt Rockerz 558 Bluetooth Wireless Over Ear Headphones with Mic Upto 20 Hours Playback, 50MM Drivers, Soft Padded Ear Cushions and Physical Noise Isolation(Army Green) : Amazon.in: Toys & Games"
    Then search page quit drive