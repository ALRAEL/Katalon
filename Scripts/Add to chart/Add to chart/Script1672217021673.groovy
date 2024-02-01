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

WebUI.click(findTestObject('Buy/add to chart'))

WebUI.click(findTestObject('Buy/Open Chart'))

WebUI.click(findTestObject('Buy/Check out'))

WebUI.delay(5)

WebUI.click(findTestObject('Buy/First Name'))

WebUI.setText(findTestObject('Buy/First Name'), 'AL')

WebUI.click(findTestObject('Buy/Last Name'))

WebUI.setText(findTestObject('Buy/Last Name'), 'RAIZEL')

WebUI.click(findTestObject('Buy/Postal Code'))

WebUI.setText(findTestObject('Buy/Postal Code'), '13710')

WebUI.delay(5)

WebUI.click(findTestObject('Buy/Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Buy/Finish'))

WebUI.delay(5)

WebUI.click(findTestObject('Buy/Back Home'))

WebUI.delay(10)

