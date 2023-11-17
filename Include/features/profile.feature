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

  @Profile1
  Scenario: User want to update profile and fill all profile field with valid data
    When User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "Erlangga" in to Nama field
    And User select "Jogja" into Kota dropdown field
    And User input "Jln Kaliurang" in to Alamat field
    And User input "+628123456789" in to No Handphone field
    Then User click on Simpan Button

  @Profile2
  Scenario: User updates profile without fill Name field
    When User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "" in to Nama field
    And User select "Jogja" into Kota dropdown field
    And User input "Jln Kaliurang" in to Alamat field
    And User input "+628123456789" in to No Handphone field
    Then User click on Simpan Button

  @Profile3
  Scenario: User updates profile without select item in Kota dropdown field
    When User click Home Page
    Then User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "Erlangga" in to Nama field
    And User select "" into Kota dropdown field
    And User input "Jln Kaliurang" in to Alamat field
    And User input "+628123456789" in to No Handphone field
    Then User click on Simpan Button

  @Profile4
  Scenario: User updates profile without  fill Alamat field
    When User click Home Page
    Then User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "Erlangga" in to Nama field
    And User select "Jogja" into Kota dropdown field
    And User input "" in to Alamat field
    And User input "+628123456789" in to No Handphone field
    Then User click on Simpan Button

  @Profile5
  Scenario: User updates profile without  fill NoHandphone field
    When User click Home Page
    Then User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "Erlangga" in to Nama field
    And User select "Jogja" into Kota dropdown field
    And User input "Jln Kaliurang" in to Alamat field
    And User input "" in to No Handphone field
    Then User click on Simpan Button

  @Profile6
  Scenario: User updates profile without upload image
    When User click Home Page
    Then User click button profile
    And User click profile account
    And User click image field and select image field to upload
    And User input "Erlangga" in to Nama field
    And User select "Jogja" into Kota dropdown field
    And User input "Jln Kaliurang" in to Alamat field
    And User input "" in to No Handphone field
    Then User click on Simpan Button
