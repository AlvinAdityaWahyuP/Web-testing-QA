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

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/span_Text Box'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Full Name_userName'), 'budisanidra')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail'), 'budisanidra@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Current Address_currentAddress'), 'JL mandarin no.05 Jakarta Pusat')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 'JL manndarin no.05 Jakarta Pusat')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/p_Namebudisanidra'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/p_Emailbudisanidragmail.com'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/p_Current Address JL mandarin no.05 Jakarta Pusat'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/p_Permananet Address JL manndarin no.05 Jak_c95c38'))

WebUI.closeBrowser()

