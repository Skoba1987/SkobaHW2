package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://json-schema.org/draft-07/schema")
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(404);
    }
}
