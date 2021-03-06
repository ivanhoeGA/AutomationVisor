package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidacionCorreo {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		
		//Acceder al correo para generar la contrase�a
		driver.navigate().to("http://www.yopmail.com/es/");
		driver.manage().window().maximize ();
		
		driver.findElement(By.id("login")).sendKeys("prueba.test003");
		driver.findElement(By.xpath("//*[@class='sbut']")).click();
		//Thread.sleep(2000);
		
		//Identificar el bot�n "Crear contrase�a"y cambiar de pesta�a para generar tu contrase�a
		//driver.findElement(By.id("m4")).click();
		//driver.findElement(By.xpath("//*[.='CREAR CONTRASE�A']")).click();
		
		//Identificaci�n de la p�gina deSuppliers pay cash
		driver.navigate().to("https://demobancomext.visor.io/spc/");
				
		String baseUrl = "https://demobancomext.visor.io/spc/";
		String expectedTitle = "Bancomext";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		
		if (actualTitle.contentEquals(expectedTitle))  {
			System.out.println("Verificaci�n realizada, Bancomext es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		
		//Identificar el bot�n "Crea tu cuenta" y detonar la ventana para ingresar tu RFC
			driver.findElement(By.xpath("//*[text() = 'Crea tu cuenta']")).click();
		Thread.sleep(2000);
		
		//Identificaci�n de la p�gina deSuppliers pay cash
		String expectedTitle1 = "Bienvenido";
		String actualTitle1 = "";
		
		
		actualTitle1 = driver.getTitle();
		
		
		if (actualTitle1.contentEquals(expectedTitle1))  {
			System.out.println("Verificaci�n realizada, Bienvenido, se ingresa el RFC es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		//Ingresar el RFC y aceptar aviso de privacidad	
			driver.findElement(By.id("rfc")).sendKeys("TGO080429880");
			driver.findElement(By.id("acepto")).click();
		
		//Identificar el bot�n "Veririficar RFC" y detonar la ventana para ingresar tu RFC
			driver.findElement(By.xpath("//*[text() = 'VERIFICAR RFC']")).click();
			
			
		//Completar el formulario de Usuario y Contrase�a
			driver.findElement(By.id("telDCDRfc")).sendKeys("5523569874");
			driver.findElement(By.id("contDCDRfc")).sendKeys("TGO080429880");
			driver.findElement(By.id("ema")).sendKeys("prueba.test003@yopmail.com");
			driver.findElement(By.id("pass1")).sendKeys("Mexico123*");
			driver.findElement(By.id("pass2")).sendKeys("Mexico123*");
			driver.findElement(By.xpath("//*[text() = 'Registrarse']")).click();
			
		//Salir de la sesi�n de BANCO cerrando el navegador
			//driver.close();	
	}

}
