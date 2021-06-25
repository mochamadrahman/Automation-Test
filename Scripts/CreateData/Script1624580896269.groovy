import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to pdocrud site'
WebUI.openBrowser(GlobalVariable.URL)

'Maximize current browser window'
WebUI.maximizeWindow()

'Click button Add'
WebUI.click(findTestObject('PDOCrud/HomePage/Add_button'))

'Enter Firstname'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_Firstname'), 'TestQA')

'Enter Lasttname'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_Lastname'), 'Rahman')

'Enter Address'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_Address'), 'Cikeas Gunung Putri')

'Enter City'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_City'), 'Bogor')

'Enter State'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_State'), 'Jawa Barat')

'Enter ZipCode'
WebUI.setText(findTestObject('PDOCrud/CreatePage/input_field_Zip'), '16966')

'Click Save button'
WebUI.click(findTestObject('PDOCrud/CreatePage/Save_button'))

'Verify pop up message \' Operation done successfully\' present'
WebUI.waitForElementVisible(findTestObject('PDOCrud/CreatePage/Element_Message_Operation done successfully'), 10)

'Click back button'
WebUI.click(findTestObject('PDOCrud/CreatePage/Back_button'))

WebUI.closeBrowser()

