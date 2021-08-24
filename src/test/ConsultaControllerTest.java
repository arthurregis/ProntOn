package test;

import org.junit.Test;
import controller.ConsultaController;

public class ConsultaControllerTest {

	ConsultaController consultaController = new ConsultaController();
	
	@Test
	public void addConsulta() {
		consultaController.addConsulta("Soares", "Diego", "12352369875", "10/08/2021", "15:30", "1");
	}
	
	@Test
	public void editarConsulta() {
		consultaController.editarConsulta("Soares", "Diego", "12352369875", "10/08/2021", "14:00", "1", 20);
	}
	
	@Test
	public void removerConsulta() {
		consultaController.removerConsulta(20);
	}
	
}
