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

WebUI.setText(findTestObject('Object Repository/Page_Prep Please Sign In/input_User ID_user_name'), 'vnimawat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prep Please Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/b_Company Search'))

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'auto')

WebUI.sendKeys(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Auto223'))

//-------------------------------

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/font_Organizations'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_00001 - Auto223 Org'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Add Organization'))

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__org_num'), '909')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__org_name'), 'org1')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__contact_name'), 'vinay')

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Parent Org_parent_org_id'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/b_Parent Org'))

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Email Address_email_address'), 'a@a.com')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_EPO Email_epo_email'), 'a@a.com')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_name'), 'vinay')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_addr1'), 'q')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_city'), 'w')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_zip'), '12341')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_email'), 'a@a.com')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__bill_to_phone'), '2342342342')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__ship_to_name'), 'vinay')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__ship_to_addr1'), 'r')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input_Street 2_ship_to_addr2'), 'r')

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__ship_to_city'), 'riving')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858_1'), 
    'USTN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858_1'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__ship_to_zip'), '43242')

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/input__cmdSubmit'))

