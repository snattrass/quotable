package com.squidstorm.psst;

import com.squidstorm.psst.domain.Secret;
import com.squidstorm.psst.service.SecretRepository;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.mockito.Mockito.*;


public class TellASecretStepDefs
{
    @Given("^the system knows about the following secrets:$")
    public void the_system_knows_about_the_following_secrets(List<Secret> secrets) throws Throwable {
        SecretRepository repository = mock(SecretRepository.class);
        when(repository.findAll()).thenReturn(secrets);
    }

    @When("^the client requests GET /secrets$")
    public void the_client_requests_GET_secrets() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the response should be JSON$")
    public void the_response_should_be_JSON(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
