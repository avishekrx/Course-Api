package definitions;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hiStefDef {
	
	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	Response res;

@Given("^The Client makes call to hi api using GET method$")
public void the_Client_makes_call_to_hi_api_using_GET_method()  {
    // Write code here that turns the phrase above into concrete actions
	
	reqSpec = given().baseUri("http://localhost:8080/");
    
}

@When("^The client calls the api$")
public void the_client_calls_the_api()  {
    // Write code here that turns the phrase above into concrete actions
    res = given().spec(reqSpec).when().get("topics").then().extract().response();
}

@Then("^The client receives success status code of (\\d+)$")
public void the_client_receives_success_status_code_of(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	int statusCode = res.getStatusCode();
	Assert.assertEquals(statusCode, 200);
}


}
