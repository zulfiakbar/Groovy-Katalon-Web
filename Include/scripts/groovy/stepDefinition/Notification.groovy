package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Notification {
	
	@And("User click NOTIFICATION button")
	public void user_click_notificaton_button() {
		WebUI.click(findTestObject('Page_ProductDetail/button_MyNotificationProductDetail'))
	}
	
	@And("User click the first notification")
	public void user_click_the_first_notification() {
		WebUI.click(findTestObject('Page_SecondHand/div_Notification01'))
	}
	
	@And("User verify the product name {string}")
	public void user_verify_the_product_name(String namaProduk) {
		WebUI.verifyElementText(findTestObject('Page_ProductDetail/txt_NamaProduk'), namaProduk)
	}
	
	@And("User click HOME button")
	public void user_click_home_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_HomePage'))
	}
	
	@And("User verify the offer product name {string}")
	public void user_verify_the_offer_product_name(String namaProdukNotification) {
		WebUI.verifyElementText(findTestObject('Page_Notification/header_NamaProduk01Notification'), namaProdukNotification)
	}
	
	@And("User click TOLAK button")
	public void user_click_tolak_button() {
		WebUI.click(findTestObject('Page_Notification/button_Tolak01Notification'))
	}
	
	@And("User verify the offer is rejected")
	public void User_verify_the_offer_is_rejected() {
		WebUI.verifyElementNotVisible(findTestObject('Page_Notification/button_Tolak01Notification'), FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	@And("User click TERIMA button")
	public void user_click_terima_button() {
		WebUI.click(findTestObject('Page_Notification/button_Terima01Notification'))
	}
	
	@And("User verify the offer is accepted")
	public void User_verify_the_offer_is_accepted() {
		WebUI.verifyElementVisible(findTestObject('Page_Notification/button_Status01Notification'))
	}
	
	@And("User click STATUS button")
	public void user_click_status_button() {
		WebUI.click(findTestObject('Page_Notification/button_Status01Notification'))
	}
	
	@And("User click BERHASIL TERJUAL radio button")
	public void user_click_berhasil_terjual_radio_button() {
		WebUI.click(findTestObject('Page_Notification/button_RadioBerhasilTerjual'))
	}
	
	@And("User click BATALKAN TRANSAKSI radio button")
	public void user_click_batalkan_transaksi_radio_button() {
		WebUI.click(findTestObject('Page_Notification/button_RadioBatalkanTransaksi'))
	}
	
	@And("User click update offer status button")
	public void user_click_update_offer_status_button() {
		WebUI.click(findTestObject('Page_Notification/button_UpdateStatusNotification'))
	}
	
	@And("User verify the product offer status is updated")
	public void User_verify_the_product_status_is_updated() {
		WebUI.verifyElementNotVisible(findTestObject('Page_Notification/button_Status01Notification'), FailureHandling.CONTINUE_ON_FAILURE)
	}
}
