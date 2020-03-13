package creacionPyme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class creacionPyme1 {

	public static void main(String[] args) throws InterruptedException {
		// Se instancia el navegador para acceder al sitio de Bancomext
				WebDriver driver;
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.navigate().to("https://demo.visor.io/login");
				driver.manage().window().maximize();
		
		// Se ingresa en el aplicativo para la generación de la PYMe y su ´perfil
				WebElement email = driver.findElement(By.id("emaIndex"));
				WebElement password = driver.findElement(By.id("pswIndex"));
				WebElement passButton = driver.findElement(By.xpath("//*[@id = 'submit']"));

				email.sendKeys("tola@yopmail.com");
				password.sendKeys("Visor@123");
				passButton.click();
				
				Thread.sleep(2000);
				
//				Actions action = new Actions(driver);
//				action.sendKeys(Keys.ESCAPE);
						 
		//Se completa el registro electrónico del apoderado legal
				WebElement Nombre = driver.findElement(By.id("apoderado_legal_nombre"));
				WebElement apellPaterno = driver.findElement(By.id("apoderado_legal_apellido_paterno"));
				WebElement apellMaterno = driver.findElement(By.id("apoderado_legal_apellido_materno"));
				WebElement rfc = driver.findElement(By.id("apoderado_legal_rfc"));
				WebElement Sexo = driver.findElement(By.id("apoderado_legal_sexo"));
				//WebElement listSexo = driver.findElement(By.xpath(""))
				WebElement Nacionalidad = driver.findElement(By.id("apoderado_legal_nacionalidad"));
				WebElement Telefono = driver.findElement(By.id("apoderado_legal_telefono"));
				WebElement Email = driver.findElement(By.id("apoderado_legal_email"));
				WebElement QA = driver.findElement(By.xpath("//*[contains(@id,'apoderado_legal_QA')][contains( @value, '1')]"));
				WebElement Hola1 = driver.findElement(By.id("apoderado_legal_hola"));
				WebElement Hola2 = driver.findElement(By.id("apoderado_legal_hola_2"));
				WebElement btnGuardar = driver.findElement(By.id("submit"));
		
				Nombre.sendKeys("Alvaro Saúl");
				apellPaterno.sendKeys("Agüero");
				apellMaterno.sendKeys("Santillan");
				rfc.sendKeys("AGSA771126D48");
				Sexo.click();
				Sexo.sendKeys("Masculino");
				Sexo.sendKeys(Keys.ENTER);
				Nacionalidad.sendKeys("Mexicana");
				Telefono.sendKeys("5512365489");
				Email.sendKeys("drip-automation@yopmail.com");
				QA.click();
				Hola1.sendKeys("Letras para completar el campo");
				Hola2.sendKeys("5587463129");
				btnGuardar.click();
				
		//Se presiona GUARDAR y te sales del aplicativo.

	}

}
