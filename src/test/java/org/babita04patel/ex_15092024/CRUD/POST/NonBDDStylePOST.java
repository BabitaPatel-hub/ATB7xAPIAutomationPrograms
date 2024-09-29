package org.babita04patel.ex_15092024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStylePOST {

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

        //given() - RequestSpecification
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        //when() - Response
        Response response = r.when().log().all().post();

        //then() - ValidatableResponse
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.log().all().statusCode(200);
    }
}

