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
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG5" into NAMA PRODUK field
    And User input "10000000" into HARGA PRODUK field
    And User select "Elektronik" into KATEGORI dropdown field
    And User input "Deskripsi Produk" into DESKRIPSI field
    And User input image into IMAGE field
    And User click on TERBITKAN button
    Then User is on product detail page
    And User click HOME button
    And User is on HOME page
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
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG99" into NAMA PRODUK field
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
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the offer product name "Laptop Gaming ROG99"

  @RejectOfferFromNotification
  Scenario: User want to reject offer from notification menu
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG99" into NAMA PRODUK field
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
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the offer product name "Laptop Gaming ROG99"
    And User click TOLAK button
    And User verify the offer is rejected

  @AcceptOfferFromNotification
  Scenario: User want to accept offer from notification menu
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG99" into NAMA PRODUK field
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
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the offer product name "Laptop Gaming ROG99"
    And User click TERIMA button
    And User verify the offer is accepted

  @UpdateOfferFromNotificationToSold
  Scenario: User want to update offer status to sold
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG99" into NAMA PRODUK field
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
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the offer product name "Laptop Gaming ROG99"
    And User click TERIMA button
    And User verify the offer is accepted
    Then User click STATUS button
    And User click BERHASIL TERJUAL radio button
    And User click update offer status button
    And User verify the product offer status is updated

  @UpdateOfferFromNotificationToCancelled
  Scenario: User want to update offer status to cancelled
    Given User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click on JUAL button
    And User input "Laptop Gaming ROG99" into NAMA PRODUK field
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
    And User click HOME button
    And User is on HOME page
    And User cick PROFILE button
    And User click KELUAR button
    Then User is on SecondHand web
    When User click MASUK button
    And User is on login page
    And User input "erlangga@mailinator.com" into the EMAIL field
    And User input "Test1234" into the PASSWORD field
    And User clik LOGIN button
    Then User is on HOME page
    And User click NOTIFICATION button
    And User click the first notification
    And User verify the offer product name "Laptop Gaming ROG99"
    And User click TERIMA button
    And User verify the offer is accepted
    Then User click STATUS button
    And User click BATALKAN TRANSAKSI radio button
    And User click update offer status button
    And User verify the product offer status is updated
