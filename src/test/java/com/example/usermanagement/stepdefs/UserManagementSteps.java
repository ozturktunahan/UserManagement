package com.example.usermanagement.stepdefs;

import com.example.usermanagement.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class UserManagementSteps {

    private User user;

    @Given("a user with ID {string} and name {string}")
    public void a_user_with_id_and_name(String id, String name) {
        if(id.isEmpty()){
            id = null;
        }
        if(name.isEmpty()){
            name = null;
        }
        user = new User(id, name);
    }

    @When("the user is processed")
    public void the_user_is_processed() {
        // Mock processing
        System.out.println("Processing user: " + user);
    }

    @Then("the user should be successfully processed")
    public void the_user_should_be_successfully_processed() {
        // Mock verification
        System.out.println("User successfully processed: " + user);
        assertNotNull(user.getId());
        assertNotNull(user.getName());
    }

    @Then("the user's name should be {string}")
    public void the_user_s_name_should_be(String expectedName) {
        assertEquals(expectedName, user.getName());
    }

    @Then("the user should not be successfully processed")
    public void the_user_should_not_be_successfully_processed() {
        // Mock verification fail
        System.out.println("User should not be successfully processed: " + user);
        /*assertNull(user.getId());
        assertNull(user.getName());*/
        assertTrue("ID or name should be null", user.getId() == null || user.getName() ==null);
    }
}
