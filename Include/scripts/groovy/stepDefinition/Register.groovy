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



class Register {
	@Given("User is on SecondHand Web")
	public void user_is_on_SecondHand_Web() {
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/');
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/header_BannerBulanRamadhan'))
	}

	@When("User click on button MASUK")
	public void user_click_on_button_MASUK() {
		WebUI.click(findTestObject('Page_SecondHand/button_Masuk'))
	}

	@And("User click button DAFTAR")
	public void user_click_button_DAFTAR() {
		WebUI.click(findTestObject('Page_Login/link_Daftar'))
	}

	@And("User input Name {string}")
	public void user_input_Name(String name) {
		WebUI.setText(findTestObject('Page_Register/inputfield_name'), name)
	}

	@And("User input email {string}")
	public void user_input_email(String email) {
		WebUI.setText(findTestObject('Page_Register/inputfield_email'), email)
	}

	@And("User input password {string}")
	public void user_input_password(String password) {
		WebUI.setText(findTestObject('Page_Register/inputfield_password'), password)
	}

	@And("User click on button DAFTAR")
	public void user_click_on_button_DAFTAR() {
		WebUI.click(findTestObject('Page_Register/button_DaftarRegister'))
	}

	@Then("user will be redirected to home page")
	public void user_will_be_redirected_to_home_page() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/button_Profile'))
	}
	
	@Then("user will not be redirected to other page")
	public void user_will_not_be_redirected_to_other_page() {
		WebUI.verifyElementVisible(findTestObject('Page_Register/Txt_Daftar'))
	}
}