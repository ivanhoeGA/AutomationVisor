package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccesoIdentificate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Generación de la pa
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);

		
		//Completar el formulario de Usuario y Contraseña
		driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
		driver.manage().window().maximize ();
		Thread.sleep(2500);
		
		//Ingresar credenciales para completar IDENTIFICATE
		driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(18000);
		
		//Completar el formulario del apartado de IDENTIFICATE
		//driver.findElement(By.id("CIEC_Nombre_completo_del_proveedor")).sendKeys("Miguel Marriaga Casaubón");
		//driver.findElement(By.id("CIEC_RFC")).sendKeys("GGAI851013TR6");
		//driver.findElement(By.id("CIEC_CURP")	).sendKeys("GGAI851013HDFRRV09");
		//driver.findElement(By.id("folio_CIEC_Datos_Registrales")).sendKeys("00070531");
		//driver.findElement(By.id("entidad_CIEC_Datos_Registrales")).sendKeys("Ciudad de México");
		//driver.findElement(By.id("oficina_CIEC_Datos_Registrales")).sendKeys("Ciudad de México");
		//driver.findElement(By.id("municipio_CIEC_Datos_Registrales")).sendKeys("Coyoacán");
		
		//**Debido a que se cambio el formulario de la etapa IDENTIFICATE se suprimió llenar info en esta etapa
		//S requiere un usuario, pero solo una unica vez funcionará.
		
		//Guardar los cambios generados en IDENTIDICATE
		driver.findElement(By.xpath("//*[@value='GUARDAR']")).click();
		
		//Salir de la sesión de BANCO cerrando el navegador
		//driver.close();
		
		
	}

}
