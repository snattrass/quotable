package com.squidstorm.psst;

import com.squidstorm.psst.domain.Quote;
import com.squidstorm.psst.service.QuoteRepository;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@WebAppConfiguration
@ContextConfiguration(classes = PsstApplication.class)
public class TellASecretStepDefs
{
    @Autowired
    QuoteRepository quoteRepository;

    @Given("^the system knows about the following secrets:$")
    public void the_system_knows_about_the_following_secrets(List<Quote> secrets) throws Throwable {
        quoteRepository.save(secrets);
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
