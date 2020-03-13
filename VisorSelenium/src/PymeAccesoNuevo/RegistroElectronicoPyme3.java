package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistroElectronicoPyme3 {

	public static void main(String[] args) throws InterruptedException {
		// Declaraci�n de navegador
		ChromeOptions opts = new ChromeOptions();
				opts.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(opts);

				
			//Completar el formulario de Usuario y Contrase�a
				driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
				driver.manage().window().maximize ();
				Thread.sleep(1500);
				
			//Ingresar credenciales para completar REGISTRO ELECTR�NICO
				driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
				driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
				driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
				Thread.sleep(25000);

			//Completar el REGISTRO ELECTR�NICO - Informaci�n del producto a contratar
				driver.findElement(By.xpath("//*[text() = 'C) Informaci�n del producto a contratar']")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Tipo_de_divisa")).sendKeys("M");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Tipo_de_divisa")).sendKeys(Keys.ENTER);
				//driver.findElement(By.id("Informaci�n_del_producto_a_contratar_a_Dep�sitos_Pagos")).sendKeys("Semestral");
				//driver.findElement(By.id("Informaci�n_del_producto_a_contratar_a_Dep�sitos_Pagos")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_a_Retiros_Disposiciones")).sendKeys("Mensual");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_a_Retiros_Disposiciones")).sendKeys(Keys.ENTER);
				
				//driver.findElement(By.id("Informaci�n_del_producto_a_contratar_b_N�mero_de_Dep�sitos_Pagos")).sendKeys("500");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_b_Retiros_Disposiciones")).sendKeys("347");
				//driver.findElement(By.id("Informaci�n_del_producto_a_contratar_c_N�mero_de_Dep�sitos_Pagos")).sendKeys("269");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_c_Retiros_Disposiciones")).sendKeys("185");
				
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Procedencia_de_los_recursos_del_cliente")).sendKeys("Por venta de importaciones");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Destino_de_los_recursos_del_cliente")).sendKeys("Norte y centro del pa�s");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Prop�sito_de_las_transferencias_que_pretende_realizar")).sendKeys("Inversi�n redituable");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Actividad_Giro_de_negocio")).sendKeys("Mutuo, Pr�stamos o Cr�ditos, con o sin Garant�a.");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Actividad_Giro_de_negocio")).sendKeys(Keys.ENTER);
				
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Nombre_del_beneficiario")).sendKeys("Ernesto Cepada Ordo�ez");
				
				//Nuevos campos agregados a este apartado
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Procedencia_de_los_recursos_del_cliente")).sendKeys("Opera");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Procedencia_de_los_recursos_del_cliente")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Destino_de_los_recursos_del_cliente")).sendKeys("Administrativos ");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Destino_de_los_recursos_del_cliente")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Prop�sito_de_las_transferencias_que_pretende_realizar")).sendKeys("Recibir recursos de Bancomext, conforme al contrato de factoraje financiero sin recurso ");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Prop�sito_de_las_transferencias_que_pretende_realizar")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Indique_la_principal_industria_a_la_que_pertenecen_preponderantemente_sus_clientes")).sendKeys("Fiscales");
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar__Tiene_clientes_de_gobierno')][contains( @value, '0')]")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Actividad_Giro_de_negocio")).sendKeys("Tarjetas Prepagadas. ");
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Actividad_Giro_de_negocio")).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Respuesta')][contains( @value, '1')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Pol�tica_Anticorrupci�n')][contains( @value, '1')]")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Denominaci�n_del_documento_de_pol�tica_anticorrupci�n")).sendKeys("Documento anticorrupci�n");
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_C�digo_de_conducta')][contains( @value, '1')]")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Denominaci�n_del_documento_de_c�digo_de_conducta")).sendKeys("Documento C�digo de Conducta");
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Pol�ticas_de_regalos_y_hospitalidad')][contains( @value, '1')]")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Denominaci�n_del_documento_de_pol�ticas_de_regalos_y_hospitalidad")).sendKeys("Documentos Regalos y Hospitallidad");
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Pol�tica_de_donaciones')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Pol�tica_de_comisiones')][contains( @value, '1')]")).click();
				driver.findElement(By.id("Informaci�n_del_producto_a_contratar_Denominaci�n_del_documento_de_pol�tica_de_comisiones")).sendKeys("Documentos Comisiones");
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Pol�tica_de_contribuciones_y_o_patrocinios')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_L�nea_�tica_y_o_denuncia')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar_Auditor�as_internas_y_o_externas_peri�dicas_para_evaluar_el_cumplimiento_de_las_pol�ticas_establecidas_en_temas_anticorrupci�n')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'Informaci�n_del_producto_a_contratar__Ha_dado_a_conocer_a_su_personal_as�_como_a_sus_socios_de_negocios_intermediarios_proveedores_clientes_y_cualquier_otra_persona_o_entidad_que_tenga_inter�s_en_su_negocio_las_pol�ticas_vigentes_en_temas_anticorrupci�n')][contains( @value, '1')]")).click();
				
				
				//Guardar el apartado de "Informaci�n del producto a contratar"
				driver.findElement(By.id("submit")).click();
				
				//Se cierra el navegador
				//driver.close();
				
	}

}
