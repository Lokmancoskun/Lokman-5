package post;

import Hooks.Hooks;
import Pojos.Todo;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import medunnabaseurl.MedunnaBaseUrl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class passwordChangeDto extends MedunnaBaseUrl {




      /*
                                https://medunna.com/account/password
       {
  "currentPassword": "string",
  "newPassword": "string"
}
                                     currentPassword: 1234567
                                     newPassword: 1234568
    */


    @Test
    public void post() {

        //set the base url

        spec.pathParam("account", "password");

        //set the expected data
        Map<String, String> expectedData = new HashMap<>();

        expectedData.put("currentPassword", "1234567");
        expectedData.put("newPassword", "1234568");


        //sent the post request and get the response
        //when we use authentication, we can use different type of authentication in API. we use authentication which requires username and password
        Response response = given().spec(spec).auth().basic("1234567", "1234568").
                contentType(ContentType.JSON).
                body(expectedData).when().put("/{first}");
        response.prettyPrint();
        //validation
        response.then().statusCode(201);

        //1.way of validation
        Map<String, Object> actualData = response.as(HashMap.class);
        System.out.println("expected data: "+expectedData);
        System.out.println("actual data: "+actualData);

        assertEquals(expectedData.get("currentPassword"),actualData.get("currentPassword") );
        assertEquals(expectedData.get("newPassword"),actualData.get("newPassword") );


        //2.way using JsonPath
        JsonPath json = response.jsonPath();
        assertEquals(expectedData.get("currentPassword"), json.getInt("currentPassword"));
        assertEquals(expectedData.get("newPassword"), json.getString("newPassword"));


        //3.way of validation
        response.then().body("currentPassword", equalTo(expectedData.get("currentPassword"))).
                body("newPassword", equalTo(expectedData.get("newPassword")));


      //  4.validation
        Todo todo = response.as(Todo.class);
        assertEquals(expectedData.get("currentPassword"), todo.getCurrentPassword());
        assertEquals(expectedData.get("newPassword"), todo.getNewPassword());


    }
}














