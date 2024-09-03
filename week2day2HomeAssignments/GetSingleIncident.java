package week2day2HomeAssignments;

import io.restassured.RestAssured;

public class GetSingleIncident {
	
	public static void main (String args[]) {
		String url="https://dev257390.service-now.com/api/now/table/change_request/f5cd3552db252200a6a2b31be0b8f5b2";
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
