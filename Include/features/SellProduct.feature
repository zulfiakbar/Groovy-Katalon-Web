@SellProduct

Feature: Sell Product

	@SellProductWithInputValid
	Scenario: User sell product with input valid
	Given User is on SecondHand web
	When User click MASUK button
	And User is on login page
	And User input "erlangga@mailinator.com" into the EMAIL field
	And User input "Test1234" into the PASSWORD field
	And User clik LOGIN button
	Then User is on HOME page
	And User click on JUAL button
	And User input "Laptop Gaming ROG" into NAMA PRODUK field
	And User input "10000000" into HARGA PRODUK field
	And User select "Elektronik" into KATEGORI dropdown field
	And User input "Deskripsi Produk" into DESKRIPSI field
	And User input image into IMAGE field
	And User click on TERBITKAN button