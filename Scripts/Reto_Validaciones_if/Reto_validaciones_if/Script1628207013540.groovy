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

WebUI.waitForPageLoad(5)

WebUI.scrollToElement(findTestObject('Reto_Validaciones_if/Page_ToolsQA/button_Submit'), 2)

WebUI.waitForElementClickable(findTestObject('Reto_Validaciones_if/Page_ToolsQA/button_Submit'), 2)

WebUI.click(findTestObject('Object Repository/Reto_Validaciones_if/Page_ToolsQA/button_Submit'))

WebUI.scrollToPosition(0, 50)

Nombre = WebUI.waitForImagePresent(findTestObject('Reto_Validaciones_if/Extras/Page_ToolsQA/input_Name_firstName'), 2)

print(Nombre)

Apellidos = WebUI.waitForImagePresent(findTestObject('Reto_Validaciones_if/Extras/Page_ToolsQA/input_Name_lastName'), 2)

print(Apellidos)

if (Nombre == false) {
    WebUI.setText(findTestObject('Reto_Validaciones_if/Extra2/Page_ToolsQA/input_Name_firstName'), 'Pedro')

    WebUI.delay(2)
}

if (Apellidos == false) {
    WebUI.setText(findTestObject('Reto_Validaciones_if/Extra2/Page_ToolsQA/input_Name_lastName'), 'Perez')

    WebUI.delay(2)
}

WebUI.closeBrowser()

