import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class AddBook {
	
	
	@Test
	public void addBook() {
		
		RestAssured.baseURI = "http://216.10..245.166";
		given().header("Content-Type","application/json").
		body() 
		
		
	}

}
