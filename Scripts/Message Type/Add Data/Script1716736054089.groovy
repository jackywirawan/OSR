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

WebUI.callTestCase(findTestCase('Pages/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MenuSetup/menuOption', [('optionsetup') : 'Setup']))

WebUI.click(findTestObject('Object Repository/MenuSetup/menuOption', [('optionsetup') : 'Message Type']))

TestData newmessagetype = findTestData('Data Files/Message Type')

seqno = newmessagetype.getValue('seq', 1)
name = newmessagetype.getValue('name', 1)
remarks = newmessagetype.getValue('remarks', 1)

WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/btnNewMessageType'))

WebUI.setText(findTestObject('Object Repository/MenuSetup/Message Type/inputNewData', [('newdata') : 'SeqNo']), seqno)
WebUI.setText(findTestObject('Object Repository/MenuSetup/Message Type/inputNewData', [('newdata') : 'Name']), name)
WebUI.setText(findTestObject('Object Repository/MenuSetup/Message Type/inputNewData', [('newdata') : 'Remarks']), remarks)

WebUI.click(findTestObject('Object Repository/MenuSetup/Departement/btnSave'))

//assert name