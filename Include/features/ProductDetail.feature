@Login

Feature: Product Detail

	@AccessProductDetailFromHomeProductList
	Scenario: User want to access product detail from product list
		Given User is on SecondHand web
		When User click first product card
		And User is on product detail page
		
	
	@AccessProductDetailFromMyProductList
	Scenario: User want to access product detail from his own product list
		Given User is on SecondHand web
		When User click MASUK button
		And User is on login page
		And User input "erlangga@mailinator.com" into the EMAIL field
		And User input "Test1234" into the PASSWORD field
		And User clik LOGIN button
		Then User is on SecondHand web
		And User click MY PRODUCT LIST button
		And User is on my product list page
		And User click my first product
		Then User is on product detail page
	