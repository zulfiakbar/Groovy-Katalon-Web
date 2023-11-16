package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject


import java.security.PublicKey

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import ch.qos.logback.core.joran.conditional.ElseAction
import internal.GlobalVariable

<<<<<<< HEAD
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import groovy.json.StringEscapeUtils
import groovy.transform.ConditionalInterrupt


class profile {
	@When("user click button profile")
	public void user_click_button_profile() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_Profile'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/button_Profile'), 0)
	}
	//}
	@And("user click profile account")
	public void user_click_profile_account() {
		//	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/button_Profile_Acoount_'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_Profile_Acoount'))
	}
	@And("User updates profile information")
	public void Userupdatesprofileinformation() {
		//uploadPhoto("C:\\Users\\User\\Pictures\\Camera Roll\\download (1).jpg", findTestObject('Object Repository/Page_Profile/image_Profile'))
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'), 'Lenny')
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Profile/txt_Kota'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'), 'Jalan Sawi No 12')
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'), '08227535987')
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))

	}
	@And("User updates profile without fill Name field")
	public void UserupdatesprofilewithoutfillNamefield() {
		WebUI.clearText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'))
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Profile/txt_Kota'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'), 'Jalan Sawi No 12')
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'), '08227535987')
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))
	}
	@And("User updates profile without select item in kota dropdown field")
	public void Userupdatesprofilewithoutselectiteminkotadropdownfield() {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'), 'Lenny1')
//		WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'), optionToRemove, true)
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKota'))
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'), 'Jalan Sawi No 12')
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'), '08227535987')
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))
	}
	@And("User updates profile without fill Alamat field")
	public void UserupdatesprofilewithoutfillAlamatfield() {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'), 'Lenny2')
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Profile/txt_Kota'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.clearText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'))
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'), '08227535987')
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))
	}
	@And("User updates profile without fill NoHandphone field")
	public void UserupdatesprofilewithoutfillNoHandphonefield() {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'), 'Lenny3')
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Profile/txt_Kota'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'), 'Jalan Sawi No 12')
		WebUI.clearText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'))
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))

	}
	@Then("Profile information should be updated successfully")
	public void profileInformationShouldBeUpdatedSuccessfully() {
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/txt_homepage'),0)
	}
	@Then("Profile information failed to update without name field")
	public void Profileinformationfailedtoupdatewithoutfieldname() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_HomePage'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/txt_homepage'),0)
	}
	@Then("Profile information failed to update without kota dropdown field")
	public void Profileinformationfailedtoupdatewithoutkotadropdownfield() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_HomePage'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/txt_homepage'),0)
	}
	@Then("Profile information failed to update without NoHandphone field")
	public void ProfileinformationfailedtoupdatewithoutNoHandphonefield() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_HomePage'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/txt_homepage'),0)
	}
	@Then("Profile information failed to update without Alamat field")
	public void ProfileinformationfailedtoupdatewithoutAlamatfield() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_HomePage'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile/txt_homepage'),0)
	}

}

=======

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
>>>>>>> b989f8ce38189cd5a22b77b2b551b0c59564a46e
