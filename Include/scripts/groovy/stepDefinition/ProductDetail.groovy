package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import internal.GlobalVariable

public class ProductDetail {

	@When("User scroll down to product list")
	public void user_scroll_down_to_product_list() {
		WebUI.clickImage(findTestObject('Page_SecondHand/img_Produk01'))
	}

	@When("User click first product card")
	public void user_click_first_product_card() {
		WebUI.scrollToElement(findTestObject('Page_SecondHand/header_HargaProduk01'), 1)
		WebUI.scrollToElement(findTestObject('Page_SecondHand/img_Produk01'), 1)
		WebUI.click(findTestObject('Page_SecondHand/header_NamaProduk01'))
	}

	@And("User is on product detail page")
	public void user_is_on_product_detail_page() {
		WebUI.verifyElementVisible(findTestObject('Page_ProductDetail/txt_NamaProduk'))
	}
	
	@And("User click MY PRODUCT LIST button")
	public void user_click_my_product_list_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_MyProductList'))
	}
	
}
