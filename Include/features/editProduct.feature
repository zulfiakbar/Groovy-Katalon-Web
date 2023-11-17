@Edit
Feature: Edit Product

  @Edit1
  Scenario: User want to edit product detail
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    And User click MY PRODUCT LIST button
    And User is on my product list page
    And User click on product card that they want to edit
    Then User is on product detail page
    And User click on Edit button
    And User Edit Product information
    And User Click Terbitkan Button
