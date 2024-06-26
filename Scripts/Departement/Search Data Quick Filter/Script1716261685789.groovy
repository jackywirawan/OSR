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

//WebUI.callTestCase(findTestCase('Pages/Login'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/MenuSetup/menuOption', [('optionsetup') : 'Setup']))

WebUI.click(findTestObject('Object Repository/MenuSetup/menuOption', [('optionsetup') : 'Department']))

WebUI.click(findTestObject('Object Repository/MenuSetup/Departement/filterData'))

String textfilter = 'Januar Asikin'

WebUI.setText(findTestObject('Object Repository/MenuSetup/Departement/inputFilter'), textfilter)

WebUI.sendKeys(findTestObject('MenuSetup/Departement/inputFilter'), Keys.chord(Keys.ENTER))

String textOnSearch = WebUI.getText(findTestObject('Object Repository/MenuSetup/Departement/getText(inputFilter)'))

int iterations = 6

for (int i = 2; i < iterations + 1; i++) {
	
	TestData departmentUser = findTestData('Data Files/Departement')
	
	String code = departmentUser.getValue('code', i)
	
	WebUI.click(findTestObject('Object Repository/MenuSetup/Departement/elementSearch', [('codeclick') : code]))
	
	assert textOnSearch
	
	WebUI.click(findTestObject('Object Repository/MenuSetup/Departement/btnClose'))
}

//assert (textOnSearch != null) && !(textOnSearch.isEmpty()) : 'Text on search input filter should not be null or empty'



