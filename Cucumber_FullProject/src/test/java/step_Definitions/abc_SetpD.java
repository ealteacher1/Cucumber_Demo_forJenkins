package step_Definitions;

import io.cucumber.java.en.Given;

public class abc_SetpD {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("************************-----------------------abc tag---------------------------******************************");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("************************-----------------------abc tag---------------------------******************************");
	}
	
	@Given("I want to write a step with precondition {int}")
	public void i_want_to_write_a_step_with_precondition(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("************************-----------------------DEF tag---------------------------******************************");
	}

	@Given("some other precondition {int}")
	public void some_other_precondition(Integer int1) {
		   System.out.println("************************-----------------------DEF tag---------------------------******************************");
	}


}
