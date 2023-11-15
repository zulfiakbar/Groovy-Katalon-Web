@DEL
Feature: Title of your feature
  I want to use this template for my feature file

  @DEL001
  Scenario: User want to delete product
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    And User click MY PRODUCT LIST button
		And User is on my product list page
		And User click on product card that they want to delete
		Then User is on product detail page
		And User click on DELETE button
		Then User successfully delete the product
