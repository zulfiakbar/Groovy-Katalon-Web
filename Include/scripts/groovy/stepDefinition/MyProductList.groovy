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
import internal.GlobalVariable

public class MyProductList {
	
	@And("User is on my product list page")
	public void user_is_on_my_product_list_page() {
		WebUI.verifyElementVisible(findTestObject('Page_MyProductList/header_DaftarJualSaya'))
	}
	
	@And("User click my first product")
	public void user_click_my_first_product() {
		WebUI.scrollToElement(findTestObject('Page_MyProductList/header_HargaProduk01'), 1)
		WebUI.scrollToElement(findTestObject('Page_MyProductList/img_Produk01'), 1)
		WebUI.click(findTestObject('Page_MyProductList/header_NamaProduk01'))
	}
	
}
