@Register
Feature: Register

  @REG001
  Scenario: User want to register account using valid email and password
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "logitfthgh"
    And User input email "logfgcghghv@mailinator.com"
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will be redirected to home page

  @REG002
  Scenario: User want to register account without fill "Name" field
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name ""
    And User input email "erlangga@mailinator.com"
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will not be redirected to other page

  @REG003
  Scenario: User want to register account without fill EMAIL field
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "Erlangga Baihaqi"
    And User input email ""
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will not be redirected to other page

  @REG004
  Scenario: User want to register account without fill PASSWORD field
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "Erlangga Baihaqi"
    And User input email "erlangga@mailinator.com"
    And User input password ""
    And User click on button DAFTAR
    Then user will not be redirected to other page

  @REG005
  Scenario: User want to register account with invalid email format (without @ character)
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "Erlangga Baihaqi"
    And User input email "erlanggamailinator.com"
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will not be redirected to other page

  @REG006
  Scenario: User want to register account with email that already registered
    Given User is on SecondHand Web
    When User click on button MASUK
    And User click button DAFTAR
    And User input Name "Erlangga Baihaqi"
    And User input email "erlangga@mailinator.com"
    And User input password "Test1234"
    And User click on button DAFTAR
    Then user will not be redirected to other page
