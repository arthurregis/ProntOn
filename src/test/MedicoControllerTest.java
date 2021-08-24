package test;

import org.junit.Test;

import controller.MedicoController;

public class MedicoControllerTest {
	
	MedicoController medicoController = new MedicoController();
	
	@Test
	public void addMedico() {
		medicoController.addMedico("Davi", "Maia", "quixada", "86965687542", "89659632547", "dashshi", "Masculino", "78541236523", "Clinico Geral", "Clinica");
	}
	
	@Test
	public void editarMedico() {
		medicoController.editarMedico("Davi", "Maia", "quixada", "86965687542", "89659632547", "dashshu", "Masculino", "78541236523", "Pediatra", "clinica");
	}
	
}
