package test;

import org.junit.Test;
import controller.AdmController;

public class AdmControllerTest {
	
	AdmController admController = new AdmController();
	
	@Test
	public void editarPessoa() {
		admController.editarPessoa("Cleiton", "Santos", "Vila requeijão", "85996568574", "86596585630", "americaninha123", "Masculino", "06/12/1999", "12352362578");
	}
	
	@Test
	public void removerPessoa () {
		admController.removerPessoa("86596585630");
	}

}
