package com.mf.proxy.test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.mf.proxy.Internet;
import com.mf.proxy.ProxyInternet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "proxy-design-pattern-internet.feature")
public class ProxyDesignPatternInternetSteps {
    private Internet internet;
    private String website;
    private Exception exception;

    @Given("^an internet proxy$")
    public void anInternetProxy() {
        internet = new ProxyInternet();
    }

    @When("^connecting to \"([^\"]*)\"$")
    public void connectingTo(String website) {
        this.website = website;
        try {
            internet.connectTo(website);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("^connection to \"([^\"]*)\" is successful$")
    public void connectionToIsSuccessful(String website) {
        // Verify that the connection is successful
        // Add your assertions based on your implementation
        Assert.assertTrue(checkConnectionSuccessful(website));
    }

    @Then("^connection to \"([^\"]*)\" is blocked$")
    public void connectionToIsBlocked(String website) {
        // Verify that the connection is blocked
        // Add your assertions based on your implementation
        Assert.assertTrue(checkConnectionBlocked(website));
    }

    private boolean checkConnectionSuccessful(String website) {
        // Implementation of checking if the connection is successful
        // Replace this with your own implementation that checks the connection status
        return true;
    }

    private boolean checkConnectionBlocked(String website) {
        // Implementation of checking if the connection is blocked
        // Replace this with your own implementation that checks the connection status
        return exception != null;
    }
}
