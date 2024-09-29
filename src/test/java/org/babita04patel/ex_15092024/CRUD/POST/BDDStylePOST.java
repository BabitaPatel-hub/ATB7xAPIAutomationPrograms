package org.babita04patel.ex_15092024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDDStylePOST {

    /*
    POST request
    URL - https://restful-booker.herokuapp.com/auth
    Header - Content-Type -> application/json
    Body-Payload-JSON
    {
    "username" : "admin",
    "password" : "password123"
    }
     */

    public static void main(String[] args) {

        //Payload acn be given in 3 ways :
        // - String
        // - Hashmap
        // - Classes......most used in rest assured

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "    }";

        RestAssured.
                given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON)
                    .body(payload)
                .when()
                    .log().all().post()
                .then()
                    .log().all().statusCode(200);
    }
}

