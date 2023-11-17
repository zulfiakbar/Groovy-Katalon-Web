@BuyProduct
Feature: Buy Product

  @BuyProductWithValidInput @BuyProductPositive
  Scenario: User buy product with valid input
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    Then User is on sell product page
    And User input "Laptop Gaming ROG" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then User is on product detail page
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "buyerteam1@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click first product card
    Then User is on product detail page
    And User click on Saya tertarik dan ingin nego button
    And User input "50000" into Harga Tawar field
    And User click on KIRIM button
    Then User verify Saya tertarik dan ingin nego button state is changed to Menunggu respon penjual

  @BuyProductAsGuest @BuyProductNegative
  Scenario: User buy product as guest user
    Given User is on SecondHand web
    When User click first product card
    Then User is on product detail page
    And User click on Saya tertarik dan ingin nego button
    And User input "50000" into Harga Tawar field
    And User click on KIRIM button
    And User is on login page
    Then User verify alert login to continue show up

  @BuyProductWithIncompleteProfileData @BuyProductNegative
  Scenario: User buy product with incomplete profile data user
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "logfgcgh@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click first product card
    Then User is on product detail page
    And User click on Saya tertarik dan ingin nego button
    And User input "50000" into Harga Tawar field
    And User click on KIRIM button
    Then User is on update profile page
