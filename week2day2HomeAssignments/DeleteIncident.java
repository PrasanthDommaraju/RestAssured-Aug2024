package week2day2HomeAssignments;

import io.restassured.RestAssured;

public class DeleteIncident {
	
	public static void main(String[] args) {
		String url="https://dev257390.service-now.com/api/now/table/change_request/373ae0238314121022909b80deaad3b6";
		RestAssured.given()
		           .auth()
		           .basic("admin","Login@snows99$")
//		           .header("content-Type","application/json")
		           .log()
		           .all()
		           .when()
		           .delete(url)
		           .then()
		           .log()
		           .all()
		           .assertThat()
		           .statusCode(204);
		 
	}

}
