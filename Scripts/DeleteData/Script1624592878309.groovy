import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to pdocrud site'
WebUI.openBrowser(GlobalVariable.URL)

'Maximize current browser window'
WebUI.maximizeWindow()

'Type Cibiru in Search Box'
WebUI.setText(findTestObject('PDOCrud/HomePage/Element_search_box'), 'Cibiru')

'Click button Go'
WebUI.click(findTestObject('PDOCrud/HomePage/Go_button'))

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_Cibiru'), 0)

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_TestQA'), 0)

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_Jawa Barat'), 0)

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_16966'), 0)

'Click button Delete'
WebUI.click(findTestObject('PDOCrud/HomePage/Delete_button'))

'Accepting the Alert'
WebUI.acceptAlert()

'Type TestQA in Search Box'
WebUI.setText(findTestObject('PDOCrud/HomePage/Element_search_box'), 'TestQA')

'Click button Go'
WebUI.click(findTestObject('PDOCrud/HomePage/Go_button'))

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_No records found'), 0)

'Type Cibiru in Search Box'
WebUI.setText(findTestObject('PDOCrud/HomePage/Element_search_box'), 'Cibiru')

'Click button Go'
WebUI.click(findTestObject('PDOCrud/HomePage/Go_button'))

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_No records found'), 0)

WebUI.closeBrowser()