package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class ApiSteps {

    Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request(String url) {
        response = given().when().get(url);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatus) {
        assertEquals(expectedStatus.intValue(), response.getStatusCode());
    }
}
