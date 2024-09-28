package org.babita04patel;

import io.restassured.RestAssured;

public class Test002 {

    public static void main(String[] args) {

        /*Gherkins syntax
        given() - url, headers, body or payload
        when() - http methods - ge, post, put, patch, delete
        then() - Verify the response - ER == AR
         */
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("booking/:id")
                .when()
                    .get()
                .then()
                    .statusCode(200);


    }
}
