import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/amazon2/Page_Google/input__q'), 'amazon')

WebUI.click(findTestObject('Object Repository/amazon2/Page_Google/span_Amazon'))

WebUI.click(findTestObject('Object Repository/amazon2/Page_amazon - Google Search/h3_Amazon.in'))

WebUI.click(findTestObject('t1_objects/Page_Online Shopping site in India Shop Onl_10c5f3/a_Todays Deals'))

WebUI.click(findTestObject('Page_Amazon.in - Todays Deals/a_500 to 1,000'))

WebUI.click(findTestObject('Page_Amazon.in - Todays Deals/a_10 off or more'))

WebUI.click(findTestObject('Object Repository/amazon2/Page_Amazon.in - Todays Deals/a_and up'))

WebUI.setText(findTestObject('Object Repository/amazon2/Page_Amazon.in - Todays Deals/input_Search Amazon.in_field-keywords'), 
    'silver rings for women')

WebUI.click(findTestObject('Object Repository/amazon2/Page_Amazon.in - Todays Deals/input_Search Amazon.in_nav-search-submit-button'))

WebUI.verifyTextPresent('GIVA', true)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

