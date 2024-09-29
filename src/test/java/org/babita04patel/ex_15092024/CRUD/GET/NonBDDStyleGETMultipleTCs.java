package org.babita04patel.ex_15092024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGETMultipleTCs {

    static RequestSpecification r = RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("https://api.zippopotam.us");
        test01();
        test02();
    }

    public static void test01()
    {
        r.basePath("/IN/462046");
        r.when().log().all().get();
        r.then().statusCode(200);
    }

    public static void test02()
    {
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(201);
    }

}


