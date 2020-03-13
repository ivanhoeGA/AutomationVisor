package campa�a194;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bmxt_09 {

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
				driver.findElement(By.id("emaIndex")).sendKeys("sam194qa@yopmail.com");
				driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
				driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
				Thread.sleep(2000);	
				
			//Completar el REGISTRO ELECTR�NICO - Estructura
				driver.findElement(By.xpath("//*[text() = 'D) Estructura']")).click();
				driver.findElement(By.id("C_Estructura_1_Personalidad_juridica_accionista")).sendKeys("F");
				driver.findElement(By.id("C_Estructura_1_Personalidad_juridica_accionista")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("C_Estructura_1_Apellido_paterno_accionista")).sendKeys("Casah�bon");
				driver.findElement(By.id("C_Estructura_1_Apellido_materno_accionista")).sendKeys("Guadarrama");
				driver.findElement(By.id("C_Estructura_1_Nombre_o_nombres_del_accionista")).sendKeys("Leonora Fabiana");
				driver.findElement(By.id("C_Estructura_1_Raz�n_social_en_caso_de_ser_persona_moral")).sendKeys("Plasticos Condensados El�ctricos");
				driver.findElement(By.id("C_Estructura_1_RFC_con_homoclave_del_accionista")).sendKeys("MIR751263IO0");
				driver.findElement(By.id("C_Estructura_1_Porcentaje_de_participaci�n_del_accionista")).sendKeys("23");
				driver.findElement(By.id("C_Estructura_1_Nacionalidad_del_accionista")).sendKeys("MEXICANA");
				driver.findElement(By.id("C_Estructura_1_Nacionalidad_del_accionista")).sendKeys(Keys.ENTER);
				
				driver.findElement(By.xpath("//*[contains(@id,'C_Estructura_Se�ale_si_el_Cliente_tiene_Cotitulares_Terceros_Autorizados_Obligados_Solidarios_Proveedores_de_los_Recursos_u_Otros')][contains( @value, '0')]")).click();
				
			//Guardar el apartado de "Estructura"
				driver.findElement(By.id("submit")).click();
				
			//Se cierra el navegador
				driver.close();
				
				
	}

}
