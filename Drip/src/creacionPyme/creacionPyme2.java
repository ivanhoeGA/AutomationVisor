package creacionPyme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class creacionPyme2 {

	public static void main(String[] args) throws InterruptedException{
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
		
		//Se ingresa en la etapa para completar "Datos Empresa"
		WebElement PestaniaEmpresa = driver.findElement(By.xpath("//h4[contains(text(),'datos empresa')]"));
		PestaniaEmpresa.click();
		
		//Se definen los elementos de la pagina
		WebElement RazonSocial = driver.findElement(By.id("datos_empresa_razon_social"));
		WebElement rfcEmpresa = driver.findElement(By.id("datos_empresa_rfc"));
		WebElement Calle = driver.findElement(By.id("datos_empresa_calle"));
		WebElement numExterior = driver.findElement(By.id("datos_empresa_numero_exterior"));
		//WebElement numInterior = driver.findElement(By.id("datos_empresa_numero_interior"));
		WebElement Colonia = driver.findElement(By.id("datos_empresa_colonia"));
		WebElement Delegacion = driver.findElement(By.id("datos_empresa_delegacion"));
		WebElement Estado = driver.findElement(By.id("datos_empresa_estado"));
		WebElement CodigoPostal = driver.findElement(By.id("datos_empresa_cp"));
		WebElement Giro = driver.findElement(By.id("datos_empresa_giro"));
		WebElement Antiguedad = driver.findElement(By.id("datos_empresa_antiguedad"));
		WebElement Admin = driver.findElement(By.id("datos_empresa_admin"));
		WebElement Empleados = driver.findElement(By.id("datos_empresa_empleados"));
		WebElement Banco = driver.findElement(By.id("datos_empresa_banco"));
		WebElement Servicios = driver.findElement(By.id("datos_empresa_servicios"));
		//WebElement CreditoInstitucion = driver.findElement(By.xpath("//*[contains(@id,'datos_empresa_Tienes_algun_credito_con_alguna_institucion_financiera')][contains( @value, '1')]"));
		WebElement btnGuardar = driver.findElement(By.id("submit"));
		
		
		RazonSocial.sendKeys("Drip Automation script");
		rfcEmpresa.sendKeys("CACL6804241N1");
		Calle.sendKeys("Periférico Poniente");
		numExterior.sendKeys("12305");
		//numInterior.sendKeys("45-B");
		Colonia.sendKeys("Agrícola Oriental");
		Delegacion.sendKeys("Coyoacán");
		Estado.click();
		Estado.sendKeys("Michoacán ");
		Estado.sendKeys(Keys.ENTER);
		CodigoPostal.sendKeys("45213");
		Giro.click();
		Giro.sendKeys("INDUSTRIAS MANUFACTURERAS");
		Giro.sendKeys(Keys.ENTER);
		Antiguedad.sendKeys("25");
		Admin.click();
		Admin.sendKeys("Institucional ");
		Admin.sendKeys(Keys.ENTER);
		Empleados.click();
		Empleados.sendKeys("31-50 ");
		Empleados.sendKeys(Keys.ENTER);
		Banco.click();
		Banco.sendKeys("ABC CAPITAL ");
		Banco.sendKeys(Keys.ENTER);
		Servicios.click();
		Servicios.sendKeys("Crédito ");
		Servicios.sendKeys(Keys.ENTER);
		//CreditoInstitucion.click();
		btnGuardar.click();
		

	}

}
