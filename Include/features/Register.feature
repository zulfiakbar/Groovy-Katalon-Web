@REG
Feature: Register

  @tag1
  Scenario: User want to register account using valid email and password
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "Erlangga Baihaqi"
    And User input email "erlangga@mailinator.com"
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will be redirected to home page
