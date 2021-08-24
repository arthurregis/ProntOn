package test;

import org.junit.Test;

import controller.PacienteController;

public class PacienteControllerTest {

	PacienteController pacienteController = new PacienteController();
	
	@Test
	public void addPaciente() {
		pacienteController.addPaciente("Karla", "41235263252", "78958632541", "85965965231", "Chorozinho", "Feminino", "20/09/2003", "vava123");
	}
	
	@Test
	public void editarPaciente() {
		pacienteController.editarPaciente("Karla", "41235263252", "78958632541", "85965965231", "Chorozinho", "Feminino", "20/09/2003", "vava321");
	}
	
}
