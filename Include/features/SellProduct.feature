@SellProduct
Feature: Sell Product

  @SellProductWithValidInput @SellProductPositive
  Scenario: User sell product with input valid
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
    
  @SellProductAsGuest @SellProductNegative
  Scenario: User sell product as a guest user
    Given User is on SecondHand web
    When User click on JUAL button
    And User is on login page
    Then User verify alert login to continue show up

  @SellProductWithIncompleteProfileData @SellProductNegative
  Scenario: Sell product with incomplete profile data user
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "logfgcgh@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    Then User is on update profile page

  @SellProductWithValidDataAndPreview @SellProductPositive
  Scenario: User sell product with input valid and preview before publish
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
    And User click on PREVIEW button
    Then User redirected to preview product page
    And User click on TERBITKAN button on Preview Page
    Then User is on product detail page

  @SellProductWithoutInputProductName @SellProductNegative
  Scenario: User sell product without input product name
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    Then User is on sell product page
    And User input "" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then Alert name cant be blank show up

  @SellProductWithoutInputProductPrice @SellProductNegative
  Scenario: User sell product without input product price
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
    And User input "" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then Alert price cant be blank show up

  @SellProductWithoutInputProductCategory @SellProductNegative
  Scenario: User sell product without input product category
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
    And User select "Pilih Kategori" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then Alert category cant be blank show up

  @SellProductWithoutInputProductDescription @SellProductNegative
  Scenario: User sell product without input product description
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
    And User input "" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then Alert description cant be blank show up

  @SellProductWithValidInputAndMultipleImage @SellProductPositive
  Scenario: User sell product with input valid and multiple image
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    Then User is on sell product page
    And User input "Laptop Gaming" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input multiple image into IMAGE field
    And User click on TERBITKAN button
    Then User is on product detail page
