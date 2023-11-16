@BuyProduct

Feature: Buy Product

	@BuyProductWithValidInput
	Scenario: User buy product with valid input
	Given User is on SecondHand web
	When User click MASUK button
	And User is on login page
	And User input "erlangga@mailinator.com" into the EMAIL field
	And User input "Test1234" into the PASSWORD field
	And User clik LOGIN button
	Then User is on HOME page
	And User click first product card
	Then User is on product detail page
	And User click on Saya tertarik dan ingin nego button
	And User input "50000" into Harga Tawar field
	And User click on KIRIM button
	Then User verify Saya tertarik dan ingin nego button state is changed to Menunggu respon penjual