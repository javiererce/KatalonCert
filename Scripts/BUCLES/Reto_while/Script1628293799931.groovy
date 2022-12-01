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

Bandera=0
while(Bandera!=1) {
	
	int num = ((Math.random() * (5-1)+1) as int)
	
	WebUI.setText(findTestObject('Object Repository/While_google/Page_Google/input__q'), '5+'+num )
	
	WebUI.sendKeys(findTestObject('Object Repository/While_google/Page_Google/input__q'), Keys.chord(Keys.ENTER))
	
	Resultado = WebUI.getText(findTestObject('While_google/Extras/Resultado_10'))
	if(Resultado=="8") {
		Bandera=1
		print("Listo termina")
		WebUI.closeBrowser()
	}
	else {
		Bandera=0
	}
	
	print(Bandera+ "------")
}
	


