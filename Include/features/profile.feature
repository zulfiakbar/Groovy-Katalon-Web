@Profile
Feature: Profile

  @Profile
  Scenario: User is in login page and input valid email
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button

  @Profile
  Scenario: User want to update profile and fill all profile field with valid data
    When user click button profile
    And user click profile account
    And User updates profile information
    Then Profile information should be updated successfully

  @Profile1
  Scenario: User updates profile without fill Name field
    When user click button profile
    And user click profile account
    And User updates profile without fill Name field
    Then Profile information failed to update without name field

  @Profile2
  Scenario: User updates profile without select item in Kota dropdown field
  When user click button profile
  And user click profile account
  And User updates profile without select item in kota dropdown field
  Then Profile information failed to update without kota dropdown field
  
  @Profile3
  Scenario: User updates profile without  fill Alamat field
    When user click button profile
    And user click profile account
    And User updates profile without fill Alamat field
    Then Profile information failed to update without Alamat field

  @Profile
  Scenario: User updates profile without  fill NoHandphone field
    When user click button profile
    And user click profile account
    And User updates profile without fill NoHandphone field
    Then Profile information failed to update without NoHandphone field
