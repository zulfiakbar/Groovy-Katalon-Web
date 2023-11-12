@Login

Feature: Login

	@LoginWithStandardUser
	Scenario: User login with standard user
		Given User is on login page
		And User input username "standard_user"
		And User input password "secret_sauce"
		And User clik button login