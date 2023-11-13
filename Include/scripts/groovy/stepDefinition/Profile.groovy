package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
<<<<<<< HEAD

=======
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
>>>>>>> 2cb7c0148683670c150947481ec77637e35c6cf0

class Profile {


	<<<<<<< HEAD

	@When("User click Image field and select image file to upload")
	public void user_click_Image_field_and_select_image_file_to_upload() {
	}

	@When("User input {string} into the NamaProfile field")
	public void user_input_into_the_NamaProfile_field(String string) {
	}

	@When("User select {string} into the PilihKotaProfile field")
	public void user_select_into_the_PilihKotaProfile_field(String string) {
	}

	@When("User input {string} into the AlamatProfile field")
	public void user_input_into_the_AlamatProfile_field(String string) {
	}

	@When("User input {string} into the No HandphoneProfile field")
	public void user_input_into_the_No_HandphoneProfile_field(String string) {
	}

	@When("User click on SimpanProfile button")
	public void user_click_on_SimpanProfile_button() {
	}
	=======

	@When("User click Image field and select image file to upload")
	public void user_click_Image_field_and_select_image_file_to_upload() {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User input {string} into the NamaProfile field")
	public void user_input_into_the_NamaProfile_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User select {string} into the PilihKotaProfile field")
	public void user_select_into_the_PilihKotaProfile_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User input {string} into the AlamatProfile field")
	public void user_input_into_the_AlamatProfile_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User input {string} into the No HandphoneProfile field")
	public void user_input_into_the_No_HandphoneProfile_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User click on SimpanProfile button")
	public void user_click_on_SimpanProfile_button() {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}
}
>>>>>>> 2cb7c0148683670c150947481ec77637e35c6cf0
