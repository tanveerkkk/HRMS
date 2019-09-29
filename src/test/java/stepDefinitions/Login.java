package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Login {

	@Given("^User Open the Application$")
	public void user_Open_the_Application() throws Throwable {
		System.out.println("hello");
	}

	@And("^Login Into Application$")
	public void login_Into_Application() throws Throwable {
		System.out.println("Tanveer");
	}
	
	

}
