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

WebUI.navigateToUrl('https://demoqa.com/profile')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/a_login'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_UserName_userName'), 'budisanidra')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ToolsQA/input_Password_password'), 'PQyLwWVvR2n2kJqKTORDHw==')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/li_Check Box'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Book Store API_rct-icon rct-icon-expand-close'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/path'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Home_rct-icon rct-icon-expand-close'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Home_rct-icon rct-icon-expand-close'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_You have selected'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_home'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_desktop'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_notes'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_commands'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_documents'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_workspace'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_react'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_angular'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_veu'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_office'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_public'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_private'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_classified'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_general'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_downloads'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_wordFile'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_excelFile'))

WebUI.closeBrowser()

