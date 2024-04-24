package practice.app.api.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class Simple {
    Response response;
    Map <String,Object> postBody = new HashMap<>();
    @Given("user send the request")
    public void user_send_the_request() {
         response = given().accept(ContentType.JSON).when().get("https://fakestoreapi.com/products");



    }
    @When("user get the response")
    public void user_get_the_response() {
        response.prettyPeek();
    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {


        assertEquals(response.statusCode(),statusCode);
    }

    @Given("user store the post data")
    public void user_store_the_post_data() {

       postBody.put("title", "abc") ;
        postBody.put("price", 13.5);
        postBody.put("description", "lorem ipsum set");
                postBody.put("image", "https://i.pravatar.cc");
                postBody.put("category", "electronic");


    }
    @When("user post the data")
    public void user_post_the_data() {

        response = given().accept("application/json").contentType(ContentType.JSON).body(postBody).when().post("https://fakestoreapi.com/products");
        response.prettyPeek();



    }
    @Then("user verify the title is {string}")
    public void user_verify_the_title_is(String title) {

        JsonPath js = response.jsonPath();

        String actual  = js.getString("title");
        assertEquals(actual , title);

    }

}
