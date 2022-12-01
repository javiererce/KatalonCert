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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Prueba_1/Page_ToolsQA/div_Elements_card-up'), 0)

WebUI.click(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/div_Elements_card-up'))

WebUI.click(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/span_Text Box'))

WebUI.click(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/input_Full Name_userName'))

WebUI.setText(findTestObject('Prueba_1/Page_ToolsQA/input_Full Name_userName'), 'Ljubo')

nombre = WebUI.getAttribute(findTestObject('Prueba_1/Page_ToolsQA/input_Full Name_userName'), 'value')

print(nombre)

WebUI.setText(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/input_Email_userEmail'), 'Ljubo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/textarea_Current Address_currentAddress'), 'dirección_uno')

WebUI.setText(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 'dirección dos')

WebUI.scrollToElement(findTestObject('Prueba_1/Page_ToolsQA/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Prueba_1/Page_ToolsQA/button_Submit'))

WebUI.closeBrowser()

