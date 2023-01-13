package com.luafanti;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class HelloTest
{
    @Test
    public void testFunqy() {
        RestAssured.when().get("/hello").then()
                .contentType("application/json")
                .body(equalTo("\"Hello Quarkus Lambda\""));
    }

}
