package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05c {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser y navegar a la url
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://uniclick.visor.io/login/uniclick");
		driver.manage().window().maximize();

		// Ingresar credenciales para abrir navegador
		driver.findElement(By.id("emaIndex")).sendKeys("producto.bovinos@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5500);

		// Ubicarse en la etapa correspondiente para la carga de los campos
		// obligatorios
		driver.findElement(By.xpath("//*[text() = 'Anexo 2 propietarios reales']")).click();

		// Se declaran los campos relacionados a la información
		WebElement nameProp = driver
				.findElement(By.id("Anexo_propietarios_reales_Nombre_completo_del_propietario_real_1"));
		WebElement generoProp = driver.findElement(By.id("Anexo_propietarios_reales_Género_del_propietario_real_1"));
		WebElement fechaProp = driver
				.findElement(By.id("Anexo_propietarios_reales_Fecha_de_nacimiento_del_propietario_real_1"));
		WebElement entidad = driver.findElement(
				By.id("Anexo_propietarios_reales_Entidad_federativa_de_nacimiento_del_propietario_real_1"));
		WebElement paisRFC = driver
				.findElement(By.id("Anexo_propietarios_reales_País_de_nacimiento_del_propietario_real_1"));
		WebElement nacionalidad = driver
				.findElement(By.id("Anexo_propietarios_reales_Nacionalidad_del_propietario_real_1"));
		WebElement curp = driver.findElement(By.id("Anexo_propietarios_reales_CURP_del_propietario_real_1"));
		WebElement giro = driver.findElement(By.id("Anexo_propietarios_reales_Giro_del_propietario_real_1"));
		WebElement rfc = driver.findElement(By.id("Anexo_propietarios_reales_RFC_del_propietario_real_1"));
		WebElement rfcPais = driver
				.findElement(By.id("Anexo_propietarios_reales_País_que_asigno_el_RFC_del_propietario_real_1"));
		WebElement correo = driver
				.findElement(By.id("Anexo_propietarios_reales_Correo_electrónico_del_propietario_real_1"));
		WebElement serieFirma = driver.findElement(
				By.id("Anexo_propietarios_reales_No_de_serie_de_firma_electrónica_avanzada_del_propietario_real_1"));
		WebElement telefono = driver
				.findElement(By.id("Anexo_propietarios_reales_Número_de_teléfono_del_propietario_real_1"));
		WebElement calle = driver.findElement(By.id("Anexo_propietarios_reales_Calle_del_propietario_real_1"));
		WebElement numExt = driver
				.findElement(By.id("Anexo_propietarios_reales_Número_exterior_del_propietario_real_1"));
		WebElement cp = driver.findElement(By.id("Anexo_propietarios_reales_Código_postal_del_propietario_real_1"));
		WebElement pais = driver.findElement(By.id("Anexo_propietarios_reales_País_del_propietario_real_1"));
		WebElement cuentaPropia = driver.findElement(By.id(
				"Anexo_propietarios_reales__El_propietario_real_1_actúa_a_nombre_y_por_cuenta_propia_o_a_nombre_y_por_cuenta_de_un_tercero"));
		WebElement recurPropio = driver.findElement(By.id(
				"Anexo_propietarios_reales__Los_recursos_del_Propietario_real_1_son_propios_o_los_recursos_son_de_un_tercero"));
		WebElement autorización = driver.findElement(By.xpath(
				"//*[contains(@id,'Anexo_propietarios_reales_1_Declaro_bajo_protesta_de_decir_verdad_que_todos_los_datos_incluidos_en_este_Anexo_son_verídicos')]"));

		nameProp.sendKeys("SANTIESTEBAN ONTIVEROS ADRIAN");
		generoProp.click();
		generoProp.sendKeys("Masculino");
		fechaProp.sendKeys("31/07/1991");
		entidad.sendKeys("Chihuahua");
		paisRFC.sendKeys("MEXICO");
		nacionalidad.sendKeys("Mexicana");
		curp.sendKeys("SAOA791121HCHNND03");
		giro.click();
		giro.sendKeys("SERVICIOS DE ALOJAMIENTO TEMPORAL Y DE PREPARACION DE ALIMENTOS Y BEBIDAS");
		rfc.sendKeys("SAOA791121RT3");
		rfcPais.click();
		rfcPais.sendKeys("MEXICO");
		correo.sendKeys("adrian@yopmail.com");
		serieFirma.sendKeys("87234824512");
		telefono.sendKeys("5566332299");
		calle.sendKeys("CENTRAL ORIENTE 608, CENTRO , DELICIAS");
		numExt.sendKeys("2050");
		cp.sendKeys("45510");
		pais.sendKeys("MEXICO");
		cuentaPropia.click();
		cuentaPropia.sendKeys("Por cuenta propia ");
		recurPropio.click();
		recurPropio.sendKeys("Recursos propios ");
		autorización.click();

		// Se declara el botón para almacenar la información de la pestaña
		// "Solicitud de crédito"
		WebElement guardar = driver.findElement(By.id("submit"));

		// Se ejecuta la instrucción de Guardar
		guardar.click();

		Thread.sleep(3500);

		// Se cierra el pop up con la notificación de almacenamiento éxitoso
		WebElement continuar = driver.findElement(By.xpath("//*[contains(@class,'btn center')][text() = 'Continuar']"));

		// Se cierra la ventana emergente para continuar con la siguiente fase
		continuar.click();

	}

}
