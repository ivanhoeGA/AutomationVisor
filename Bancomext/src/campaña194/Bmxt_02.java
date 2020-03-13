package campaña194;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bmxt_02 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		
		//Acceder al correo para generar la contraseña
		driver.navigate().to("http://www.yopmail.com/es/");
		driver.manage().window().maximize ();
		
		driver.findElement(By.id("login")).sendKeys("sam194qa");
		driver.findElement(By.xpath("//*[@class='sbut']")).click();
		//Thread.sleep(2000);
		
		//Identificar el botón "Crear contraseña"y cambiar de pestaña para generar tu contraseña
		//driver.findElement(By.id("m4")).click();
		//driver.findElement(By.xpath("//*[.='CREAR CONTRASEÑA']")).click();
		
		//Identificación de la página deSuppliers pay cash
		driver.navigate().to("https://demobancomext.visor.io/spc/");
				
		String baseUrl = "https://demobancomext.visor.io/spc/";
		String expectedTitle = "Bancomext";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		
		if (actualTitle.contentEquals(expectedTitle))  {
			System.out.println("Verificación realizada, Bancomext es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		
		//Identificar el botón "Crea tu cuenta" y detonar la ventana para ingresar tu RFC
			driver.findElement(By.xpath("//*[text() = 'Crea tu cuenta']")).click();
		Thread.sleep(2000);
		
		//Identificación de la página deSuppliers pay cash
		String expectedTitle1 = "Bienvenido";
		String actualTitle1 = "";
		
		
		actualTitle1 = driver.getTitle();
		
		
		if (actualTitle1.contentEquals(expectedTitle1))  {
			System.out.println("Verificación realizada, Bienvenido, se ingresa el RFC es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		//Ingresar el RFC y aceptar aviso de privacidad	
			driver.findElement(By.id("rfc")).sendKeys("TGO080429880");
			driver.findElement(By.id("acepto")).click();
		
		//Identificar el botón "Veririficar RFC" y detonar la ventana para ingresar tu RFC
			driver.findElement(By.xpath("//*[text() = 'VERIFICAR RFC']")).click();
			
			
		//Completar el formulario de Usuario y Contraseña
			driver.findElement(By.id("telDCDRfc")).sendKeys("5523569874");
			driver.findElement(By.id("contDCDRfc")).sendKeys("NWM9709244W4");
			driver.findElement(By.id("ema")).sendKeys("sam194qa@yopmail.com");
			driver.findElement(By.id("pass1")).sendKeys("Mexico123*");
			driver.findElement(By.id("pass2")).sendKeys("Mexico123*");
			driver.findElement(By.xpath("//*[text() = 'Registrarse']")).click();
			
		//Salir de la sesión de BANCO cerrando el navegador
			driver.close();	
	}

}
