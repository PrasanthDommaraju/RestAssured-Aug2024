package week2day2HomeAssignments;

import io.restassured.RestAssured;

public class CreateNewIncident {
	
	public static void main(String[] args ) {
		String url="https://dev257390.service-now.com/api/now/table/change_request";
		String requestPayLoad="""
				{
        "short_description": "issue with touch pad",
        "description": "nothing works in my touch pad",
        "urgency": "1",
        "comments": "its an emergency for me"
    }
		""";
		RestAssured.given()
		           .auth()
		           .basic("admin","Login@snows99$")
		           .header("content-Type","application/json")
		           .log()
		           .all()
		           .when()
		           .body(requestPayLoad)
		           .post(url)
		           .then()
		           .log()
		           .all();
	}

}
