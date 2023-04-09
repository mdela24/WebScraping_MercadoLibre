package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class inicioPage extends funcionesBasicas {
	


	By btnCoockiesBtn= By.xpath("//button[@type='button'][contains(.,'Entendido')]");
	By inputBusqueda= By.xpath("//input[contains(@aria-label,'Ingresa lo que quieras encontrar')]");
	By btnMasTarde = By.xpath("//span[contains(.,'Más tarde')]");
	
	public inicioPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void buscarProducto(String camisasMujeres) {
		this.click(btnCoockiesBtn);
		this.click(btnMasTarde);
		this.sendKeys(inputBusqueda, camisasMujeres+Keys.ENTER);
	}

}
