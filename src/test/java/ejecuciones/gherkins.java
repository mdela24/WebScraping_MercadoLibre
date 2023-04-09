package ejecuciones;

import cucumber.api.java.en.Given;

public class gherkins extends objetos{
	
	
	@Given("^buscamos camisas de mujeres \"(.*?)\" en la casilla de busqueda$")
	public void buscamos_camisas_de_mujeres_en_la_casilla_de_busqueda(String camisasMujeres) throws Throwable {
		inicio.buscarProducto(camisasMujeres);
	}
	
	@Given("^agremos los productos de la primera hoja al carro de compras$")
	public void agremos_los_productos_de_la_primera_hoja_al_carro_de_compras() throws Throwable {
		productos1.ordenarPor();
		productos1.AgregarProducto_alCarro();
		productos2.ordenarPor();
		productos2.AgregarProducto_alCarro();
	}

	

}
