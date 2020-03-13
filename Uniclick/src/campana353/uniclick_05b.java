package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05b {

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
		driver.findElement(By.xpath("//*[text() = 'Anexo 1 principal accionista']")).click();

		// Declarar los campos de anexo
		WebElement nameAcreditado = driver.findElement(By.id("Anexo_1_principal_accionista_Nombre_del_acreditado"));
		WebElement montoCredito = driver
				.findElement(By.id("Anexo_1_principal_accionista_Monto_solicitado_de_la_línea_de_crédito"));
		WebElement prodAvalado = driver.findElement(By.id("Anexo_1_principal_accionista_Producto_que_se_avala"));

		// Se ingresa información en los campos correspondientes
		nameAcreditado.sendKeys("Fernando Amonte Arellano");
		montoCredito.sendKeys("250000");
		prodAvalado.click();
		prodAvalado.sendKeys("Crédito simple ");
		prodAvalado.sendKeys(Keys.ENTER);

		// Se declaran los campos del coacreditado
		WebElement nameCoAcred = driver.findElement(By.id("Anexo_1_principal_accionista_Nombre_completo"));
		WebElement giro = driver.findElement(By.id("Anexo_1_principal_accionista_Giro"));
		WebElement fechaConstitucion = driver
				.findElement(By.id("Anexo_1_principal_accionista_Fecha_de_constitución_o_nacimiento"));
		WebElement entFedertiva = driver
				.findElement(By.id("Anexo_1_principal_accionista_Entidad_federativa_de_nacimiento"));
		WebElement paisNac = driver.findElement(By.id("Anexo_1_principal_accionista_País_de_nacimiento"));
		WebElement nacionalidad = driver.findElement(By.id("Anexo_1_principal_accionista_Nacionalidad"));
		WebElement rfcHomo = driver.findElement(By.id("Anexo_1_principal_accionista_RFC_con_homoclave"));
		WebElement rfcPais = driver.findElement(By.id("Anexo_1_principal_accionista_País_que_asignó_RFC"));
		WebElement genero = driver.findElement(By.id("Anexo_1_principal_accionista_Género"));
		WebElement curpCoAcred = driver.findElement(By.id("Anexo_1_principal_accionista_CURP"));
		WebElement serieFiel = driver
				.findElement(By.id("Anexo_1_principal_accionista_No_de_serie_de_firma_electrónica_avanzada"));
		WebElement emailCoAcreditado = driver.findElement(By.id("Anexo_1_principal_accionista_Correo_electrónico"));
		WebElement telCoAcred = driver
				.findElement(By.id("Anexo_1_principal_accionista_Número_de_teléfono_de_casa_o_trabajo"));
		WebElement movilCoAcred = driver.findElement(By.id("Anexo_1_principal_accionista_Teléfono_móvil"));
		WebElement estadoCivil = driver.findElement(By.id("Anexo_1_principal_accionista_Estado_civil"));

		// Se ingresa la información del CoAcreditado
		nameCoAcred.sendKeys("LUCIO ALBAÑIL VAZQUEZ");
		giro.click();
		giro.sendKeys("SERVICIOS PROFESIONALES, CIENTIFICOS Y TECNICOS");
		fechaConstitucion.sendKeys("12/02/2001");
		paisNac.click();
		paisNac.sendKeys("MEXICO");
		entFedertiva.sendKeys("Campeche");
		nacionalidad.sendKeys("Mexicana");
		rfcHomo.sendKeys("AAVL781213J10");
		rfcPais.click();
		rfcPais.sendKeys("MEXICO");
		genero.click();
		genero.sendKeys("Masculino");
		curpCoAcred.sendKeys("AAVL781213HGRLZCO9");
		serieFiel.sendKeys("98724597T634");
		emailCoAcreditado.sendKeys("lucio@yopmail.com");
		telCoAcred.sendKeys("5563269686");
		movilCoAcred.sendKeys("5504455896");
		estadoCivil.click();
		estadoCivil.sendKeys("Soltero");

		// Se declaran los campos del domicilio del coacreditado
		WebElement calle = driver.findElement(By.id("Anexo_1_principal_accionista_Calle"));
		WebElement numExt = driver.findElement(By.id("Anexo_1_principal_accionista_Número_exterior"));
		WebElement cp = driver.findElement(By.id("Anexo_1_principal_accionista_Código_postal"));
		WebElement pais = driver.findElement(By.id("Anexo_1_principal_accionista_País"));

		// Se agrega la información del domicilio
		calle.sendKeys("Chaak Ba laam");
		numExt.sendKeys("3560");
		cp.sendKeys("24014");
		pais.click();
		pais.sendKeys("MEXICO");

		// Se declaran los campos para referencias personales
		WebElement nameNoPerson = driver.findElement(By.id("Anexo_1_principal_accionista_1_Nombre_completo"));
		WebElement telNoPerson = driver.findElement(By.id("Anexo_1_principal_accionista_1_Teléfono"));
		WebElement emailNoPerson = driver.findElement(By.id("Anexo_1_principal_accionista_1_Correo_electrónico"));
		WebElement relacion = driver.findElement(By.id("Anexo_1_principal_accionista_Relación"));
		WebElement domCompleto = driver.findElement(By.id("Anexo_1_principal_accionista_1_Domicilio_completo"));
		WebElement nameNoPersonDos = driver.findElement(By.id("Anexo_1_principal_accionista_2_Nombre_completo"));
		WebElement telNoPersonDos = driver.findElement(By.id("Anexo_1_principal_accionista_2_Teléfono"));
		WebElement emailNoPersonDos = driver.findElement(By.id("Anexo_1_principal_accionista_2_Correo_electrónico"));
		WebElement relaciDos = driver.findElement(By.id("Anexo_1_principal_accionista_2_Relación"));
		WebElement domCompleDos = driver.findElement(By.id("Anexo_1_principal_accionista_2_Domicilio_completo"));
		WebElement nameNoPersonTres = driver.findElement(By.id("Anexo_1_principal_accionista_3_Nombre_completo"));
		WebElement telNoPersonTres = driver.findElement(By.id("Anexo_1_principal_accionista_3_Teléfono"));
		WebElement emailNoPersonTres = driver.findElement(By.id("Anexo_1_principal_accionista_3_Correo_electrónico"));
		WebElement relacionTres = driver.findElement(By.id("Anexo_1_principal_accionista_3_Relación"));
		WebElement domCompletoTres = driver.findElement(By.id("Anexo_1_principal_accionista_3_Domicilio_completo"));

		// Se agrega la información de las referencias personales
		nameNoPerson.sendKeys("ALCANTARA BASILIO URIEL GERARDO");
		telNoPerson.sendKeys("5563269674");
		emailNoPerson.sendKeys("uriel@yopmail.com");
		relacion.sendKeys("Abogado");
		domCompleto.sendKeys("Calle Tegucigaloapa, con fachada gris, numero 358");
		nameNoPersonDos.sendKeys("GARCIA BERRUECOS OMAR");
		telNoPersonDos.sendKeys("5563263574");
		emailNoPersonDos.sendKeys("omar@yopmail.com");
		relaciDos.sendKeys("The quick brown fox jumps over the lazy dog");
		domCompleDos.sendKeys("Madrigal 43 col. Estocolmo Del. Agricola Oriental, Mérida");
		nameNoPersonTres.sendKeys("ALEIDA ABARCA RODRIGUEZ");
		telNoPersonTres.sendKeys("9915632012");
		emailNoPersonTres.sendKeys("aleida@yopmail.com");
		relacionTres.sendKeys("Office boy");
		domCompletoTres.sendKeys("Avenida costera 319, col. Barra Vieja, Acapulco. Edo. Guerrero");

		// Se selccionan las opciones para las relaciones de altos cargos
		WebElement pfExtranjero = driver.findElement(By.xpath("//*[contains(@id,'Anexo_1_principal_accionista__Usted_PF_PFAE_y_PFSP_o_alguno_de_los_socios_o_accionistas_PM_desempeña_o_ha_desempeñado_funciones_públicas_destacadas_en_México_o_en_el_extranjero_altos_puestos_ejecutivos_en_empresas_estatales_o_funciones_importantes_en_partidos_políticos')][contains( @value, '0')]"));
		WebElement famExtranjero = driver.findElement(By.xpath("//*[contains(@id,'Anexo_1_principal_accionista__Su_cónyuge_o_alguno_de_sus_padres_abuelos_hijos_nietos_hermanos_suegros_hijos_políticos_abuelos_políticos_o_cuñados_PF_PFAE_y_PFSP_o_de_alguno_de_sus_socios_o_accionistas_PM_desempeña_o_ha_desempeñado_funciones_públicas_destacadas_en_México_o_en_el_extranjero_altos_puestos_ejecutivos_en_empresas_estatales_o_funciones_importantes_en_partidos_políticos')][contains( @value, '0')]"));

		// Se realiza la negativa de la relación en el extranjero
		pfExtranjero.click();
		famExtranjero.click();

		// Se indica que se actua con los recursos propios
		WebElement cuentaPropia = driver.findElement(By.id(
				"Anexo_1_principal_accionista__Usted_actúa_a_nombre_y_por_cuenta_propia_o_a_nombre_y_por_cuenta_de_un_tercero_PF_PFAE_o_PFSP"));
		WebElement recursosPropios = driver.findElement(
				By.id("Anexo_1_principal_accionista__Los_recursos_son_propios_o_los_recursos_son_de_un_tercero"));

		// Se eligen las opciones
		cuentaPropia.click();
		cuentaPropia.sendKeys("Por cuenta propia");
		recursosPropios.click();
		recursosPropios.sendKeys("Recursos propios");

		// Se declaran los percentajes de participación
		WebElement propReal = driver.findElement(By.id("Anexo_1_principal_accionista_1_Nombre_del_propietario_real"));
		WebElement porcReal = driver
				.findElement(By.id("Anexo_1_principal_accionista__Participación_del_propietario_real_1"));
		WebElement nameReal = driver.findElement(By.id("Anexo_1_principal_accionista_Nombre_de_Persona_física_1"));
		WebElement puesto = driver.findElement(By.id("Anexo_1_principal_accionista_Puesto_de_Persona_física_1"));

		// Se ingresa la información para culminar la información
		propReal.sendKeys("Carlos Salinas Uriarte");
		porcReal.sendKeys("70");
		nameReal.sendKeys("Carlos Salinas Fabregas");
		puesto.sendKeys("Socio Estrategico");

		// Se declara la opción para aceptar los términos y condiciones
		WebElement autorización = driver
				.findElement(By.xpath("//*[contains(@id,'Anexo_1_principal_accionista_Autorizo')]"));

		// Se elige la opción
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
