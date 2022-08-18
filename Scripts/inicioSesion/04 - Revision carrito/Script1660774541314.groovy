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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.junit.Assert
import org.testng.Assert;

Date Fecha = new Date()
String Dia = Fecha.format('dd_MM_yy')
String Hora = Fecha.format('hh_mm_ss')
Robot robot = new Robot();

String NumArticuloPopUp
String NumArticuloCarrito


if (WebUI.verifyElementPresent(findTestObject('Object Repository/04 - Revision carrito/Page_Revision carrito/span_CodProdPopUp'),
	2, FailureHandling.OPTIONAL)) {
NumArticuloPopUp = WebUI.getText(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/span_Popup_GIORGIO ARMANI'))
System.out.println(NumArticuloPopUp)
}
	

if (WebUI.verifyElementPresent(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/button_popup_Seguir comprando'),
	2, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/button_popup_Seguir comprando'))
	
	}
	
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/01 - Login/Page_falabellacom  Todo lo que necesitas en_591ae0/div_Logo_Falabella'),
		2, FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Object Repository/01 - Login/Page_falabellacom  Todo lo que necesitas en_591ae0/div_Logo_Falabella'))
		}
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/04 - Revision carrito/Page_Revision carrito/i_CarroCompras'),
			2, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/04 - Revision carrito/Page_Revision carrito/i_CarroCompras'))
			}
		
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/04 - Revision carrito/Page_Revision carrito/span_CodProd_Carrito'),
			2, FailureHandling.OPTIONAL)) {
			NumArticuloCarrito = WebUI.getText(findTestObject('Object Repository/04 - Revision carrito/Page_Revision carrito/span_CodProd_Carrito'))
			System.out.println(NumArticuloCarrito)
			}
		