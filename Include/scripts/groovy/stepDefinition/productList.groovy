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
import org.openqa.selenium.Keys as Keys

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



class productList {
	@Given("the user is on the Home page")
	public void the_user_is_on_the_Home_page() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/header_BannerBulanRamadhan'))
	}

	@And("User scroll down")
	public void user_scroll_down() {
		WebUI.scrollToElement(findTestObject('Page_SecondHand/button_Next'), 1)
	}

	@And("User click on NEXT button")
	public void user_click_on_NEXT_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_Next'))
	}

	@Then("User see the product")
	public void user_see_the_product() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/header_BannerBulanRamadhan'))
	}
	@Given("the user is on the Home page two")
	public void the_user_is_on_the_Home_page_two() {
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/?page=2');
	}

	@And("User click on PREVIOUS button")
	public void user_click_on_PREVIOUS_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_Previous'))
	}

	@And("User click click on HOBI button in TELUSURI KATEGORI section")
	public void user_click_click_on_HOBI_button_in_TELUSURI_KATEGORI_section() {
		WebUI.click(findTestObject('Page_SecondHand/button_CtgHobi'))
	}

	@Then("Verify that product list is shown based HOBI categories")
	public void verify_that_product_list_is_shown_based_HOBI_caategories() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/button_CtgHobi'))
	}

	@And("User input {string} into Search field")
	public void user_input_into_Search_field(String search) {
		WebUI.setText(findTestObject('Page_SecondHand/inputfield_Cari'), search)
	}

	@And("User press ENTER on keyboard to perform search")
	public void user_press_ENTER_on_keyboard_to_perform_search() {
		WebUI.sendKeys(findTestObject('Page_SecondHand/inputfield_Cari'), Keys.chord(Keys.ENTER))
	}

	@Then("Verify that product list is shown based on LAPTOP which inputted in search field")
	public void verify_that_product_list_is_shown_based_on_LAPTOP_which_inputted_in_search_field() {
		WebUI.scrollToElement(findTestObject('Page_SecondHand/button_CtgHobi'), 1)
	}
}