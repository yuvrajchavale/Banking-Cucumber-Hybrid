package primusStepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.BankFunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrimusStepDefination {

	public static WebDriver driver;

	@Given("launch browser with this url {string}")
	public void launch_browser_with_this_url(String url) {
	    BankFunctionLibrary.openUrl(url);
	}

	@Then("wait for text with {string} and {string}")
	public void wait_for_text_with_and(String Ltype, String Lvalue) {
	    BankFunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}

	@When("enter the {string} with {string} and {string}")
	public void enter_the_with_and(String TestData,String Ltype, String Lvalue) {
	    BankFunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("click on login button with {string} and {string}")
	public void click_on_login_button_with_and(String Ltype, String Lvalue)
	
	{BankFunctionLibrary.clickAction(Ltype, Lvalue);
	   
	}

	@Then("wait for logout button with {string} and {string}")
	public void wait_for_logout_button_with_and(String Ltype, String Lvalue) {
		BankFunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	  
	}

	@When("click on logout button with {string} and {string}")
	public void click_on_logout_button_with_and(String Ltype, String Lvalue) {
		BankFunctionLibrary.clickAction(Ltype, Lvalue);
	   
	}

	@Then("close browser")
	public void close_browser() {
		BankFunctionLibrary.closeBrowser();
	    
	}



}
