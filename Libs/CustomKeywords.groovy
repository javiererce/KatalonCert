
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.lang.Integer

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize



def static "com.help.OpenBro2.OpenBrowser3.Navegar"(
    	String url	
     , 	Integer t	) {
    (new com.help.OpenBro2.OpenBrowser3()).Navegar(
        	url
         , 	t)
}


def static "com.helper.browser.OpenBrowser.OpenBro"() {
    (new com.helper.browser.OpenBrowser()).OpenBro()
}


def static "com.helper.openBrowser1.AbrirNavegador.OpenNav"() {
    (new com.helper.openBrowser1.AbrirNavegador()).OpenNav()
}


def static "com.helper.openBrowser1.AbrirNavegador.OpenNav2"(
    	String url	
     , 	Integer t	) {
    (new com.helper.openBrowser1.AbrirNavegador()).OpenNav2(
        	url
         , 	t)
}


def static "com.help.Wait_Visible.Wait_Visible.Visible"() {
    (new com.help.Wait_Visible.Wait_Visible()).Visible()
}


def static "com.help.Wait_Visible.Wait_Visible.Visible_par"(
    	String url	
     , 	String texto	
     , 	Integer t	) {
    (new com.help.Wait_Visible.Wait_Visible()).Visible_par(
        	url
         , 	texto
         , 	t)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
