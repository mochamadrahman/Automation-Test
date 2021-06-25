import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to pdocrud site'
WebUI.openBrowser(GlobalVariable.URL)

'Maximize current browser window'
WebUI.maximizeWindow()

'Type TestQA in Search Box'
WebUI.setText(findTestObject('PDOCrud/HomePage/Element_search_box'), 'TestQA')

'Click button Go'
WebUI.click(findTestObject('PDOCrud/HomePage/Go_button'))

'Click Edit button to edit/update data'
WebUI.click(findTestObject('PDOCrud/HomePage/Edit_button'))

'Modify Address'
WebUI.setText(findTestObject('PDOCrud/UpdatePage/input_field_Address'), 'Cibiru')

'Modify City'
WebUI.setText(findTestObject('PDOCrud/UpdatePage/input_field_City'), 'Bandung')

'Click Save and back button'
WebUI.click(findTestObject('PDOCrud/UpdatePage/Save_and_back_button'))

'Type Cibiru in Search Box'
WebUI.setText(findTestObject('PDOCrud/HomePage/Element_search_box'), 'Cibiru')

'Click button Go'
WebUI.click(findTestObject('PDOCrud/HomePage/Go_button'))

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_Cibiru'), 0)

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_Bandung'), 0)

'Verify if the given web element presents on the DOM'
WebUI.verifyElementPresent(findTestObject('PDOCrud/HomePage/Element_TestQA'), 0)

WebUI.closeBrowser()