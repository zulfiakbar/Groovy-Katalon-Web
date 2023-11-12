@PRL
Feature: productList

  @PRL001
  Scenario: User want to see next product list page
    Given the user is on the Home page
    When User scroll down
    And User click on NEXT button
    Then User see the product

  @PRL002
  Scenario: User want to see previous product list page
    Given the user is on the Home page two
    When User scroll down
    And User click on PREVIOUS button
    Then User see the product

  @PRL003
  Scenario: User want to see previous product list when user on first page of product list and can't click previous page button
    Given the user is on the Home page
    When User scroll down
    When User see previous button is disabled
    Then can't click previous button

  @PRL004
  Scenario: User want to see previous product list page
    Given the user is on the Home page
    When User scroll down
    And User click click on HOBI button in TELUSURI KATEGORI section
    Then Verify that product list is shown based HOBI categories
