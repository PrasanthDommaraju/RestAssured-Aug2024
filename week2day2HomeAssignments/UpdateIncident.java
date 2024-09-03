package week2day2HomeAssignments;

import io.restassured.RestAssured;

public class UpdateIncident {
	
	public static void main(String[] args) {
		String url="https://dev257390.service-now.com/api/now/table/change_request/373ae0238314121022909b80deaad3b6";
		String updatePayLoad="""
				{
        "short_description": "issue with touch pad-getting resolved",
        "description": "nothing works in my touch pad-some features work now",
        "urgency": "3",
        "comments": "important for me"
    }
				""";
		RestAssured.given()
		           .auth()
		           .basic("admin","Login@snows99$")
		           .header("content-Type","application/json")
		           .log()
		           .all()
		           .when()
		           .body(updatePayLoad)
		           .patch(url)
		           .then()
		           .log()
		           .all();
		
	}

}
