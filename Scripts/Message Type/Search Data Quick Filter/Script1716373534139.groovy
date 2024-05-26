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

int clickcolumn = 5

for (i = 1; i < clickcolumn + 1; i++) {
	
	String dataSearch = 'Hold by Client'
	
	WebUI.setText(findTestObject('Object Repository/MenuSetup/searchData'), dataSearch)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/MenuSetup/verifySearchData', [('resultSearchData') : dataSearch] ), 0)
	
	TestData filter = findTestData('Data Files/Message Type (Filter)')
	
	seq = filter.getValue('ColumnFilter', i)
	name = filter.getValue('ColumnFilter', i)
	remarks = filter.getValue('ColumnFilter', i)
	needapproval = filter.getValue('ColumnFilter', i)
	siteflag = filter.getValue('ColumnFilter', i)
	
//	String column = seq + "," + name + "," + remarks + "," + needapproval + "," + siteflag
	
	WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/columnName', [('namacolumn') : seq]))
	WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/columnName', [('namacolumn') : name]))
	WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/columnName', [('namacolumn') : remarks]))
	WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/columnName', [('namacolumn') : needapproval]))
	WebUI.click(findTestObject('Object Repository/MenuSetup/Message Type/columnName', [('namacolumn') : siteflag]))
	
	assert dataSearch
}


