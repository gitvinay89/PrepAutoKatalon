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

WebUI.navigateToUrl('https://bp200.hyphendev.com/GenBuild_13979/login.asp')


for (def rowNum = 1 ; rowNum <= findTestData("Login Credentials").getRowNumbers() ; rowNum ++)

{
//WebUI.setText(findTestObject('BP Login/Login Page/input_User ID_user_name'), username)
WebUI.setText(findTestObject('BP Login/Login Page/input_User ID_user_name'), findTestData("Login Credentials").getValue(1,rowNum))


WebUI.setText(findTestObject('BP Login/Login Page/input_Password_password'), findTestData ("Login Credentials").getValue(2,rowNum))

Thread.sleep(3000)
}
WebUI.click(findTestObject('BP Login/Login Page/img_Password_LoginButton'))

