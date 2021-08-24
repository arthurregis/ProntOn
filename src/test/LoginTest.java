package test;

import org.junit.Test;
import controller.LoginController;

public class LoginTest {
	
	LoginController loginController = new LoginController();
	
	@Test
	public void loginUser() {
		loginController.loginUser("Cleiton", "americaninha123");
	}
	
}
