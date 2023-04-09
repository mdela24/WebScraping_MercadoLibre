package ejecuciones;

import org.openqa.selenium.WebDriver;

import POM.inicioPage;
import POM.pagina1;
import POM.pagina2;

public class objetos {

	protected WebDriver driver = hooks.getDriver();
	protected inicioPage inicio = new inicioPage(driver);
	protected pagina1 productos1 = new pagina1(driver);
	protected pagina2 productos2 = new pagina2(driver);
}
