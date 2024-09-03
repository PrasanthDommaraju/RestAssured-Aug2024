package week2day2HomeAssignments;

import io.restassured.RestAssured;

public class GetAllIncidents {
	
	public static void main(String[] args) {
		String url="https://dev257390.service-now.com/api/now/table/change_request";
		RestAssured.given()
		           .auth()
		           .basic("admin","Login@snows99$")
		           .log()
		           .all()
		           .when()
		           .get(url)
		           .then()
		           .log()
		           .all();
		
		           
	}

}
