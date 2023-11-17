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


import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import groovy.json.StringEscapeUtils
import groovy.transform.ConditionalInterrupt


class profile {
	
	@When ("User click Home Page")
	public void UserclickHomePage() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_HomePage'))
	}
	
	@Then("User click button profile")
	public void Userclickbuttonprofile() {
		WebUI.click(findTestObject('Object Repository/Page_SecondHand/button_Profile'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SecondHand/button_Profile'), 0)
	}
	
	@And("User click profile account")
	public void Userclickprofileaccount() {
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_Profile_Acoount'))
	}
	
	@And("User click image field and select image field to upload")
	public void Userclickimagefieldandselectimagefieldtoupload() {
		WebUI.uploadFile(findTestObject('Object Repository/Page_Profile/img_Profile'), System.getProperty('user.dir') + '\\Asset\\Image\\longdress (2).jpg')
	}
	
	@And("User input {string} in to Nama field")
	public void  UserinputNamaProfileintoNamafield(String NamaProfile) {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_NamaProfile'),NamaProfile )	
	}
	
	@And("User select {string} into Kota dropdown field")
		public void UserselectkategoriProdukintokotadropdownfield(String KotaProfile) {
		WebUI.click(findTestObject('Object Repository/Page_Profile/select_PilihKotaProfile'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Profile/txt_Kota'),30, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	@And("User input {string} in to Alamat field")
	public void  UserinputNamaProfileintoAlamatfield(String AlamatProfile) {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_AlamatProfile'), AlamatProfile)
	}
	
	@And("User input {string} in to No Handphone field")
	public void  UserinputNamaProfileintoNoHandphonefield(String NoHandphone) {
		WebUI.setText(findTestObject('Object Repository/Page_Profile/inputfield_No HandphoneProfile'), NoHandphone)
	}
	
	@Then("User click on Simpan Button")
	public void UserclickonSimpanButton() {
		WebUI.click(findTestObject('Object Repository/Page_Profile/button_SimpanProfile'))
	}
	
}
	