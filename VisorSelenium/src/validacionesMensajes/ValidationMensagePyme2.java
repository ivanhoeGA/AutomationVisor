package validacionesMensajes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMensagePyme2 {

	public static void main(String[] args) throws InterruptedException {
		// Se genera el navegador para acceder
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(450, TimeUnit.SECONDS);
		driver.navigate().to("http://bancomext.visor.io/login/bancomext");
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Se ingresa en el aplicativo para acceder a la Etapa1de la Pyme
		WebElement email = driver.findElement(By.id("emaIndex"));
		WebElement password = driver.findElement(By.id("pswIndex"));
		WebElement passButton = driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']"));

		email.sendKeys("selenium.qa@yopmail.com");
		password.sendKeys("Mexico123*");
		passButton.click();
		Thread.sleep(300);

		// Se valida el mensaje de la comprobación de datos
		WebElement messageLabel1 = driver.findElement(By.xpath("//*[text()= 'Estamos realizando las consultas necesarias en fuentes públicas para agilizar tu registro electrónico.']"));

		if (messageLabel1.isDisplayed()) {
			System.out.println("Muestra correctamente el mensaje de comprobación de datos");
		} else {
			System.out.println("No muestra el mensaje de los campo obligatorios");
		}
		
		// Se valida el mensaje de la notificación al usuario
		WebElement messageLabel2 = driver.findElement(By.xpath("//*[text()= 'Una vez concluidas dichas consultas te haremos llegar un correo electrónico.']"));

		if (messageLabel2.isDisplayed()) {
			System.out.println("Muestra correctamente el mensaje de notificación al usuario");
		} else {
			System.out.println("No muestra el mensaje de la notificación al usuario");
		}
		
		
		

	}

}
