package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05a {

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
		
		//Delcarar los campos de Línea de crédito
		WebElement credSolic = driver.findElement(By.id("Solicitud_de_crédito_2_Linea_de_crédito_solicitada"));
		WebElement typeOperation = driver.findElement(By.id("Solicitud_de_crédito_2_Tipo_de_operación"));
		
		//Ingresar los datos de Línea de crédito
		credSolic.sendKeys("500000");;
		typeOperation.click();
		typeOperation.sendKeys("cr");
		
		//Declarar los campos obligatorios Datos generales
		WebElement denominacion = driver.findElement(By.id("Solicitud_de_crédito_2_Denominación_o_Razón_social"));
		WebElement giro = driver.findElement(By.id("Solicitud_de_crédito_2_Giro"));
		WebElement principales = driver.findElement(By.id("Solicitud_de_crédito_2_Principales_productos_Servicios"));
		WebElement nacionalidad = driver.findElement(By.id("Solicitud_de_crédito_2_Nacionalidad"));
		WebElement rfcHomo	= driver.findElement(By.id("Solicitud_de_crédito_2_RFC_con_homoclave"));
		WebElement paisRFC = driver.findElement(By.id("Solicitud_de_crédito_2_País_que_asignó_el_RFC"));
		WebElement serieF = driver.findElement(By.id("Solicitud_de_crédito_2_No_de_serie_de_Firma_Electrónica_Avanzada"));
		WebElement telefono = driver.findElement(By.id("Solicitud_de_crédito_2_Teléfono"));
		WebElement avenida = driver.findElement(By.id("Solicitud_de_crédito_2_Calle_Avenida_o_Vía"));
		WebElement numExt = driver.findElement(By.id("Solicitud_de_crédito_2_Número_exterior"));
		WebElement codPos = driver.findElement(By.id("Solicitud_de_crédito_2_Código_postal"));
		WebElement pais = driver.findElement(By.id("Solicitud_de_crédito_2_País"));
		WebElement email = driver.findElement(By.id("Solicitud_de_crédito_2_Correo_electrónico"));
		WebElement pageweb = driver.findElement(By.id("Solicitud_de_crédito_2_Página_web"));
		WebElement fechaConstitucion = driver.findElement(By.id("Solicitud_de_crédito_2_Fecha_de_constitución_de_la_empresa"));
		WebElement sofom = driver.findElement(By.xpath("//*[contains(@id,'Solicitud_de_crédito_2__Es_una_SOFOM_Centro_Cambiario_o_Transmisor_de_Dinero')][contains( @value, '0')]"));
		WebElement cotiza = driver.findElement(By.xpath("//*[contains(@id,'Solicitud_de_crédito_2__Cotiza_en_Bolsa')][contains( @value, '0')]"));
		
		//Se ingresa la información en los campos correspondientes
		denominacion.sendKeys("Productos Bovinos Cia.");
		giro.click();
		giro.sendKeys("SERVICIOS PROFESIONALES, CIENTIFICOS Y TECNICOS");
		principales.sendKeys("Prodcutos no perecederos");
		nacionalidad.sendKeys("Mexicana");
		rfcHomo.sendKeys("LPD081210FI2");
		paisRFC.sendKeys("MEXICO ");
		serieF.sendKeys("0654098498");
		telefono.sendKeys("5529632598"); 
		avenida.sendKeys("Avenida del Iman");
		numExt.sendKeys("200");
		codPos.sendKeys("06800");
		pais.sendKeys("MEXICO ");
		email.sendKeys("producto.bovinos@yopmail.com");
		pageweb.sendKeys("www.bovinos.com");
		fechaConstitucion.sendKeys("06/02/1973");
		sofom.click();
		cotiza.click();
		Thread.sleep(2000);
		
		//Declarar los campos obligatorios Representantes Legales
		WebElement nameRepLg = driver.findElement(By.id("Solicitud_de_crédito_2_Nombre_completo_representante_legal_1"));
		WebElement mailRepLeg = driver.findElement(By.id("Solicitud_de_crédito_2_Correo_electrónico_representante_legal_1"));
		WebElement telRepLeg = driver.findElement(By.id("Solicitud_de_crédito_2_Teléfono_representante_legal_1"));
		
		//Se ingresa la información en los campos correspondientes
		nameRepLg.sendKeys("Sergio Araujo Benítez");
		mailRepLeg.sendKeys("producto.bovinos@yopmail.com");
		telRepLeg.sendKeys("5569862358");
		
		//Declarar los campos obligatorios de Referencias clientes
		WebElement nameCliente = driver.findElement(By.id("Solicitud_de_crédito_2_Nombre_completo_del_cliente"));
		WebElement telCliente = driver.findElement(By.id("Solicitud_de_crédito_2_Teléfono_del_cliente"));
		WebElement nameContacto = driver.findElement(By.id("Solicitud_de_crédito_2_Nombre_completo_del_contacto_cliente"));
		WebElement ventasTot = driver.findElement(By.id("Solicitud_de_crédito_2_Ventas_totales_del_último_ejercicio"));
		WebElement ventasAct = driver.findElement(By.id("Solicitud_de_crédito_2_Ventas_actuales"));
		WebElement limCred = driver.findElement(By.id("Solicitud_de_crédito_2_Límite_de_crédito"));
		WebElement plazo = driver.findElement(By.id("Solicitud_de_crédito_2_Plazo_del_crédito"));
		
		//Se ingresa la información en los campos correspondientes
		nameCliente.sendKeys("Augusto Slim Cobre");
		telCliente.sendKeys("5563295623");
		nameContacto.sendKeys("Rosa Isela Monroy Augusto");
		ventasTot.sendKeys("1052360.29");
		ventasAct.sendKeys("566596.23");
		limCred.sendKeys("1000000");
		plazo.sendKeys("24");
		
		//Declarar los campos obligatorios de Referencias proveedores
		WebElement nameProv = driver.findElement(By.id("Solicitud_de_crédito_2_Nombre_completo_del_proveedor"));
		WebElement telProv = driver.findElement(By.id("Solicitud_de_crédito_2_Teléfono_proveedor"));
		WebElement nameContacto2 = driver.findElement(By.id("Solicitud_de_crédito_2_Nombre_completo_del_contacto_proveedor"));
		WebElement compraTot = driver.findElement(By.id("Solicitud_de_crédito_2_Compras_totales_del_último_ejercicio"));
		WebElement compraAct = driver.findElement(By.id("Solicitud_de_crédito_2_Compras_actuales"));
		WebElement limitCred = driver.findElement(By.id("Solicitud_de_crédito_2_Limite_de_crédito"));
		
		//Se ingresa la información en los campos correspondientes
		nameProv.sendKeys("Productores bovinos SA de CV");
		telProv.sendKeys("8156923611");
		nameContacto2.sendKeys("Alfonso Reyes Heroles");
		compraTot.sendKeys("$1,005,326.23");
		compraAct.sendKeys("506230.96");
		limitCred.sendKeys("1000000");
		
		//Declarar las Referencias bancarias
		WebElement banco = driver.findElement(By.id("Solicitud_de_crédito_2_Banco"));
		WebElement cuenta = driver.findElement(By.id("Solicitud_de_crédito_2_Número_de_cuenta"));
		WebElement credito = driver.findElement(By.id("Solicitud_de_crédito_2_Crédito"));
		WebElement telBanco = driver.findElement(By.id("Solicitud_de_crédito_2_Teléfono_del_banco"));
		
		//Se ingresa información en los campos correspondientes
		banco.click();
		banco.sendKeys("BANAMEX ");
		cuenta.sendKeys("08256309");
		credito.click();
		credito.sendKeys("SI");
		telBanco.sendKeys("5596238746");
		
		//Declarar los campos de Transaccionalidad esperada
		WebElement instrumento = driver.findElement(By.id("Solicitud_de_crédito_2__Instrumento_monetario_con_el_que_espera_realizar_sus_pagos"));
		WebElement destino = driver.findElement(By.id("Solicitud_de_crédito_2__Cuál_es_el_destino_de_los_recursos_que_va_a_obtener_de_la_celebración_de_la_operación"));
		WebElement pagosAntip = driver.findElement(By.id("Solicitud_de_crédito_2__Espera_realizar_pagos_anticipados"));
		
		//Se ingresa la información en los campos correspondientes
		instrumento.click();
		instrumento.sendKeys("Depósito en efectivo a cuenta bancaria ");
		destino.click();
		destino.sendKeys("Liquidez ");
		pagosAntip.click();
		pagosAntip.sendKeys("No ");
		
		//Declaran los campos de Información adicional
		WebElement socioExt = driver.findElement(By.xpath("//*[contains(@id,'Solicitud_de_crédito_2__Alguno_de_sus_socios_o_accionistas_desempeña_o_ha_desempeñado_funciones_públicas_destacadas_en_México_o_en_el_extranjero_altos_puestos_ejecutivos_en_empresas_estatales_o_funciones_importantes_en_partidos_políticos')][contains( @value, '0')]"));
		WebElement conocidoGob = driver.findElement(By.xpath("//*[contains(@id,'Solicitud_de_crédito_2__El_cónyuge_o_alguno_de_los_padres_abuelos_hijos_nietos_hermanos_suegros_hijos_políticos_abuelos_políticos_o_cuñados_de_los_socios_o_accionistas_desempeña_o_ha_desempeñado_funciones_públicas_destacadas_en_México_o_en_el_extranjero_altos_puestos_ejecutivos_en_empresas_estatales_o_funciones_importantes_en_partidos_políticos')][contains( @value, '0')]"));
		WebElement recursoTercero = driver.findElement(By.id("Solicitud_de_crédito_2__Los_recursos_son_propios_o_de_un_tercero"));
		
		//Se ingresa la información de los datos correspondientes
		socioExt.click();
		conocidoGob.click();
		recursoTercero.click();
		recursoTercero.sendKeys("Recursos propios ");
	
		
		//Autorización y Aceptación
		WebElement autorizacion = driver.findElement(By.xpath("//*[contains(@id,'Solicitud_de_crédito_2_Acepto_y_autorizo')]"));
		
		
		//Se autoriza la consulta de historial crediticio
		autorizacion.click();
		
		//Se declara el botón para almacenar la información de la pestaña "Solicitud de crédito"
		WebElement guardar = driver.findElement(By.id("submit"));
				
		//Se ejecuta la instrucción de Guardar
		guardar.click();
		
		Thread.sleep(3500);
		
		//Se cierra el pop up con la notificación de almacenamiento éxitoso
		WebElement continuar = driver.findElement(By.xpath("//*[contains(@class,'btn center')][text() = 'Continuar']"));
		
		//Se cierra la ventana emergente para continuar con la siguiente fase
		continuar.click();
	}

}
