@Logout

Feature: Logout

	@LogoutWithLoggedInCondition
	Scenario: User want to log out with logged in condition
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga@mailinator.com" into the EMAIL field
		And User input "Test1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on SecondHand web after login
		And User cick PROFILE button
		And User click KELUAR button
