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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')

WebUI.setText(findTestObject('Page_Prep Please Sign In/input_User ID_user_name'), 'vnimawat')

WebUI.setEncryptedText(findTestObject('Page_Prep Please Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Page_Prep MH2BuildPro/b_Company Search'))

WebUI.setText(findTestObject('Page_Prep MH2BuildPro/input_Company Name_company_name'), 'vinay')

WebUI.sendKeys(findTestObject('Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Vinay Integrated Company'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/td_Templates'))



WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Add Template'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_Phase  Rank Scheduling (Standard)Tas_5a12d5'), 
    'B', true)

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Template Name_plan_name'), 'auto')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Template Number_plan_num'), '101')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Elevation_elevation'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Floors_floors'), '4')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Bedrooms_bedrooms'), '3')

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_SQFT Total_sqft_total'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_Hiligan AcHoligan 2Vinay AC SetVinay AS'), 
    '1479', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_anjanar - anjana ramesheast1div - ea_b8f3f2'), 
    '8595', true)

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Account Set_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Add Template Stage'))

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Stage Name_phase_name'), 'stage 1')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Stage Desc_phase_desc'), 'stage 1')

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Account Set_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Stage List'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Template'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Upload Tasks'))

WT = WebUI.getWindowTitle()

WebUI.switchToWindowTitle(WT)

WebUI.click(findTestObject('Object Repository/Page_/input_Upload a File_UploadedFile'))

WebUI.uploadFile(findTestObject('Object Repository/Page_/input_Upload a File_UploadedFile'), 'C:\\Test Cases.xlsx', FailureHandling.STOP_ON_FAILURE)

//WebUI.uploadFile(findTestObject('Upload File'), 'C:\\Test Cases.xlsx')
//'Capturing the file name after upload and storing it in a variable'
//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')
//'Verifying the Actual path and Expected path of file'
//WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)

