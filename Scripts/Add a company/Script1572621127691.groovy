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
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')

WebUI.setText(findTestObject('Prep Sign in/input_User ID_user_name'), 'vnimawat')

WebUI.setEncryptedText(findTestObject('Prep Sign in/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Prep Sign in/input_Password_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Add a company/b_Add Company'))

Random r1 = new Random()

int CN = r1.nextInt(1000)

WebUI.setText(findTestObject('Add a company/input_Company Name_company_name'), 'Auto' + CN)

WebUI.setText(findTestObject('Add a company/input_Contact Name_contact_name'), findTestData('Add a company').getValue(
        2, 1))

WebUI.setText(findTestObject('Add a company/input_Address 1_addr1'), findTestData('Add a company').getValue(
        3, 1))

WebUI.setText(findTestObject('Add a company/input_Address 2_addr2'), findTestData('Add a company').getValue(
        4, 1))

WebUI.setText(findTestObject('Add a company/input_City_city'), findTestData('Add a company').getValue(
        5, 1))

WebUI.selectOptionByValue(findTestObject('Add a company/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Add a company/input_State Zip_postal_code'), findTestData('Add a company').getValue(
        7, 1))

WebUI.setText(findTestObject('Add a company/input_Phone_phone'), findTestData('Add a company').getValue(
        8, 1))

WebUI.setText(findTestObject('Add a company/input_Fax_fax'), findTestData('Add a company').getValue(
        9, 1))

WebUI.setText(findTestObject('Add a company/input_EMail Address_email'), findTestData('Add a company').getValue(
        10, 1))

WebUI.selectOptionByValue(findTestObject('Add a company/select_JDEE1-BRIX-BMTFASTLLOYDSNEWSTAR'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Add a company/select_NewOld'), 'N', true)

Random u1 = new Random()

int SAUN = u1.nextInt(1000)

WebUI.setText(findTestObject('Add a company/input_SA Username_sa_user_name'),'SA_' + SAUN)

WebUI.setText(findTestObject('Add a company/input_SA Password_sa_password'), findTestData('Add a company').getValue(
        17, 1))

WebUI.click(findTestObject('Add a company/input_Active_active'))

WebUI.click(findTestObject('Add a company/input_Active_cmdSubmit'))

WebUI.verifyElementPresent(findTestObject('Add a company/b_GUID'),30)


