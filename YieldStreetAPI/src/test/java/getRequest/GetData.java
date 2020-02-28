package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetData {
	
	@Test
	public void testResponsecode() {
		
	Response resp	= RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=ab92f61fd86e6edef7e95eeb71545995");

	int code = resp.getStatusCode();
	
	Assert.assertEquals(code, 200);
	 
	}

}
