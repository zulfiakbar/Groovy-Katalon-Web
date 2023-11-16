@Notification
Feature: Notification
  
  @CreateNewProductNotification
  Scenario: User will received notification for newly created product
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on SecondHand web after login
    And User click on JUAL button
    And User input "Laptop Gaming ROG5" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then User is on product detail page
    And User click HOME button
    And User is on SecondHand web after login
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the product name "Laptop Gaming ROG5"

  @ReceivingOfferNotification
  Scenario: User will received notification for newly offer product
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on SecondHand web after login
    And User click on JUAL button
    And User input "Laptop Gaming ROG3" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then User is on product detail page
    And User click HOME button
    And User is on SecondHand web after login
    And User cick PROFILE button
		And User click KELUAR button
		Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "buyerteam1@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on SecondHand web after login
    #menunggu offer Product
    Then User is on product detail page
    And User click HOME button
    And User is on SecondHand web after login
    And User cick PROFILE button
		And User click KELUAR button
		Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on SecondHand web after login
    And User click NOTIFICATION button
    And User click the first notification
    #menunggu notifikasi offer product
    And User verify the product name "Laptop Gaming ROG3"
