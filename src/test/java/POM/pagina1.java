package POM;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina1 extends funcionesBasicas {

    By listado = By.xpath("//img[@class='ui-search-result-image__element shops__image-element']");
    By BtnOrdenarPor = By.xpath("//button[@aria-label='Más relevantes: Más relevantes']");
    By menuOrdenarPor = By.xpath("//div[@class='andes-floating-menu andes-floating-menu--show']/div[@id=\"tippy-11\"]/div/div/ul/li");
    By btnSiguiente = By.xpath("//span[contains(.,'Siguiente')]");
    
	public pagina1(WebDriver driver) {
		super(driver);
	}
	
	public void ordenarPor() {
		this.click(BtnOrdenarPor);
		List<WebElement> lista = driver.findElements(menuOrdenarPor);
		for(int i=0;i<lista.size();i++) {
			if(i==2) {
				lista.get(i).click();
			}
		}
	}
	
	public void AgregarProducto_alCarro() {
		try {
			ArrayList<String> lstCamisas = new ArrayList<String>();
			
			File file = new File(".\\src\\test\\resources\\archivoFile\\pagina1.txt");//ruta del archivo
			if (!file.exists()) {  // Si el archivo no existe es creado
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 1; i <=48; i++) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(listado));
				driver.findElement(By.xpath("(//li/div/div/div/a)" + "[" + i + "]")).click();

				String url = driver.getCurrentUrl();
				String nombrecamisa = driver.findElement(By.xpath("//h1[contains(@class,'ui-pdp-title')]")).getText();
				String preciocamisa = driver.findElement(By.xpath("(//span[contains(@class,'fraction')])[1]")).getText();

				System.out.println("Nro Camisa: "+i);
				System.out.println("Url: "+url);
				System.out.println("Nombre Camisa: "+nombrecamisa);
				System.out.println("Precio Camisa: "+preciocamisa);
				System.out.println(" ");

                lstCamisas.add("N° Camisa: " + i+"\n"+"Url: " + url+"\n"+"Nombre Camisa: " + nombrecamisa+"\n"+"Precio Camisa: " + preciocamisa+"\n"+"\n"+"");
				driver.navigate().back();
			}
			bw.write(lstCamisas.toString());
			bw.close();
			Thread.sleep(1000);
			this.click(btnSiguiente);
		} catch (Exception e) {

		}
	}
}
