package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistroElectronicoPyme6 {

	public static void main(String[] args) throws InterruptedException {
		// Declaración de navegador
				ChromeOptions opts = new ChromeOptions();
				opts.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(opts);

				// Completar el formulario de Usuario y Contraseña
				driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
				driver.manage().window().maximize();
				Thread.sleep(1500);

				// Ingresar credenciales para completar REGISTRO ELECTRÓNICO
				driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
				driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
				driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
				Thread.sleep(2000);
				
				// Completar el REGISTRO ELECTRÓNICO - Declaración
				driver.findElement(By.xpath("//*[text() = 'G) Declaraciones']")).click();
				driver.findElement(By.xpath("//*[contains(@id,'DeclaracionesPM_Respuesta_1')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'DeclaracionesPM_Respuesta_2')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[@id='DeclaracionesPM_Respuesta_3']")).sendKeys("Sí");
				driver.findElement(By.xpath("//*[@id='DeclaracionesPM_Respuesta_3']")).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//*[contains(@id,'DeclaracionesPM_Respuesta_4')][contains( @value, '1')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'DeclaracionesPM_Respuesta_5')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[contains(@id,'DeclaracionesPM_Respuesta_6')][contains( @value, '0')]")).click();
				driver.findElement(By.xpath("//*[@id='DeclaracionesPM_Respuesta_7']")).sendKeys("Sí");
				driver.findElement(By.xpath("//*[@id='DeclaracionesPM_Respuesta_7']")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("DeclaracionesPM_Respuesta_8")).sendKeys("Si");
				driver.findElement(By.id("DeclaracionesPM_Respuesta_8")).sendKeys(Keys.ENTER);
				
				//Guardar el apartado de "Declaración"
				driver.findElement(By.id("submit")).click();
				
				//Se cierra el navegador
				//driver.close();
				
	}

}
