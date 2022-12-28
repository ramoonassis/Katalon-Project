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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Make_AppointmentBotao'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/Input_Usuario'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Input_Usuario'), 'John Doe')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Input_Senha'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Input_Senha'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Botao_login'))

WebUI.verifyTextPresent('Make Appointment', true)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Facility Tab'))

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/Facility Tab'), 'Tokyo CURA Healthcare Center', false)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Apply Readmission Tag'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/None Input 3'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/Date Input'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Date Input'), '11/06/2023')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Book Appointment Button'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.closeBrowser()

