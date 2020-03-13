package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistroElectronicoPyme9 {

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
		driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(2000);
		
		// Completar el REGISTRO ELECTRÓNICO - Representante Legal
		//Se completa el apartado de Propietario real 1
		driver.findElement(By.xpath("//*[text() = 'E) Representante legal']")).click();
		driver.findElement(By.xpath("//*[@id='Representante_legal_Personalidad_jurídica_1']")).sendKeys("F");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Personalidad_jurídica_1']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Representante_legal_Apellido_paterno']")).sendKeys("Santos");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Apellido_materno']")).sendKeys("Fabregas");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Nombre_o_nombres']")).sendKeys("Miguel Angel");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Fecha_de_nacimiento']")).sendKeys("11-03-1963");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Número_de_teléfono_1']")).sendKeys("5526359865");
		driver.findElement(By.xpath("//*[@id='Representante_legal_RFC_con_homoclave']")).sendKeys("MITO821109RT8");
		driver.findElement(By.xpath("//*[contains(@id,'Representante_legal__Es_extranjero')][contains( @value, '0')]")).click();
		driver.findElement(By.xpath("//*[@id='Representante_legal_Número_de_identificación_oficial_vigente']")).sendKeys("0012306506");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Tipo_de_identificación_oficial_vigente']")).sendKeys("PASAPORTE");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Tipo_de_identificación_oficial_vigente']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Representante_legal_Nacionalidad']")).sendKeys("MEXICANA");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Nacionalidad']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='Representante_legal_Calle']")).sendKeys("Emilio García");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Número_exterior']")).sendKeys("1250");
		driver.findElement(By.xpath("//*[@id='Representante_legal_Código_postal']")).sendKeys("04810");
		driver.findElement(By.xpath("//*[@id='Representante_legal_País']")).sendKeys("MEXICO");
		
			
		//Guardar el apartado de "Representante Legal"
		driver.findElement(By.id("submit")).click();
		
		
		//Se cierra el navegador
		//driver.close();
		
		

	}

}
