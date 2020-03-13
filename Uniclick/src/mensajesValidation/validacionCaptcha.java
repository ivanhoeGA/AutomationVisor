package mensajesValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class validacionCaptcha {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser para dar de alta la PyME
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://uniclick.visor.io/signup/uniclick");
		driver.manage().window().maximize ();
		
		//Se hace la declaración de los elementos que se van a manipular en la interfaz
		WebElement rFC =  driver.findElement(By.id("rfcCD"));
		WebElement nombreEmpresa = driver.findElement(By.id("nomPCD"));
		WebElement apoderadoLegal = driver.findElement(By.id("nomDCD"));
		WebElement telefono = driver.findElement(By.id("telDCD"));
		WebElement email = driver.findElement(By.id("emaCD"));
		WebElement nuevoPass = driver.findElement(By.id("pass1CD"));
		WebElement confirmaPass = driver.findElement(By.id("pass2CD"));
		WebElement privacidad = driver.findElement(By.xpath("//*[@id='formTokenSUCD']/div[11]/div[2]/label/input"));
		
		//Se ingresa la información de la nueva PyME
		rFC.sendKeys("VEL0804298H9");
		nombreEmpresa.sendKeys("Vegetales las Elbas, S.P.R. de C.V.");
		apoderadoLegal.sendKeys("Diego Reyes Casas");
		telefono.sendKeys("5566332299");
		email.sendKeys("vegetales.elba@yopmail.com");
		nuevoPass.sendKeys("Mexico123*");
		confirmaPass.sendKeys("Mexico123*");
		privacidad.click();
		
		//Se presiona el botón para crear la nueva PyME
		WebElement btnRegistrate = driver.findElement(By.xpath("//button[contains(@class, 'btn btn-success btn-uniclick')]"));
		
		btnRegistrate.click();
		Thread.sleep(2500);
		
		//Se valida el mensaje de que no se ha capturado el captcha
		WebElement msgCaptcha = driver.findElement(By.xpath("//*[@class='alerta-captcha']"));
		
		if (msgCaptcha.isDisplayed()) {
			System.out.println("La pagina valida que no se ha capturado el captcha");
		} else {
			System.out.println("No hace la validación del captcha");
		}

	}

}
