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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_Name_firstName'), 'Ljubo')

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_Name_lastName'), 'Novakovich')

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_Email_userEmail'), 'Ljubo@gmail.com')

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_(10 Digits)_userNumber'), '45345345')

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/div_20'))

WebUI.scrollToElement(findTestObject('Reto_driven2/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'), 0)

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_Subjects_subjectsInput'), 'demo uno')

WebUI.scrollToElement(findTestObject('Reto_driven2/Page_ToolsQA/Sports'), 0)

WebUI.waitForElementClickable(findTestObject('Reto_driven2/Page_ToolsQA/Sports'), 2)

WebUI.click(findTestObject('Reto_driven2/Page_ToolsQA/Sports'))

WebUI.uploadFile(findTestObject('Reto_driven2/Page_ToolsQA/Upload'), 'C:\\Users\\admin\\Katalon Studio\\Proyectos\\Proyecto_uno\\imagenes\\descarga.jpg')

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/textarea_Current Address_currentAddress'), 'Dirección uno')

WebUI.scrollToElement(findTestObject('Reto_driven2/Page_ToolsQA/svg_Select State_css-19bqh2r'), 0)

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/svg_Select State_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/div_Select City_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/div_Lucknow'))

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/input_(10 Digits)_userNumber'), '4534534544')

WebUI.scrollToElement(findTestObject('Reto_driven2/Page_ToolsQA/button_Submit'), 1)

WebUI.click(findTestObject('Object Repository/Reto_driven2/Page_ToolsQA/button_Submit'))

WebUI.closeBrowser()

