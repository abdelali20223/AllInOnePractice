package practice.app.api.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Simple {

    @Given("user send the request")
    public void user_send_the_request() {
        Response response = RestAssured.given().accept(ContentType.JSON).when().get("https://fakestoreapi.com/products");

        response.prettyPeek();

    }
    @When("user get the response")
    public void user_get_the_response() {

    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(Integer int1) {

    }
}
