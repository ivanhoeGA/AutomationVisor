package creacionPyme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class creacionPyme3 {

	public static void main(String[] args) throws InterruptedException {
		// Se instancia el navegador para acceder al sitio de Bancomext
				WebDriver driver;
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.navigate().to("https://demo.visor.io/login");
				driver.manage().window().maximize();

				// Se ingresa en el aplicativo para la generación de la PYMe y su perfil
				WebElement email = driver.findElement(By.id("emaIndex"));
				WebElement password = driver.findElement(By.id("pswIndex"));
				WebElement passButton = driver.findElement(By.xpath("//*[@id = 'submit']"));

				email.sendKeys("tola@yopmail.com");
				password.sendKeys("Visor@123");
				passButton.click();
				Thread.sleep(2000);
				
				//Se ingresa en la etapa para completar "Información Financiera"
				WebElement PestaniaEmpresa = driver.findElement(By.xpath("//h4[contains(text(),'Información Financiera')]"));
				PestaniaEmpresa.click();
				
				WebElement Estado1 = driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'informacion_financiera_estado1')]"));
				WebElement CargaArchivo = driver.findElement(By.name("upl"));
				WebElement Guardar = driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]"));
				
				Estado1.click();
				CargaArchivo.sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2500);
				Guardar.click();
				Thread.sleep(4000);
				
				
				WebElement Estado2 = driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'informacion_financiera_estado2')]"));
				WebElement CargaArchivo2 = driver.findElement(By.name("upl"));
				WebElement Guardar2 = driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]"));
				
				Estado2.click();
				CargaArchivo2.sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2500);
				Guardar2.click();
				Thread.sleep(4000);
				
				WebElement Estado3 = driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'informacion_financiera_estado3')]"));
				WebElement CargaArchivo3 = driver.findElement(By.name("upl"));
				WebElement Guardar3 = driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]"));
				
				Estado3.click();
				CargaArchivo3.sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2500);
				Guardar3.click();
				Thread.sleep(4000);
				
				//Cambiarse de apartado
				WebElement DatosCuenta = driver.findElement(By.xpath("//h4[contains(text(),'datos cuenta')]"));
				DatosCuenta.click();
				
				//Guardar Datos Cuenta.
				
				WebElement Banco = driver.findElement(By.id("datos_cuenta_banco"));
				WebElement NombreBanco = driver.findElement(By.id("datos_cuenta_nombre"));
				WebElement Clabe = driver.findElement(By.id("datos_cuenta_clabe"));
				
				Banco.click();
				Banco.sendKeys("BBVA");
				Banco.sendKeys(Keys.ENTER);
				NombreBanco.sendKeys("Banco de México");
				Clabe.sendKeys("684984984098409802");
				
				//Almacenar datos
				WebElement BtnGuardar = driver.findElement(By.id("submit"));
				
				BtnGuardar.click();		
				
				//Avanzar apartado
				WebElement BtnContinuar = driver.findElement(By.xpath("//*[text() = 'Continuar']"));
				
				BtnContinuar.click();
				
				

	}

}
