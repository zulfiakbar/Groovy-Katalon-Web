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


class Profile {



	@When("User click Image field and select image file to upload")
	public void user_click_Image_field_and_select_image_file_to_upload() {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@And("User input {string} into the NamaProfile field")
	public void user_input_into_the_NamaProfile_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();

class editProduct {
	@Given("User click Image field and select image file to upload")
	public void user_click_Image_field_and_select_image_file_to_upload() {
		WebUI.clickImage(findTestObject('Page_Profile/image_Profile'))
		
	}

	@When("User input {string} into the NamaProfile field")
	public void user_input_into_the_NamaProfile_field(String string) {
		WebUI.setText(findTestObject('Page_Profile/inputfield_NamaProfile'), NamaProfile)

	}

	@And("User select {string} into the PilihKotaProfile field")
	public void user_select_into_the_PilihKotaProfile_field(String string) {

		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();

		WebUI.setText(findTestObject('Page_Profile/select_PilihKotaProfile'), PilihKotaProfile)

class editProduct {
	@Given("User click Image field and select image file to upload")
	public void user_click_Image_field_and_select_image_file_to_upload() {
		WebUI.clickImage(findTestObject('Page_Profile/image_Profile'))
		
	}

	@When("User input {string} into the NamaProfile field")
	public void user_input_into_the_NamaProfile_field(String string) {
		WebUI.setText(findTestObject('Page_Profile/inputfield_NamaProfile'), NamaProfile)
	}

	@And("User select {string} into the PilihKotaProfile field")
	public void user_select_into_the_PilihKotaProfile_field(String string) {
		WebUI.setText(findTestObject('Page_Profile/select_PilihKotaProfile'), PilihKotaProfile)

	}

	@And("User input {string} into the AlamatProfile field")
	public void user_input_into_the_AlamatProfile_field(String string) {

		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();

		WebUI.setText(findTestObject('Page_Profile/inputfield_AlamatProfile'), AlamatProfile)

		WebUI.setText(findTestObject('Page_Profile/inputfield_AlamatProfile'), AlamatProfile)


	@And("User input {string} into the No HandphoneProfile field")
	public void user_input_into_the_No_HandphoneProfile_field(String string) {

		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();

		WebUI.setText(findTestObject('Page_Profile/inputfield_No HandphoneProfile'), No HandphoneProfile)

		WebUI.setText(findTestObject('Page_Profile/inputfield_No HandphoneProfile'), No HandphoneProfile)

	}

	@And("User click on SimpanProfile button")
	public void user_click_on_SimpanProfile_button() {


		WebUI.click(findTestObject('Page_Profile/button_SimpanProfile'))


		WebUI.click(findTestObject('Page_Profile/button_SimpanProfile'))

	}
}