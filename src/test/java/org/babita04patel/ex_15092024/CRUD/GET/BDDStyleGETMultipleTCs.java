package org.babita04patel.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;

public class BDDStyleGETMultipleTCs {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1()
    {
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/380015")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }

    public static void test2()
    {
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/-1")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(404);
    }

}
