package practice.app.api.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class Simple {
    Response response;
    @Given("user send the request")
    public void user_send_the_request() {
         response = RestAssured.given().accept(ContentType.JSON).when().get("https://fakestoreapi.com/products");



    }
    @When("user get the response")
    public void user_get_the_response() {
        response.prettyPeek();
    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {


        Assert.assertEquals(response.statusCode(),statusCode);
    }
}
