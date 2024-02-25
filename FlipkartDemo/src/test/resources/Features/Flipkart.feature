Feature: Flipkart Filter and Add to Cart Functionality


  Scenario: Filter and add a product to the cart on Flipkart
    Given User is on Flipkart homepage
    When User clicks on Fashion and selects Mens Top Wear
    And User filters products by Average customer review of four stars and Up
    And User selects Allen Solley in Brands
    And User counts the number of results in the first page
    And User clicks on the second product and add it to Cart "Added to Cart"
    #Then User validates that the number on the Cart is increased by "1"
    Then User proceed to buy the item