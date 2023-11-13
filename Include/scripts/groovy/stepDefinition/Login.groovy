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



class login {
	@Given("User is on SecondHand web")
	public void user_is_on_secondhand_web() {
		WebUI.verifyElementVisible(findTestObject('Page_SecondHand/header_BannerBulanRamadhan'))
	}

	@When("User click MASUK button")
	public void user_click_masuk_button() {
		WebUI.click(findTestObject('Page_SecondHand/button_Masuk'))
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		WebUI.verifyElementVisible(findTestObject('Page_Login/header_SecondHandLogin'))
	}

	@And("User input {string} into the EMAIL field")
	public void user_input_email_into_the_email_field(String email) {
		WebUI.setText(findTestObject('Page_Login/inputfield_Email'), email)
	}

	@And("User input {string} into the PASSWORD field")
	public void user_input_password_into_the_password_field(String password) {
		WebUI.setText(findTestObject('Page_Login/inputfield_Password'), password)
	}

	@And("User clik LOGIN button")
	public void user_clik_login_button() {
		WebUI.click(findTestObject('Page_Login/button_MasukLogin'))
	}

	@And("User close browser")
	public void user_close_browser() {
		WebUI.closeBrowser()
	}
}