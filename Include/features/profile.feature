@Profile
Feature: Profile

  @canEditAndSaveAccountProfile
  Scenario: User want to update profile and fill all profile field with valid data
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    And User is on SecondHand web
    And User click Image field and select image file to upload
    And User input "Erlangga" into the NamaProfile field
    And User select "Jogja" into the PilihKotaProfile field
    And User input "Jl. Kaliurang" into the AlamatProfile field
    And User input "+628123456789" into the No HandphoneProfile field
    And User click on SimpanProfile button
    Then User click KELUAR button
