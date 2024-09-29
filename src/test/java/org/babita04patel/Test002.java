package org.babita04patel;

import io.restassured.RestAssured;

public class Test002 {

    public static void main(String[] args) {

        System.out.println("Rest Assured testcase");
        System.out.println("GET Request Demo");

        /*Gherkins syntax
        given() - url, headers, body or payload
        when() - http methods - get, post, put, patch, delete
        then() - Verify the response - ER == AR
         */

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/884").log().all()
                .when()
                    .get()
                .then().log().all()
                    .statusCode(200);
    }
}
