package step_Definitions;

import io.cucumber.java.en.Given;

public class abc_SetpD {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("abc1");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("abc2");
	}

}
