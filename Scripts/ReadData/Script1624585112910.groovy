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

'Click button View to see data'
WebUI.click(findTestObject('PDOCrud/HomePage/View_button'))

'Verify correct First name'
WebUI.verifyElementPresent(findTestObject('PDOCrud/ReadPage/Element_TestQA'), 0)

'Verify correct Last name'
WebUI.verifyElementPresent(findTestObject('PDOCrud/ReadPage/Element_Rahman'), 0)

'Verify correct State'
WebUI.verifyElementPresent(findTestObject('PDOCrud/ReadPage/Element_Jawa Barat'), 0)

'Click back button to back to home page'
WebUI.click(findTestObject('PDOCrud/ReadPage/Back_button'))

WebUI.closeBrowser()

