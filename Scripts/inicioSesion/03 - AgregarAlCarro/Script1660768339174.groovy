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


String subPopupPreCarro
String textoPreCarro


if (WebUI.verifyElementPresent(findTestObject('01 - Login/Page_falabellacom  Todo lo que necesitas en_591ae0/div_Logo_Falabella'),
	2, FailureHandling.OPTIONAL)) {
	System.out.println('-> Apertura pagina Falabella OK')
}else {
	WebUI.delay(1)
	System.out.println('-> La Pagina no se ha cargado o Logo falabella fue modificado')
	WebUI.takeScreenshot(((('D:\\ProyectosAUT\\Katalon\\FalabellaAUT\\FalabellaAUT\\ScreenShot\\Portal no ha encontrado elemento Logo falabella en la apertura' +
	Dia) + '-') + Hora) + '.png')
}


if (WebUI.verifyElementPresent(findTestObject('Object Repository/02 - PopUp articulo carrito/Page_Falabella_EnvioGratis/a_GIORGIO ARMANI'),
	2, FailureHandling.OPTIONAL)) {
	textoPreCarro = WebUI.getText(findTestObject('Object Repository/02 - PopUp articulo carrito/Page_Falabella_EnvioGratis/a_GIORGIO ARMANI'))
	System.out.println(textoPreCarro)
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/button_Agregar al Carro'),
	2, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/button_Agregar al Carro'))
}
	
if (WebUI.verifyElementPresent(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/span_Popup_GIORGIO ARMANI'),
	2, FailureHandling.OPTIONAL)) {
	subPopupPreCarro = WebUI.getText(findTestObject('Object Repository/03 - AgregarAlCarro/Page_popup_agregar_carro/span_Popup_GIORGIO ARMANI'))
	System.out.println(subPopupPreCarro)
}
	
	Assert.assertEquals(textoPreCarro,subPopupPreCarro);
	
	
		
		
	
			
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	