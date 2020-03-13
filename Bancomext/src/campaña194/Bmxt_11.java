package campaña194;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bmxt_11 {

	public static void main(String[] args)throws InterruptedException {
		// Se genera el navegador para acceder
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);

		// Completar el formulario de Usuario y Contraseña
		driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Ingresar credenciales para completar REGISTRO ELECTRÓNICO
		driver.findElement(By.id("emaIndex")).sendKeys("sam194qa@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(2000);
		
		// Completar el REGISTRO ELECTRÓNICO - Propietarios
		//Se completa el apartado de Propietario real 1
		driver.findElement(By.xpath("//*[text() = 'F) Propietarios']")).click();
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Tipo_de_persona_física']")).sendKeys("Nacional ");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Tipo_de_persona_física']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Personalidad_jurídica']")).sendKeys("F ");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Personalidad_jurídica']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Apellido_paterno']")).sendKeys("Covarrubias");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Apellido_materno']")).sendKeys("Mondragón");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Nombre_o_nombres']")).sendKeys("Luisa Fernanda");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Género']")).sendKeys("F ");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Género']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Fecha_de_nacimiento']")).sendKeys("12-09-1976");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Entidad_federativa_de_nacimiento_solo_para_nacionales']")).sendKeys("DURANGO ");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Entidad_federativa_de_nacimiento_solo_para_nacionales']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_País_de_nacimiento']")).sendKeys("MEXICO");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_País_de_nacimiento']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Nacionalidad']")).sendKeys("MEXICANA ");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Nacionalidad']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Ocupación']")).sendKeys("lICEMCIADA EN dERECHO");
		
		//Se completa el apartado Firma Electrónica Avanzada
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Número_de_serie']")).sendKeys("20365987400000000203");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Fecha_inicial_de_la_vigencia']")).sendKeys("01-10-2014");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Fecha_final_de_la_vigencia']")).sendKeys("01-10-2030");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_CURP']")).sendKeys("CABL860422MVZSRZ18");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_RFC_con_homoclave']")).sendKeys("CABL860422CQA");
		driver.findElement(By.xpath("//*[contains(@id,'Propietarios_1_Es_persona_extranjera')][contains( @value, '0')]")).click();
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Número_de_teléfono_1']")).sendKeys("5566352610");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Número_de_teléfono_2']")).sendKeys("5567562610");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Correo_electrónico']")).sendKeys("correo.automation.test@yopmail.com");
		
		//Domicilio particular en su lugar de residencia
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Calle']")).sendKeys("Emiliano Zapata");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Número_exterior']")).sendKeys("2003");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Código_postal']")).sendKeys("04810");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Colonia_o_urbanización']")).sendKeys("Gral Ponciano Quiroz");
		//driver.findElement(By.xpath("//*[@id='Propietarios_1_Ciudad_o_población']")).sendKeys("Gral Ponciano Quiroz");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_País']")).sendKeys("MEXICO");
		driver.findElement(By.xpath("//*[@id='Propietarios_1_Domicilio_para_recibir_correspondencia']")).sendKeys("MEXICO");
		
		//Guardar el apartado de "Propietarios"
		driver.findElement(By.id("submit")).click();
		
		
		//Se cierra el navegador
				driver.close();
		
		

	}

}
