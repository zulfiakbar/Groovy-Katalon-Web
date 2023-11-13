@Login

Feature: Prduct Detail

	@AccessProductDetailFromProductList
	Scenario: User want to access product detail from product list
		Given User is on SecondHand web
		When User click first product card
		And User is on product detail page