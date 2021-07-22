package BaseClass;

import static io.restassured.RestAssured.given;

import java.util.Map;

public class baseclass {


	public static void getrespbody(String url , final Map<String, String> requestParam) {
		
		given().log().all().queryParam(String.valueOf(requestParam))
		.when().get(url).
		then().log()
		.all().extract();
	}
	
	public static void postRequest(String requestBody) {
		given().log().all().body(requestBody)
		.when().post().
		then().log()
		.all().extract();
	}
	
	public static void putRequest(String requestBody2) {
		given().log().all().body(requestBody2)
		.when().put().
		then().log()
		.all().extract();
	
	}
	public static void PatchRequest(String requestBody3) {
		given().log().all().body(requestBody3)
		.when().patch().
		then().log()
		.all().extract();
	}
	
}
