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



class EditProduct {
	@And("User click on product card that they want to edit")
	public void user_click_on_product_card_that_they_want_to_edit() {
		WebUI.click(findTestObject('Page_EditProduct/button_EditCard'))
	}

	@And("User click on Edit button")
	public void user_click_on_Edit_button() {
		WebUI.click(findTestObject('Page_EditProduct/button_Edit'))
	}

	@Then("User successfully edit the product")
	public void user_successfully_edit_the_product() {
		WebUI.scrollToElement(findTestObject('Page_EditProduct/button_EditCard'), 0)
	}
	@And("User Edit Product information")
	public void UserEditProductinformation() {
		WebUI.setText(findTestObject('Page_EditProduct/inputfield_NamaProduk'), 'Long Dress Wanita')
		WebUI.setText(findTestObject('Page_EditProduct/inputfield_HargaProduk'), '90000000')
		WebUI.click(findTestObject('Page_EditProduct/select_KategoriProduk'))
		WebUI.waitForElementPresent(findTestObject('Page_EditProduct/txt_HargaProduk'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Page_EditProduct/inputfield_DeskripsiProduk'), 'ini deskripsi ya')
		WebUI.uploadFile(findTestObject('Page_EditProduct/img_ImageField'), System.getProperty('user.dir') + '\\Asset\\Image\\longdress (1).jpg')

	}
	@And ("User Click Terbitkan Button")
	public void UserClickButtonTerbitkan() {
		WebUI.click(findTestObject('Page_EditProduct/button_TerbitkanProduk'))
	}
}