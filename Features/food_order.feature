
Feature: Ordering the food functionality test 

  
  Scenario: A user should be able to order food in Swiggy app
  
    Given A user is on the landing page
    
    When he enters location As  Bangolore, Karnataka,India in location search box
    And he clicks Go
    And he clicks on the first restaurant on the next page
    And he add any one item of the restaurant
    And he clicks checkout button
    Then he must be able to order the food successfully
    

 