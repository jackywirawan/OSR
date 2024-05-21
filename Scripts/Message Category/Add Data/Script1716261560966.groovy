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

WebUI.click(findTestObject('Message_Category/SideBar_Setup'))

WebUI.click(findTestObject('Message_Category/SideBar_Message_Category'))

WebUI.verifyElementVisible(findTestObject('Message_Category/Button_AddNewMessageCategory'))

WebUI.click(findTestObject('Message_Category/Button_AddNewMessageCategory'))

WebUI.setText(findTestObject('Message_Category/Textfield_NameProperties'), 'Bingo')

WebUI.setText(findTestObject('Message_Category/Textfield_Properties'), 'automation testing')

WebUI.click(findTestObject('Message_Category/Button_Group'))

WebUI.setText(findTestObject('Message_Category/Textfield_SeqNo'), '1234567')

WebUI.setText(findTestObject('Message_Category/Textfield_NameProperties'), 'Bingo')

WebUI.click(findTestObject('Message_Category/Button_AddProperties'))

WebUI.setText(findTestObject('Message_Category/Textfield_seqno_detail'), '123456')

WebUI.click(findTestObject('Message_Category/dropdown_message_type'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Message_Category/dropdown_message_type'), 'Hold by Client')

