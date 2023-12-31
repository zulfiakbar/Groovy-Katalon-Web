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



class SellProduct {

	@And("User is on HOME page")
	public void user_is_on_home_page() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/card_Produk01'))
	}

	@And("User click on JUAL button")
	public void user_click_jual_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_Jual'))
	}

	@Then("User is on sell product page")
	public void user_is_on_sellProduct_page() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/txt_NamaProduk'))
	}

	@And("User input {string} into NAMA PRODUK field")
	public void user_input_namaProduk_into_the_namaProduk_field(String namaProduk) {
		WebUI.setText(findTestObject('Page_SellProduct/inputfield_NamaProduk'), namaProduk)
	}

	@And("User input {string} into HARGA PRODUK field")
	public void user_input_hargaProduk_into_the_hargaProduk_field(String hargaProduk) {
		WebUI.setText(findTestObject('Page_SellProduct/inputfield_HargaProduk'), hargaProduk)
	}

	@And("User select {string} into KATEGORI dropdown field")
	public void user_select_kategoriProduk_into_the_kategoriProduk_field(String kategoriProduk) {
		WebUI.selectOptionByLabel(findTestObject('Page_SellProduct/inputfield_KategoriProduk'), kategoriProduk, false)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Page_SellProduct/inputfield_KategoriProduk'), kategoriProduk, false, 5)
	}

	@And("User input {string} into DESKRIPSI field")
	public void user_input_deskripsiProduk_into_the_deskripsiProduk_field(String deskripsiProduk) {
		WebUI.setText(findTestObject('Page_SellProduct/inputfield_DeskripsiProduk'), deskripsiProduk)
	}

	@And("User input image into IMAGE field")
	public void user_input_imageProduk_into_the_imageProduk_field() {
		WebUI.uploadFile(findTestObject('Page_SellProduct/inputfield_ImageProduk'), System.getProperty('user.dir') + '\\Asset\\Image\\rog.png')
	}

	@And("User input multiple image into IMAGE field")
	public void user_input_multiple_imageProduk_into_the_imageProduk_field() {
		String path1 = System.getProperty('user.dir') + '\\Asset\\Image\\rog.png'; String path2 = System.getProperty('user.dir') + '\\Asset\\Image\\msi.png'; String finalPath = path1 + "\n" + path2;
		WebUI.uploadFile(findTestObject('Page_SellProduct/inputfield_ImageProduk'), finalPath)
	}

	@Then("User is on update profile page")
	public void user_is_on_updateProfile_page() {
		WebUI.verifyElementVisible(findTestObject('Page_Profile/inputfield_NamaProfile'))
	}

	@And("User click on TERBITKAN button")
	public void user_click_terbitkan_button() {
		WebUI.click(findTestObject('Page_SellProduct/button_Terbitkan'))
	}

	@Then("User redirected to preview product page")
	public void user_is_redirected_to_previewProduct_page() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/section_PreviewProduct'))
	}

	@And("User click on PREVIEW button")
	public void user_click_preview_button() {
		WebUI.click(findTestObject('Page_SellProduct/button_Preview'))
	}

	@And("User click on TERBITKAN button on Preview Page")
	public void user_click_terbitkanProductPreview_button() {
		WebUI.click(findTestObject('Page_SellProduct/button_TerbitkanProductPreview'))
	}

	@Then("Alert name cant be blank show up")
	public void alert_name_cant_be_blank_showup() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/txt_AlertName'))
	}

	@Then("Alert price cant be blank show up")
	public void alert_price_cant_be_blank_showup() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/txt_AlertPrice'))
	}

	@Then("Alert category cant be blank show up")
	public void alert_category_cant_be_blank_showup() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/txt_AlertCategory'))
	}

	@Then("Alert description cant be blank show up")
	public void alert_description_cant_be_blank_showup() {
		WebUI.verifyElementVisible(findTestObject('Page_SellProduct/txt_AlertDescription'))
	}
	
	@Then("User verify alert login to continue show up")
	public void alert_login_to_continue_showup() {
		WebUI.verifyElementVisible(findTestObject('Page_Login/txt_AlertLogin'))
	}
	
}