import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;

import static io.restassured.RestAssured.*;
//import  static org.hamcrest.matchers.*;
import static org.hamcrest.Matchers.*;

import Files.payload;


public class Basic_APITesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//given  : all input details
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").
		header("Content-Type","application/json")
		.body(payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200)
		.body("scope",equalTo("APP"))
		.header( "server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println("The value of Response is "+response);
		
		JsonPath js = new JsonPath(response);
		String placeid =js.getString("place_id");
		System.out.println("The valie of verison is" + placeid);
		
		//Update Place
		
		given().log().all().queryParam("key", "qaclick123").
		header("Content-Type","application/json")
		.body()
		
		//java script object notation path is  a class which take string as input and convert it into the JSON 
		
		//)
		
		
		
		
		
		//when  :Submit API let mentioning the Http Methods
	
		
		
		
		
		//then : Validation we are doing in then (Validate the Process

	}

}
