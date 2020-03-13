package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistroElectronicoPyme1 {

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
				Thread.sleep(2000);
				
			//Completar el apartado "Datos del proveedor"
				driver.findElement(By.id("Datos_generales_de_la_empresa_Raz�n_Social")).sendKeys("Pruebas de Bancomext Automatizadas SA de CV");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Apellido_paterno")).sendKeys("Corcega");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Apellido_materno")).sendKeys("Marriaga");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Nombre_s")).sendKeys("Mario Augusto");
				driver.findElement(By.id("Datos_generales_de_la_empresa_RFC_con_homoclave")).sendKeys("CART751009DR4");
				driver.findElement(By.xpath("//*[contains(@id,'Datos_generales_de_la_empresa__Es_extranjero')][contains( @value, '0')]")).click();
//				driver.findElement(By.xpath("//*[contains(@id,'Datos_generales_del_proveedor__Es_persona_extranjera')][contains( @value, '0')]")).click();
//				driver.findElement(By.id("Datos_generales_del_proveedor_CURP")).sendKeys("GAAI851013HDFRRV01");
//				driver.findElement(By.id("Datos_generales_del_proveedor_G�nero")).sendKeys("M");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Entidad_federativa_de_nacimiento")).sendKeys("HIDALGO");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Fecha_de_nacimiento")).sendKeys("13-02-1974");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Nacionalidad']")).sendKeys("MEXICANA");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Nacionalidad']")).sendKeys(Keys.ENTER);
//				driver.findElement(By.id("Datos_generales_del_proveedor_Pa�s_de_nacimiento")).sendKeys("MEXICO ");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Tel�fono_con_clave_de_larga_distancia_1")).sendKeys("5569635852");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Tel�fono_con_clave_de_larga_distancia_2")).sendKeys("5547415852");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Correo_electr�nico")).sendKeys("selenium.qa@yopmail.com");
//				driver.findElement(By.id("Datos_generales_del_proveedor_N�mero_de_serie")).sendKeys("56321225986354123621");
				driver.findElement(By.id("Datos_generales_de_la_empresa_Fecha_de_constituci�n")).sendKeys("27-04-1961");
				driver.findElement(By.id("Datos_generales_de_la_empresa_Fecha_de_inscripci�n_en_el_RPC")).sendKeys("06-01-1983");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Calle")).sendKeys("Yucat�n del Oriente");
//				driver.findElement(By.id("Datos_generales_del_proveedor_N�mero_exterior")).sendKeys("058");
//				driver.findElement(By.id("Datos_generales_del_proveedor_C�digo_postal")).sendKeys("55498");
//				Thread.sleep(2000);//se cargan las opciones del cat�logo
//				driver.findElement(By.id("Datos_generales_del_proveedor_Entidad_Federativa_Estado_o_Provincia")).sendKeys("CIUDAD DE MEXICO ");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Pa�s")).sendKeys("MEXICO ");
//				driver.findElement(By.id("Datos_generales_del_proveedor_Razones_por_las_que_desea_realizar_operaciones_financieras_en_M�xico")).sendKeys("Para traer derrama ec�nomica en el pa�s");
				driver.findElement(By.id("Datos_generales_de_la_empresa_N�mero_de_acta_constitutiva")).sendKeys("65409899965");
				driver.findElement(By.name("Datos_generales_de_la_empresa_N�mero_del_RPC")).sendKeys("112132111136");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Pa�s_de_constituci�n']")).sendKeys("MEXICO");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Pa�s_de_constituci�n']")).sendKeys(Keys.ENTER);
				driver.findElement(By.name("Datos_generales_de_la_empresa_Tel�fono_con_clave_de_larga_distancia_1")).sendKeys("5558986562");
				driver.findElement(By.name("Datos_generales_de_la_empresa_Tel�fono_con_clave_de_larga_distancia_2")).sendKeys("5558986125");
				driver.findElement(By.name("Datos_generales_de_la_empresa_Correo_electr�nico")).sendKeys("selenium123.qa@yopmail.com");
				
				//Completar el apartado "Firma electr�nica avanzada"
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_N�mero_de_serie_de_firma_electr�nica_avanzada']")).sendKeys("20365987411121000203");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Fecha_inicial_de_la_vigencia']")).sendKeys("11-09-2014");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Fecha_final_de_la_vigencia']")).sendKeys("22-12-2019");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Calle']")).sendKeys("Canal de San Juan");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_N�mero_exterior']")).sendKeys("502");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_C�digo_postal']")).sendKeys("04810");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Entidad_Federativa_Estado_Provincia_Departamento_Demarcaci�n_pol�tica_similar_que_corresponda']")).sendKeys("MICHOACAN");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Pa�s_de_constituci�n']")).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Pa�s']")).sendKeys("MEXICO");
				driver.findElement(By.xpath("//*[@id='Datos_generales_de_la_empresa_Pa�s_de_constituci�n']")).sendKeys(Keys.ENTER);
				
			//Completar el apartado "A) Datos de la empresa"
				driver.findElement(By.id("Datos_generales_de_la_empresa_Razones_por_las_que_desea_realizar_operaciones_financieras_en_M�xico")).sendKeys("Para aumentar los boneficios de las personas mexicanas");
				
							
			//Guardar el apartado de "Datos de la Empresa"
				driver.findElement(By.id("submit")).click();
				
				
				
				
	}

}
