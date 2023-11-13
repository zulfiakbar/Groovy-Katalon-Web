@Login

Feature: Login

	@LoginWithRegisteredUser
	Scenario: User login with registered user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga@mailinator.com" into the EMAIL field
		And User input "Test1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on SecondHand web
		And User cick PROFILE button
		And User click KELUAR button
		
	@LoginWithUnregisteredEmailUser
	Scenario: User login with unregistered email user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga23@mailinator.com" into the EMAIL field
		And User input "Test1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on login page
		And User close browser
		
	@LoginWithBlankEmail
	Scenario: User login with unregistered email user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "" into the EMAIL field
		And User input "Test1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on login page
		
	@LoginWithBlankPassword
	Scenario: User login with unregistered email user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga@mailinator.com" into the EMAIL field
		And User input "" into the PASSWORD field
		And User clik LOGIN button
		Then User is on login page
		
	@LoginWithWrongPassword
	Scenario: User login with unregistered email user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga@mailinator.com" into the EMAIL field
		And User input "abc1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on login page
		
	@LoginWithInvalidEmailFormat
	Scenario: User login with unregistered email user
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlanggamailinator.com" into the EMAIL field
		And User input "abc1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on login page