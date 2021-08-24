package test;

import org.junit.Test;

import controller.RecepcionistaController;
import org.junit.*;
public class RecepcionistaControllerTest {
	
	RecepcionistaController recepcionistaController = new RecepcionistaController();
	
	@Test
	public void addrecep() {
		recepcionistaController.addRecep("Jura", "74589856352", "74125412563", "85963574210", "Morada Nova", "Masculino", "biutiful");
	}
	
	@Test
	public void editarRecep() {
		recepcionistaController.editarRecep("Jura", "74589856352", "74125412563", "85963574210", "Morada Nova", "Masculino", "lindo");
	}
	
}
