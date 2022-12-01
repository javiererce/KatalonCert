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

WebUI.scrollToElement(findTestObject('Reto_uno/Page_ToolsQA/div_Elements_card-up'), 2)

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/div_Elements_card-up'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/span_Check Box'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/svg_Book Store API_rct-icon rct-icon-uncheck'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/svg_Book Store API_rct-icon rct-icon-expand-close'))

WebUI.scrollToElement(findTestObject('Reto_uno/Page_ToolsQA/span_Radio Button'), 2)

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/span_Radio Button'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/label_Yes'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/label_Impressive'))

WebUI.click(findTestObject('Object Repository/Reto_uno/Page_ToolsQA/div_Radio Button'))

WebUI.verifyElementVisible(findTestObject('Reto_uno/Page_ToolsQA/div_Radio Button'))

WebUI.verifyElementText(findTestObject('Reto_uno/Page_ToolsQA/div_Radio Button'), 'Radio Button')

WebUI.closeBrowser()

