package org.babita04patel.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class NonBDDStyleGET {

    public static void main(String[] args) {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/380015");
        r.when().log().all().get();
        r.then().log().all().statusCode(201);
    }
}
